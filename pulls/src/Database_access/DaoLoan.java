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

import Control.ControlEquipment;
import Control.ControlFine;
import Logic.Loan;
import Logic.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    
     public Loan consultarPrestamo(Loan loan, int equipment){//Pendiente Editar
        String sql_select;
        sql_select="SELECT * FROM  prestamo "
                + " WHERE estado='Ocupado' AND numero_equipo='"+equipment+"'";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                loan.setId(Integer.parseInt(tabla.getString(1)));
                loan.setCodigoUser(Integer.parseInt(tabla.getString(2)));
                loan.setNumeroEquipo(Integer.parseInt(tabla.getString(3)));
                loan.setFechaPrestamo(tabla.getString(4));
                loan.setFechaDevolucion(tabla.getString(5));
                loan.setState(tabla.getString(6));
                
            }
            tabla.close();
            sentencia.close();
            return loan;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return loan;
    }
     
     public Loan consultarid(Loan loan, int id){//Pendiente Editar
        String sql_select;
        sql_select=" SELECT * FROM  prestamo "
                + " WHERE id='"+id+"'";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while(tabla.next()){
                loan.setId(Integer.parseInt(tabla.getString(1)));
                loan.setCodigoUser(Integer.parseInt(tabla.getString(2)));
                loan.setNumeroEquipo(Integer.parseInt(tabla.getString(3)));
                loan.setFechaPrestamo(tabla.getString(4));
                loan.setFechaDevolucion(tabla.getString(5));
                loan.setState(tabla.getString(6));
                
            } 
            tabla.close();
            sentencia.close();
            return loan;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return loan;
    }
     
     
      public Loan consultarreserva(Loan loan,int code){//Pendiente Editar
        String sql_select;
        sql_select=" SELECT * FROM  reserva "
                + " WHERE numero_equipo='"+code+"' ";// Where nombre_equipo LIKE '" + indi + "%'";
       
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                loan.setCodigoUser(Integer.parseInt(tabla.getString(1)));
                loan.setNumeroEquipo(Integer.parseInt(tabla.getString(2)));
                loan.setFechaPrestamo(tabla.getString(3));
                loan.setFechaDevolucion(tabla.getString(4));
                loan.setId(tabla.getInt(5));
                
            }
            tabla.close();
            sentencia.close();
            return loan;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         return loan;
    }
    
    public void consultarPrestamo2(DefaultTableModel model){//Pendiente Editar
    	Loan p= new Loan();
        String sql_select;
        sql_select=" select codigo_usuario,nombre_usuario,prestamo.numero_equipo,nombre_equipo,fecha_prestamo,fecha_devolucion from prestamo " +
                   " inner join equipos on equipos.numero_equipo=prestamo.numero_equipo " +
                   " inner join usuario on usuario.codigo=prestamo.codigo_usuario " +
                   " WHERE prestamo.estado='Ocupado'";
       
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
    
    public int guardarPrestamo(Loan p){
        String sql_guardar;
        int numFilas=0;
        //
        sql_guardar="INSERT INTO prestamo (id,codigo_usuario, numero_equipo, fecha_prestamo, fecha_devolucion, estado, motivo) "
                + "VALUES ( nextval('prestamo_seq'), '" +
                p.getCodigoUser()+ "', '" + p.getNumeroEquipo() +  "', '"+p.getFechaPrestamo()+"', '"+p.getFechaDevolucion()+
                "','Ocupado', '"+ p.getMotivo()+"');";
      
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
        sql = " select distinct codigo_usuario from prestamo "
            + " INNER JOIN equipos ON equipos.numero_equipo=prestamo.numero_equipo "
            + " where prestamo.codigo_usuario='" + codeusuario +"'"
            + " AND equipos.estado='Ocupado' "
            + " AND equipos.numero_equipo='"+codeequipo+"'";
        
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
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
      
       public boolean check_reserva(int codeequipo,int codeusuario) {
        String sql;
        int code=0;
        sql = " select * from reserva" 
            + " WHERE codigo_usuario='" + codeusuario +"' and numero_equipo='"+codeequipo+"'";
        
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while(tabla.next()){
                code=tabla.getInt(1);
            }
            if (code==codeusuario) {
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
       
       public boolean check_reserva2(int codeequipo) {
        String sql;
        int code=0;
        sql = " select * from reserva " 
            + " WHERE  numero_equipo='"+codeequipo+"'";
        
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            while(tabla.next()){
                code=tabla.getInt(2);
            }
            if (code==codeequipo) {
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
       
       public boolean check_prestamo(int id) {
        String sql;
        String estado="";
        sql = " select estado from prestamo " 
            + " WHERE id='"+id+"'";
        try {
            Connection conx = fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql);
            
            while(tabla.next()){
                estado=tabla.getString(1);
            }
            if (estado.equals("Disponible")) {
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
      
      public int guardarLimite(Loan loan){
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
      
    public void reducir_limite(int codeusuario,int code,String fecha,int limite){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        sql_select=" UPDATE limite_renovar SET "
                + " fecha_renovacion = '"+fecha+"', "
                + " limite = '"+limite+"' "
                +  "WHERE numero_equipo = '" + code + "' AND codigo_usuario='"+codeusuario+"'";
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
     public int guardarReserva(String inicio,String date,int code,int codeequipment,int id){
        String sql_guardar;
        int numFilas=0;
        //
        sql_guardar="INSERT INTO reserva VALUES('"
                + code +"', '"+codeequipment+"', '"+inicio+"', '"+date+"', '"+id+"')";
      
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
    
    public void MostrarDatos(DefaultTableModel model, String busqueda){

        String sql_select;
        int limite=0;
        sql_select="SELECT distinct p.codigo_usuario,u.nombre_usuario,p.numero_equipo,e.nombre_equipo,fecha_prestamo,fecha_devolucion FROM prestamo as p"
                + " INNER JOIN usuario as u on u.codigo=p.codigo_usuario "
                + " INNER JOIN equipos AS e ON e.numero_equipo=p.numero_equipo"
                + " WHERE codigo_usuario = '"+busqueda+"' and p.estado = 'Ocupado'";
        
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
    
     public void eliminar_limite(int code){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        sql_select=" DELETE FROM limite_renovar "
                +  " WHERE numero_equipo = '" + code + "' ";
       try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);         
            System.out.println("up " + numFilas);
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
    }
    
      public void eliminar_reserva(int code){//Pendiente Editar
        String sql_select;
        int numFilas=0;
        sql_select=" DELETE FROM reserva"
                +  " WHERE numero_equipo = '" + code + "' ";
         JOptionPane.showMessageDialog(null, sql_select);
       try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_select);         
            System.out.println("up " + numFilas);
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
    }
    
      public void verificarreserva(int fecha){
        ControlEquipment control = new ControlEquipment();
        Loan loan = new Loan();
        String sql_select,date,fechareserva;
        int dia,mes,ano,equipo=0;
        int id=0;
        sql_select="SELECT * FROM reserva";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                dia=Integer.parseInt(tabla.getString(4).substring(0,4));
                mes=Integer.parseInt(tabla.getString(4).substring(5,7));
                ano=Integer.parseInt(tabla.getString(4).substring(8,10));
                equipo=Integer.parseInt(tabla.getString(2));
                id=Integer.parseInt(tabla.getString(5));
                date=ano+""+mes+""+dia;
                
                loan = consultarid(loan, id);
                if(fecha>Integer.parseInt(date)&&loan.getState().equals("Disponible")){
                    eliminar_reserva(equipo);
                    control.modificar_Estado("Disponible",equipo);
                    
                }
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         
    }
      
    public void verifirmulta(int fecha,int fechares,String fechave,String fechareve){
        ControlEquipment control = new ControlEquipment();
        ControlFine controlfine = new ControlFine();
        String sql_select,date,fechareserva,estado;
        int dia,mes,ano,equipo,code,id=0;
        sql_select="SELECT * FROM prestamo";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
                id=Integer.parseInt(tabla.getString(1));
                code=Integer.parseInt(tabla.getString(2));
                equipo=Integer.parseInt(tabla.getString(3));
                dia=Integer.parseInt(tabla.getString(5).substring(0,4));
                mes=Integer.parseInt(tabla.getString(5).substring(5,7));
                ano=Integer.parseInt(tabla.getString(5).substring(8,10));
                estado=tabla.getString(6);
                date=ano+""+mes+""+dia;
                
                if(controlfine.check_fine(id)){
                }else{
                    
                    if(fecha>Integer.parseInt(date)&&estado.equals("Ocupado")){
                         if(check_reserva2(equipo)){
                            eliminar_reserva(equipo);
                            guardarReserva(fechave,fechareve,code,equipo,id);  
                        }
                        controlfine.Crearmulta(code,500,id);
                    }
                }
                
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
         
    }
    
public void verifiretraso(int fecha){
        String sql_select,date,estado,nombre,mensaje="";
        int dia,mes,ano;
        
        sql_select="SELECT fecha_devolucion,nombre_usuario,prestamo.estado FROM prestamo"
                + " Inner join usuario on usuario.codigo=prestamo.codigo_usuario";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                dia=Integer.parseInt(tabla.getString(1).substring(0,4));
                mes=Integer.parseInt(tabla.getString(1).substring(5,7));
                ano=Integer.parseInt(tabla.getString(1).substring(8,10));
                nombre=tabla.getString(2);
                estado=tabla.getString(3);
                date=ano+""+mes+""+dia;
                if(fecha>Integer.parseInt(date)&&estado.equals("Ocupado")){
                    mensaje+="El usuario "+nombre+" aun no a devuelto el equipo \n";
                }   
            }
            if(!mensaje.equals("")){
                
            JOptionPane.showMessageDialog(null,mensaje);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
    
     public void multas(int code){
        String sql_select,mensaje="";
        int valor=0;
        
        sql_select="SELECT sum(valor) From multa "
                + " Where codigo_usuario='"+code+"' AND estado='Sin pagar'";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                valor=tabla.getInt(1);
            }
            if(valor!=0){
                JOptionPane.showMessageDialog(null,"usted tiene una multa de un valor de : " +valor);
            }
           
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
     
    public void equiposatrasados(int code){
        Calendar calendario = new GregorianCalendar();
        int dia = calendario.get(Calendar.DATE);
        int mes = calendario.get(Calendar.MONTH)+1;
        int ano = calendario.get(Calendar.YEAR);
        String fechaS = dia+""+mes+""+ano;
        int fecha=Integer.parseInt(fechaS);
        String sql_select,nombre,date,mensaje="";
        int diad,mesd,anod,valor=0;
        
        sql_select="SELECT nombre_equipo,fecha_devolucion From prestamo "
                + " Inner join equipos on equipos.numero_equipo=prestamo.numero_equipo "
                + " Where codigo_usuario='"+code+"' AND prestamo.estado='Ocupado' ";
        
         try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();

            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                nombre=tabla.getString(1);
                diad=Integer.parseInt(tabla.getString(2).substring(0,4));
                mesd=Integer.parseInt(tabla.getString(2).substring(5,7));
                anod=Integer.parseInt(tabla.getString(2).substring(8,10));
                date=diad+""+mesd+""+anod;
                if(fecha>Integer.parseInt(date)){
                    mensaje+="El equipo : "+nombre+" no lo has devuelto y se paso la fecha limite del prestamo \n";
                } 
            }
            if(!mensaje.equals("")){
                
           JOptionPane.showMessageDialog(null,mensaje);
            }
            tabla.close();
            sentencia.close();
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
    }
      
      
}

