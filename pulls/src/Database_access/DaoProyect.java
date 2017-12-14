/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_access;

import Logic.Proyect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
    
    public int guardarProyecto(Proyect proyect){
        
        String sql_guardar;
        int numFilas=0;

        sql_guardar="insert into proyectos values (nextval('proyectos_seq'), '"+
                proyect.getName() + "', '" + proyect.getDescription() +  "', '" +
                proyect.getDirectorCode() + "', 'Activo')";
        
        //"insert into proyectos values (nextval('serial'),'dasd','dasdqwe','1629869')";
       
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();JOptionPane.showMessageDialog(null, "sfasd");
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
    
    public int editarProyecto(Proyect proyect,int code, String nombre){
        String sql_select;
        int numFilas=0;
        String sqlUp=" ";
        sql_select="UPDATE proyectos SET"
                + " estado = '"+ proyect.getState() +"', "
                + " id_proyecto = '"+ proyect.getId()+"', "
                + " nombre_proyecto = '"+proyect.getName()+"', "
                + " descripcion = '"+proyect.getDescription()+"', "
                + " codigo_director ='"+proyect.getDirectorCode()+"' "
                + " WHERE id_proyecto = '" + code + "' AND nombre_proyecto = '"+nombre+"'";
        
 
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
    
     public DefaultComboBoxModel getValue(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Selecciona Proyecto");
        String sql_select;
        sql_select="SELECT nombre_proyecto FROM  proyectos";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                modelo.addElement(tabla.getString(1));
            }
            tabla.close();
            sentencia.close();
          
         }
         catch(Exception e){ System.out.println(e);}
         return modelo;     
    }
     
     public void MostrarDatos(Proyect proyect,String number,String nombre){
        String sql_select;
        
        sql_select="SELECT * FROM proyectos"
                + " WHERE id_proyecto = '"+number+"' and nombre_proyecto = '"+nombre+"'";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                proyect.setId(tabla.getInt(1));
                proyect.setName(tabla.getString(2));
                proyect.setDescription(tabla.getString(3));
                proyect.setDirectorCode(tabla.getInt(4));
                proyect.setState(tabla.getString(5));
            }
            
            
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         
    }
     
     public void consultarMiembroProyecto(DefaultTableModel model,int code){
    	Proyect proyect= new Proyect();
        String sql_select;
        sql_select="SELECT nombre_usuario,nombre_proyecto FROM  usuario"
                + " INNER JOIN proyectos ON proyectos.nombre_proyecto=usuario.proyecto"
                + " WHERE proyectos.id_proyecto = '"+code+"'";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
           
            ResultSet tabla = sentencia.executeQuery(sql_select);
            //JOptionPane.showMessageDialog(null, sql_select);
            
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
     
}
