package Database_access;

import Logic.Fine;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DaoFine {

    private FacadeBD fachada;

    public DaoFine(){
        fachada= new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    public int saveFine(Fine fine,int idprestamo){
        String sql_save;
        int numFilas=0;

        sql_save="INSERT INTO multa VALUES (nextval('multa_seq'), '" +
                fine.getUserCode() + "', '" + fine.getValue() + "', 'Sin pagar', '"+idprestamo+"')";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_save);
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
    }//fin

    public void readFine(DefaultTableModel model){
        Fine fine= new Fine();
        String sql_select;
        sql_select=" SELECT id, codigo_usuario,nombre_usuario,id_prestamo,valor FROM  multa "
                 + " Inner join usuario on usuario.codigo=multa.codigo_usuario "
                 + " WHERE multa.estado='Sin pagar'";
        
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
    
    public boolean cheack_fine(int idPrestamo){
        int id=0;
        String sql_select;
        sql_select="SELECT  id_prestamo FROM  multa WHERE id_prestamo='" + idPrestamo +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                id=tabla.getInt(1);
                System.out.println("ok");
               
            }
             if(idPrestamo==id){
                 return true;
                }{
                return false;
             }

           
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return false;
    }

    public void deleteFine(String id){
        Fine fine= new Fine();
        String sql_delete;
        sql_delete="DELETE FROM fine WHERE id='" + id +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_delete);
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
    }
    

    public int updateFine(String id){
        String sql_Up;
        int numFilas=0;

        sql_Up="UPDATE multa SET estado = 'Cancelado'"+
              " Where id = '" + id + "' " ;

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
