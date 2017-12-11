/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Database_access.DaoLoan;
import Logic.Loan;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ControlLoan {
    
    DaoLoan daoprestamo;
    public ControlLoan()
    {
        daoprestamo = new DaoLoan();
    }
    
    public int insertarPrestamo(int key, int num, int marc, String date, String dateDev){
        Loan pres = new Loan();
        
        pres.setCodigoUser(key);
        pres.setNumeroEquipo(num);
        pres.setFechaPrestamo(date);
        pres.setFechaDevolucion(dateDev);
        
        int result = daoprestamo.guardarPrestamo(pres)+daoprestamo.guardarReserva(pres);
        return result;
    }
    
    public boolean check_loan(String state,int codeequipo,int codeusuario){
       if(daoprestamo.check_loan(state,codeequipo,codeusuario)){
           return true;
       }else{
           JOptionPane.showMessageDialog(null, "Usasd");
           return false;
       }
    }
    
    public int update_data(String dataDe,int codeequipo,int codeusuario){
       return daoprestamo.update_data(dataDe,codeequipo,codeusuario);
    }
    
    public int ModificarEstado(String state,int code){
        Loan pres = new Loan();
        
        pres.setNumeroEquipo(code);
        pres.setState(state);
        
        int result = daoprestamo.editarPrestamo(state,code);
        return result;
    }
    
    public int MostrarLimite(int codeusuario,int code){
        int result = daoprestamo.Mostrarlimite(codeusuario,code);
        return result;
    }
    
    public void reducirlimite(int codeusuario,int code,String fecha,int limite){
        daoprestamo.reducir_limite(codeusuario,code,fecha,limite);
    }
    
    public String Mostrarfecha(int codeusuario,int code){
        String fecha = daoprestamo.Mostrarfecha(codeusuario,code);
        return fecha;
    }
    
     public void eliminar_limites(int code){
        daoprestamo.eliminar_limite(code);
    }
    

}
