package Database_access;

import Logic.Member;
import java.sql.*;

public class Daomember {

    FacadeBD fachada;

    public Daomember(){
        fachada= new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    public int Savemember(Member datamember){
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

    public int SaveAccount(Member datamember){
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
        Member member= new Member();
        String sql;
        sql="SELECT * FROM Cuenta WHERE codigo_usuario='" + code +"'";
        try{
            Connection conx= fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while(tabla.next()){

                member.setCode(tabla.getInt(1));
                member.setPassword(tabla.getString(2));
            }
            if(member.getCode()==code && member.getPassword().equals(password)){
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
        Member member= new Member();
        String sql;
        sql="SELECT * FROM usuario WHERE codigo='" + code +  "'" ;
        try{
            Connection conx= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conx.createStatement();
            ResultSet potision = sentencia.executeQuery(sql);
            while(potision.next()){
                member.setPosition(potision.getString(4));
            }
            return member.getPosition();

        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }

        return null;
    }


}
