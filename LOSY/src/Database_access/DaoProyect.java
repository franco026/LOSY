/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_access;

import Logic.Equipment;
import Logic.Proyect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author famil
 */
public class DaoProyect {
    
    FacadeBD fachada;

    public DaoProyect() {
        fachada = new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }
    
    public void consultarProyecto(DefaultTableModel model){
    	Equipment p= new Equipment();
        String sql_select;
        sql_select="SELECT id_proyecto, nombre_proyecto FROM  proyectos";// Where nombre_equipo LIKE '" + indi + "%'";
       
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
    
    public void consultarProyecto2(DefaultTableModel model, String cons){
    	Equipment p= new Equipment();
        String sql_select;
        sql_select="SELECT * FROM  proyectos Where id_proyecto = '" + cons + "'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                //obtener los datos y almacenar las filas
		Object[] fila = new Object[4];
		//llenar cada columna con lo datos almacenados
		for (int i = 0; i < 4; i++)
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
    
    public int guardarProyecto(Proyect p){
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO proyectos (nombre_proyecto, descripcion, codigo_director) VALUES ('" +
                p.getName() + "', '" + p.getDescription() +  "', '" +
                p.getDirectorCode() + "')";
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
    
    public int editarProyecto(int estado, String ev){
        String sql_select;
        int numFilas=0;
        String sqlUp=" ";
        sql_select="UPDATE equipos SET estado = "+ estado+
                " WHERE numero_equipo = '" + ev + "'";
        
        System.out.print("SQL = "+ sqlUp);
        //JOptionPane.showMessageDialog(null, sqlUp);
       try{
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
    
}
