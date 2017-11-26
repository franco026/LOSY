package Database_access;

import java.sql.*;
import java.util.Vector;

import Logic.Equipment;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DaoEquipment {

    FacadeBD fachada;

    public DaoEquipment() {
        fachada = new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    public int insertequipment(Equipment equipment) {
        String sql;
        int numFilas = 0;

        sql = "INSERT INTO Equipos VALUES ('"
                + equipment.getNumeroEquipo() + "', '" + equipment.getEquipmentname() + "', '"
                + equipment.getMake() + "', '" + equipment.getDescription() + "', '"
                + equipment.getState() + "'"
                + ")";
        try {
            Connection conx = fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            return numFilas;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;

    }
    
    public void consultarEquipo(DefaultTableModel model){
    	Equipment p= new Equipment();
        String sql_select;
        sql_select="SELECT * FROM  equipos";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[5];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 5; i++)
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

    public Vector<String> telldata() {
        String sql;
        sql = "SELECT nombre_equipo FROM Equipos";
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet resultSet = sentencia.executeQuery(sql);

            Vector<String> list = new Vector<String>();

            do {
                list.addElement(resultSet.getString(1));
            } while (resultSet.next());
            return list;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
