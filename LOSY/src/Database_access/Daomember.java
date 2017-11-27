package Database_access;

import Logic.Member;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Daomember {

    FacadeBD fachada;

    public Daomember() {
        fachada = new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    public int Savemember(Member datamember) {
        String sql;
        int numFilas = 0;

        sql = "INSERT INTO usuario VALUES ('"
                + datamember.getCode() + "', '" + datamember.getName() + "', '"
                + datamember.getLastName() + "', '" + datamember.getPosition() + "', '"
                + datamember.getEmail() + "', '" + datamember.getAnswer() + "', '"
                + datamember.getPhone() + "', '" + datamember.getDocument() + "', '"
                 + "'"
                + ")";
        try {
            Connection conx = fachada.getConnetion();
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            return numFilas;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public int SaveAccount(Member datamember) {
        String sql;
        int numFilas = 0;

        sql = "INSERT INTO Cuenta VALUES ('"
                + datamember.getCode() + "', '" + datamember.getPassword() + "' "
                + ")";
        try {
            Connection conx = fachada.getConnetion();
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            return numFilas;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public void consultarMiembro(DefaultTableModel model){
    	Member p= new Member();
        String sql_select;
        sql_select="SELECT * FROM  usuario";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[9];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 9; i++)
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
        Member member = new Member();
        String sql;
        sql = "SELECT * FROM Cuenta WHERE codigo_usuario='" + code + "'";
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while (tabla.next()) {

                member.setCode(tabla.getInt(1));
                member.setPassword(tabla.getString(2));
            }
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
        Member member = new Member();
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
            return member.getPosition();

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
