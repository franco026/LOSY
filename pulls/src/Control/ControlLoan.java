/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Database_access.DaoLoan;
import Logic.Loan;
import Logic.User;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class ControlLoan {
    
    int count=0;
    int countyear=0;
    DaoLoan daoprestamo;
    public ControlLoan()
    {
        daoprestamo = new DaoLoan();
    }
    
    public int insertarPrestamo(int key, int num, String date, String dateDev, String motivo){
        Loan pres = new Loan();
        
        pres.setCodigoUser(key);
        pres.setNumeroEquipo(num);
        pres.setFechaPrestamo(date);
        pres.setFechaDevolucion(dateDev);
        pres.setMotivo(motivo);
        
        int result = daoprestamo.guardarPrestamo(pres)+daoprestamo.guardarLimite(pres);
        
        return result;
    }
    
    public boolean check_loan(String state,int codeequipo,int codeusuario){
       if(daoprestamo.check_loan(state,codeequipo,codeusuario)){
           return true;
       }else{
           return false;
       }
    }
    
    public boolean check_reserva(int codeequipo,int codeusuario){
       if(daoprestamo.check_reserva(codeequipo,codeusuario)){
           return true;
       }else{
           return false;
       }
    }
    
    public boolean check_reserva2(int codeequipo){
       if(daoprestamo.check_reserva2(codeequipo)){
           return true;
       }else{
           return false;
       }
    }
    
    public boolean check_prestamo(int id){
       if(daoprestamo.check_prestamo(id)){
           return true;
       }else{
           return false;
       }
    }
    public int update_data(String dataDe,int codeequipo,int codeusuario){
       return daoprestamo.update_data(dataDe,codeequipo,codeusuario);
    }
    
    public int ModificarEstado(String state,int code){
        
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
    
    public void eliminar_limite(int code){
        daoprestamo.eliminar_limite(code);
    }
    
    public void eliminar_reserva(int code){
        daoprestamo.eliminar_reserva(code);
    }
    
    public Loan mostrar_reserva(Loan loan,int code){
        return daoprestamo.consultarreserva(loan, code);
    }
    
    
     public void insertarReserva(int key, int codeequipment,String inicio,String date,int id){
        
      daoprestamo.guardarReserva(inicio,date,key,codeequipment,id);
    }
    
    public Loan Datos(Loan loan,int equipment){
        
      return daoprestamo.consultarPrestamo(loan,equipment);
        
    }
    
       private int daymonths(int month,int year){
       
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
               if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                   return 29;
               }else{
                   return 28;
                } 
            default:
                return 0;
                
        }
    }
    
    private int check_day(int month,int ano,int dev){
        if(dev>daymonths(month,ano)){
            month++;
            count++;
            int day = dev-daymonths(month,ano);
            if(month>12){
                month=0;
                day = dev-daymonths(month,ano);
                ano++;
                countyear++;
            }
            if(count>12){
                    count=0;
            }
            return check_day(month,ano,day);
        }else{
            return dev;
        }
    }
    
    public void DayDev(int days,int code,int numero, String motivo){
    Calendar calendario = new GregorianCalendar();
    int dia = calendario.get(Calendar.DATE);
    int mes = calendario.get(Calendar.MONTH)+1;
    int año = calendario.get(Calendar.YEAR);
    String date = dia+"-"+mes+"-"+año;
    calendario.add(Calendar.DAY_OF_MONTH, days);
    int diaDevolucion = calendario.get(Calendar.DAY_OF_MONTH);
    String dateDev = diaDevolucion+"-"+mes+"-"+año;
    int numFilas2 = insertarPrestamo(code, numero, date, dateDev, motivo);
    System.out.println("Filas " + numFilas2);
    if (numFilas2==2) {
        JOptionPane.showMessageDialog(null, "Prestamo Guardado con Exito");
    }else{
        JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el Equipo"); 
        }
    count=0;
    countyear=0;
    }
    
    
    public void RenDayDev(int days,int code,int numero){
    Calendar calendario = new GregorianCalendar();
    User user = new User();
    int dev=0;
    int dia = calendario.get(Calendar.DATE);
    int mes = calendario.get(Calendar.MONTH)+1;
    int ano = calendario.get(Calendar.YEAR);
    String date = dia+"-"+mes+"-"+ano;
    int limite = MostrarLimite(code, numero);
    if(limite!=0||days==10){

        if((dia+days)>daymonths(mes,ano)){
            
            int dato = daymonths(mes,ano)-dia;
            dev = days-dato;
            dev = check_day(mes,ano,dev);
            calendario.add(Calendar.MONTH, count);
            
            if((mes==12||countyear>0)&&(dia+7)>daymonths(mes,ano)){
                
                calendario.add(Calendar.YEAR,countyear);
                int mesDevolucion = calendario.get(Calendar.MONDAY)+1;
                int anoDevolucion = calendario.get(Calendar.YEAR)-1;
                String dateDev = (dev-1)+"-"+mesDevolucion+"-"+anoDevolucion;
                update_data(dateDev, numero, code);
                
                limite--;
                if(days==7){
                    reducirlimite(code, numero, date, limite);  
                }else{
                    Loan loan = new Loan();
                    dateDev = (dev-1)+"-"+mesDevolucion+"-"+anoDevolucion;
                    loan = Datos(loan,numero);
                    insertarReserva(code, numero,loan.getFechaDevolucion(),date,loan.getId());

                }
                JOptionPane.showMessageDialog(null, "Solicitud registrada.");
            }else{
                
                if(countyear>0){
                    
                    calendario.add(Calendar.YEAR,countyear);
                    int mesDevolucion = calendario.get(Calendar.MONDAY)+1;
                    int anoDevolucion = calendario.get(Calendar.YEAR)-1;
                    String dateDev = (dev-1)+"-"+mesDevolucion+"-"+anoDevolucion;
                    update_data(dateDev, numero, code);
                    
                    limite--;
                    if(days==7){
                        reducirlimite(code, numero, date, limite);  
                    }else{
                    Loan loan = new Loan();
                    dateDev = (dev-1)+"-"+mesDevolucion+"-"+anoDevolucion;
                    loan = Datos(loan,numero);
                    insertarReserva(code, numero,loan.getFechaDevolucion(),date,loan.getId());

                    }
                    JOptionPane.showMessageDialog(null, "Solicitud registrada.");
                    }
                }
       }else{
            
            calendario.add(Calendar.DAY_OF_MONTH, days);
            int diaDevolucion = calendario.get(Calendar.DAY_OF_MONTH);
            String dateDev = (diaDevolucion-1)+"-"+mes+"-"+ano;
            update_data(dateDev, numero, code);
            limite--;
            if(days==7){
                reducirlimite(code, numero, date, limite);  
            }else{
                Loan loan = new Loan();
                loan = Datos(loan,numero);
                insertarReserva(code, numero,loan.getFechaDevolucion(),dateDev,loan.getId());

              
            }
            JOptionPane.showMessageDialog(null, "Solicitud registrada.");
            }
    }else{
          JOptionPane.showMessageDialog(null, "has superado el limite de renovacion");
    }
    count=0;
    countyear=0;
    }

}
