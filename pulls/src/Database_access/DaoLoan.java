/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database_access;

/**
 *
 * @author Usuario
 */

import Logic.Loan;
import Logic.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DaoLoan {
    FacadeBD fachada;
    
    
    public DaoLoan() {
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
        //
        sql_guardar="INSERT INTO prestamo (id,codigo_usuario, numero_equipo, fecha_prestamo, fecha_devolucion, estado) "
                + "VALUES ( nextval('prestamo_seq'), '" +
                p.getCodigoUser()+ "', '" + p.getNumeroEquipo() +  "', '"+p.getFechaPrestamo()+"', '"+p.getFechaDevolucion()+
                "','Ocupado')";
      
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_guardar);
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
    
    public int editarPrestamo(String estado, int ev){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        String sqlUp=" ";
        sql_select="UPDATE prestamo SET estado = '"+estado+"' "+
                " WHERE numero_equipo = '" + ev + "' AND estado='Ocupado'";
        
        System.out.print("SQL = "+ sqlUp);
        //JOptionPane.showMessageDialog(null, sqlUp);
       try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);

            JOptionPane.showMessageDialog(null, sql_select);            
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
    
      public boolean check_loan(String state, int codeequipo,int codeusuario) {
        String sql;
        int code=0;
        sql = " select distinct codigo_usuario from "
            + " (select numero_equipo from equipos where estado='"+state+"') as tabla "
            + " INNER JOIN prestamo on prestamo.numero_equipo=tabla.numero_equipo "
            + " WHERE prestamo.codigo_usuario='" + codeusuario +"' and prestamo.estado='Ocupado'";
        
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            JOptionPane.showMessageDialog(null, sql);
            while(tabla.next()){
                code=tabla.getInt(1);
            }
            JOptionPane.showMessageDialog(null, code+" "+codeusuario);
            
            if (code==codeusuario) {
                JOptionPane.showMessageDialog(null, "Usted posee este articulo");
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
      
      public int update_data(String dataDev,int numberE, int code){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        String sqlUp=" ";
        sql_select="UPDATE prestamo SET fecha_devolucion = '"+dataDev+"' "+
                " WHERE numero_equipo = '" + numberE + "' AND codigo_usuario='"+code+"' AND estado='Ocupado'";
        
        System.out.print("SQL = "+ sqlUp);
        //JOptionPane.showMessageDialog(null, sqlUp);
       try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);

            JOptionPane.showMessageDialog(null, sql_select);            
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
      
      public int guardarReserva(Loan loan){
        String sql_guardar;
        int numFilas=0;
        //
        sql_guardar="INSERT INTO limite_renovar(codigo_usuario, numero_equipo, limite, fecha_renovacion) "
                + "VALUES ('" +
                loan.getCodigoUser()+ "', '" + loan.getNumeroEquipo() +  "', '3' , '"+loan.getFechaPrestamo()+
                "')";
      
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_guardar);
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
      
      public int Mostrarlimite(int codeusuario,int code){
        String sql_select;
        int limite=0;
        sql_select="SELECT limite FROM limite_renovar "
                + " WHERE codigo_usuario = '"+codeusuario+"' and numero_equipo = '"+code+"'";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            JOptionPane.showMessageDialog(null,sql_select);
            
            while(tabla.next()){
                limite=tabla.getInt(1);
            }
            tabla.close();
            sentencia.close();
            return limite;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return 0;
         
    }
      
       public String Mostrarfecha(int codeusuario,int code){
        String sql_select;
        String limite="";
        sql_select="SELECT fecha_renovacion FROM limite_renovar "
                + " WHERE codigo_usuario = '"+codeusuario+"' and numero_equipo = '"+code+"'";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            JOptionPane.showMessageDialog(null,sql_select);
            
            while(tabla.next()){
                limite=tabla.getString(1);
            }
            tabla.close();
            sentencia.close();
            return limite;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return limite;
         
    }
      
    public void reducir_limite(int codeusuario,int code,String fecha,int limite){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        sql_select=" UPDATE limite_renovar SET "
                + " fecha_renovacion = '"+fecha+"', "
                + " limite = '"+limite+"' "
                +  "WHERE numero_equipo = '" + code + "' AND codigo_usuario='"+codeusuario+"'";
         JOptionPane.showMessageDialog(null, sql_select);
       try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);
            
          ;
            
            JOptionPane.showMessageDialog(null, sql_select);            
            System.out.println("up " + numFilas);
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
    }
    
     public void eliminar_limite(int numberE){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        String sqlUp=" ";
        sql_select="DELETE FROM limite_renovar "+
                " WHERE numero_equipo = '" + numberE+"' ";
        
        System.out.print("SQL = "+ sqlUp);
        //JOptionPane.showMessageDialog(null, sqlUp);
       try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_select);

            JOptionPane.showMessageDialog(null, sql_select);            
            System.out.println("up " + numFilas);
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
    }
    
    
}

