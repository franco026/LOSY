package Database_access;

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

        sql_guardar="INSERT INTO usuario (codigo, nombre_usuario, apellido, cargo, correo, proyecto, telefono, cedula) VALUES ('"
                + p.getCode() + "', '" + p.getName() + "', '"
                + p.getLastName() + "', '" + p.getPosition() + "', '"
                + p.getEmail() + "', '" + p.getProyect() + "', '"
                + p.getPhone() + "', '" + p.getDocument() + "'"
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
    
    public boolean check_account(String password, int code) {
        User member = new User();
        String sql;
        sql = "SELECT codigo_usuario, password FROM cuenta WHERE codigo_usuario='" + code + "'";
        //JOptionPane.showMessageDialog(null, password+" "+code);
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {
                member.setCode(tabla.getInt(1));
                member.setPassword(tabla.getString(2));
                
            }
            //JOptionPane.showMessageDialog(null, member.getCode()+ " "+ member.getPassword());
            if (member.getCode() == code && member.getPassword().equals(password)) {
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

    public String check_position(String password, int code) {
        User member = new User();
        member.setCode(code);
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

}
