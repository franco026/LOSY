package Database_access;

import java.sql.*;
import java.util.Vector;

import Logic.Equipment;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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

        sql = "INSERT INTO Equipos VALUES (nextval('equipos_seq'), "
                + "'" + equipment.getEquipmentName() + "', '"
                + equipment.getMake() + "', '" + equipment.getDescription() + "', '"
                + equipment.getState() + "', 'Activo'"
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
        sql_select="SELECT numero_equipo, nombre_equipo FROM  equipos";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[2];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 2; i++)
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
    
    public void consultarEquipo2(DefaultTableModel model, String cons){
    	Equipment p= new Equipment();
        String sql_select;
        int estado=0;
        sql_select="SELECT * FROM  equipos Where numero_equipo = '" + cons + "'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[6];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 6; i++)
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
    
     public Equipment MostrarDatos(Equipment equipment,String number,String nombre){
        String sql_select;
        
        sql_select="SELECT * FROM equipos "
                + " WHERE numero_equipo = '"+number+"' and nombre_equipo = '"+nombre+"'";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                equipment.setNumeroEquipo(tabla.getInt(1));
                equipment.setEquipmentName(tabla.getString(2));
                equipment.setMake(tabla.getInt(3));
                equipment.setDescription(tabla.getString(4));
                equipment.setState(tabla.getString(5));
                equipment.setStateequipment(tabla.getString(6));
            }
            
            tabla.close();
            sentencia.close();
            return equipment;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return equipment;
    }

    
    public int editarEquipo(Equipment equipment){
        String sql_select;
        int numFilas=0;
        String sqlUp=" ";
        sql_select="UPDATE equipos SET estado = '"+ equipment.getState()+
                "' WHERE numero_equipo = '" + equipment.getNumeroEquipo() + "'";
        
       try{
            //JOptionPane.showMessageDialog(null, sqlUp);
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);    
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
    
     public int modificar(Equipment equipment,int numero,String nombre){
        String sql_select;
        int numFilas=0;
        
        sql_select="UPDATE equipos  SET "
                + "numero_equipo = '"+equipment.getNumeroEquipo()+"', "
                + "nombre_equipo = '"+equipment.getEquipmentName()+"', "
                + "marca = '"+equipment.getMake()+"', "
                + "descripcion = '"+equipment.getDescription()+"', "
                + "estado = '"+equipment.getStateequipment()+"', "
                + "estado_equipo = '"+equipment.getState()+"' "
                +" WHERE numero_equipo = '"+ numero + "' and nombre_equipo = '"+nombre+"'";// Where nombre_equipo LIKE '" + indi + "%'";
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

}
