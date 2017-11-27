package Database_access;

import Logic.User;
import java.sql.*;

public class DaoUser {

    private FacadeBD fachada;

    public DaoUser(){
        fachada= new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    public int Savemember(User datamember){
        String sql;
        int numFilas=0;

        sql="INSERT INTO Usuario VALUES ('" +
                datamember.getCode() +  "', '" +datamember.getName() +  "', '" +
                datamember.getLastName() + "', '" + datamember.getPosition() + "', '" +
                datamember.getEmail()    +  "', '" +datamember.getAnswer() +  "', '" +
                datamember.getPhone() +  "', '" +  datamember.getDocument() +  "', '" +
                datamember.getProyect() +"'"+
                ")";
        try{
            Connection conx= fachada.getConnetion();
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            return numFilas;

        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public int SaveAccount(User datamember){
        String sql;
        int numFilas=0;

        sql="INSERT INTO Cuenta VALUES ('" +
                datamember.getCode() +  "', '" +datamember.getPassword() + "' " +
                ")";
        try{
            Connection conx= fachada.getConnetion();
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            return numFilas;

        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public boolean check_account(String password,int code){
        User user = new User();
        String sql;
        sql="SELECT * FROM Cuenta WHERE codigo_usuario='" + code +"'";
        try{
            Connection conx= fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while(tabla.next()){

                user.setCode(tabla.getInt(1));
                user.setPassword(tabla.getString(2));
            }
            if(user.getCode()==code && user.getPassword().equals(password)){
                    return true;
            }else{
                return false;
            }

        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

        return false;
    }


    public String check_position(String password,int code){
        User user = new User();
        String sql;
        sql="SELECT * FROM usuario WHERE codigo='" + code +  "'" ;
        try{
            Connection conx= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conx.createStatement();
            ResultSet potision = sentencia.executeQuery(sql);
            while(potision.next()){
                user.setPosition(potision.getString(4));
            }
            return user.getPosition();

        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

        return null;
    }

    public User readUser(int code){
        User user= new User();
        String sql_select;
        sql_select="SELECT * FROM  usuario WHERE codigo='" + code +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while(tabla.next()){

                user.setCode(tabla.getInt(1));
                user.setName(tabla.getString(2));
                user.setLastName(tabla.getString(3));
                user.setPosition(tabla.getString(4));
                user.setEmail(tabla.getString(5));
                user.setAnswer(tabla.getString(6));
                user.setPhone(tabla.getInt(7));
                user.setDocument(tabla.getInt(8));

                System.out.println("ok");
            }

            return user;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return null;
    }

    public User deleteUser(int code){
        User user= new User();
        String sql_delete;
        sql_delete="DELETE FROM usuario WHERE codigo='" + code +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_delete);

            return user;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return null;
    }

    public int updateUser(User user){
        String sql_Up;
        int numFilas=0;

        sql_Up="UPDATE usuario SET nombre_usuario = '" + user.getName() +  "' , apellido = " + user.getLastName() +
                "' , cargo = " + user.getPosition() + "' , correo = "  +user.getEmail()+ "' , respuesta = "+user.getAnswer()+
                "' , telefono = "+user.getPhone()+"' , cedula = " +user.getDocument()+ " WHERE codigo = '" + user.getCode() + "' ;" ;

        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_Up);
            System.out.println("up " + numFilas);
            return numFilas;

        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return -1;
    }

}
