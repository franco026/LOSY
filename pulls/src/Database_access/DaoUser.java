package Database_access;

import Logic.Equipment;
import Logic.User;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DaoUser {

    FacadeBD fachada;

    public DaoUser() {
        fachada = new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }
    
    public int guardarUsuario(User p){
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO usuario (codigo, nombre_usuario, apellido, cargo, correo, proyecto, telefono, cedula,estado) "
                + "VALUES ('"
                + p.getCode() + "', '" + p.getName() + "', '"
                + p.getLastName() + "', '" + p.getPosition() + "', '"
                + p.getEmail() + "', '" + p.getProyect() + "', '"
                + p.getPhone() + "', '" + p.getDocument() + "', '"
                + "Activo'"
                + ")";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            
            numFilas = sentencia.executeUpdate(sql_guardar);            
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

    public int SaveAccount(User datamember) {
        String sql;
        int numFilas = 0;

        sql = "INSERT INTO Cuenta VALUES ('"
                + datamember.getCode() + "', '" + datamember.getPassword() + "' "
                + ")";
        try {
            Connection conx = fachada.getConnetion();
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            conx.close();
            return numFilas;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public void consultarMiembro(DefaultTableModel model){
    	User p= new User();
        String sql_select;
        sql_select="SELECT codigo, nombre_usuario, apellido FROM  usuario";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[3];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 3; i++)
                    fila[i] = tabla.getObject(i + 1);
		//cargar los datos en filas a la tabla modelo
		    model.addRow(fila);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
    
    public void consultarMiembro2(DefaultTableModel model, String cons){
    	User p= new User();
        String sql_select;
        
        sql_select="SELECT codigo, nombre_usuario, apellido, cargo, correo, proyecto, telefono, cedula "
                + "FROM  usuario WHERE codigo= '"+ cons + "'";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[8];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 8; i++)
                    fila[i] = tabla.getObject(i + 1);
		//cargar los datos en filas a la tabla modelo
		    model.addRow(fila);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
    
      public void MostrarDatos(int code,User user){
        String sql_select;
        
        sql_select="SELECT * "
                +  " FROM usuario inner join cuenta on cuenta.codigo_usuario=usuario.codigo"
                + " WHERE codigo= '"+ code + "'";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
                user.setProyect(tabla.getString(6));
                user.setQuestion(tabla.getString(7));
                user.setAnswer(tabla.getString(8));
                user.setPhone(tabla.getInt(9));
                user.setDocument(tabla.getInt(10));
                user.setState(tabla.getString(11));
                user.setPassword(tabla.getString(13));
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         
    }
    
    public boolean check_account_code(String password, int code) {
        User member = new User();
        String sql;
        sql = "SELECT codigo_usuario, password, estado FROM cuenta "
            + " INNER JOIN usuario on usuario.codigo=cuenta.codigo_usuario "
            + " WHERE codigo_usuario='" + code + "'";
        
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            
            while (tabla.next()) {
                member.setCode(tabla.getInt(1));
                member.setPassword(tabla.getString(2));
                member.setState(tabla.getString(3));
                
            }
            
           
            if ((member.getCode() == code&& member.getPassword().equals(password))&&member.getState().equals("Activo")) {
                return true;
                } else {
                 return false;
                }
                
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
    
    
    
    public boolean check_account_email(String password, String email) {
        User member = new User();
        
        String sql;
        sql = "SELECT correo, password FROM usuario "
              +"INNER JOIN cuenta on cuenta.codigo_usuario=usuario.codigo"
                + " WHERE correo='" + email + "'";
        //JOptionPane.showMessageDialog(null, password+" "+email);
        try {
            
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            
            while (tabla.next()) {
                member.setEmail(tabla.getString(1));
                member.setPassword(tabla.getString(2));
            }
            //JOptionPane.showMessageDialog(null, member.getCode()+ " "+ member.getPassword());
            if (member.getEmail().equals(email) && member.getPassword().equals(password)) {
                return true;
                } else {
                 return false;
                }
         
                
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public String check_position_code(int code) {
        User member = new User();
        String sql;
        sql = "SELECT * FROM usuario WHERE codigo='" + code + "'";
        try {
            Connection conx = fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conx.createStatement();
            ResultSet potision = sentencia.executeQuery(sql);
            while (potision.next()) {
                member.setPosition(potision.getString(4));
            }
            //JOptionPane.showMessageDialog(null, member.getPosition());
            return member.getPosition();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
    public String check_position_email(String email) {
        User member = new User();
        String sql;
        sql = "SELECT * FROM usuario WHERE correo='" + email + "'";
        try {
            Connection conx = fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conx.createStatement();
            ResultSet potision = sentencia.executeQuery(sql);
            while (potision.next()) {
                member.setPosition(potision.getString(4));
            }
            //JOptionPane.showMessageDialog(null, member.getPosition());
            return member.getPosition();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    
    public int return_code(String account) {
        User member = new User();
        String sql;
        sql = "SELECT codigo FROM usuario WHERE correo='" + account + "'";
        try {
            Connection conx = fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conx.createStatement();
            ResultSet potision = sentencia.executeQuery(sql);
            while (potision.next()) {
                member.setCode(potision.getInt(1));
            }
            //JOptionPane.showMessageDialog(null, member.getPosition());
            return member.getCode();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return 0;
    }
    
    public int modificar(User user,int code){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE usuario  SET "
                + "codigo = '"+user.getCode()+"',"
                + "respuesta = '"+user.getAnswer()+"', "
                + "nombre_usuario = '"+user.getName()+"', "
                + "apellido = '"+user.getLastName()+"', "
                + "cargo = '"+user.getPosition()+"', "
                + "proyecto = '"+user.getProyect()+"', "
                + "telefono = '"+user.getPhone()+"', "
                + "cedula = '"+user.getDocument()+"', "
                + "pregunta = '"+user.getQuestion()+"', "
                + "estado = '"+user.getState()+"' "
                +" WHERE codigo = '"+ code + "'";// Where nombre_equipo LIKE '" + indi + "%'";
        
         try{
          
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);
            
            return numFilas;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return -1;
         
    }
    
    public int new_password(User user,int oldcode){
        String sql_select;
        int numFilas=0;
        sql_select="UPDATE cuenta  SET "
                + "password = '"+user.getPassword()+"' "
                +" WHERE codigo_usuario = '"+ oldcode + "'";// Where nombre_equipo LIKE '" + indi + "%'";
        
         try{
          
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);
            
            return numFilas;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return -1;
         
    }
    
    public boolean check_code( int code) {
        User member = new User();
        String sql;
        sql = "SELECT codigo_usuario,estado FROM cuenta "
            + " INNER JOIN usuario on usuario.codigo=cuenta.codigo_usuario "
            + " WHERE codigo_usuario='" + code + "'";
        
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            
            while (tabla.next()) {
                member.setCode(tabla.getInt(1));
                member.setState(tabla.getString(2));
                
            }
            
           
            if ((member.getCode() == code)&&member.getState().equals("Activo")) {
                return true;
                } else {
                 return false;
                }
                
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
    
    
    
   

}
