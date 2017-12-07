package Database_access;

import Logic.Loan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DaoPrestamo {
    FacadeBD fachada;
    
    
    public DaoPrestamo() {
        fachada = new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }
    
     public void consultarPrestamo(DefaultTableModel model){//Pendiente Editar
    	Loan p= new Loan();
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
    
    public void consultarPrestamo2(DefaultTableModel model, String cons){//Pendiente Editar
    	Loan p= new Loan();
        String sql_select;
        sql_select="SELECT * FROM  equipos Where numero_equipo = '" + cons + "'";
       
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
    
    public int guardarPrestamo(Loan p){
        String sql_guardar;
        int numFilas=0;
        //JOptionPane.showMessageDialog(null,p.getCodigoUser()+" "+p.getNumeroEquipo()+" "+ p.getMarca());
        sql_guardar="INSERT INTO prestamo (codigo_usuario, numero_equipo, marca, fecha_prestamo, fecha_devolucion) VALUES ('" +
                p.getCodigoUser()+ "', '" + p.getNumeroEquipo() +  "', '" + p.getMarca() + "', '"+p.getFechaPrestamo()+"', '"+p.getFechaDevolucion()+"' )";
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
    
    public int editarPrestamo(String estado, String ev){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        String sqlUp=" ";
        sql_select="UPDATE equipos SET estado = '"+estado+"'"+
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
