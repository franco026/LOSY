package Logic;

import java.sql.Date;

public class Loan {
    private int codigoUser;
    private int numeroEquipo;
    private int marca;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String[] encabezado = {"codigo_usuario", "numero_equipo", "marca", "fecha_prestamo", "fecha_devolucion"};
    
    public Loan() {
    }
    
    public int getCodigoUser(){
        return codigoUser;
    }
    
    public int getNumeroEquipo(){
        return numeroEquipo;
    }
    
    public int getMarca(){
        return marca;
    }
    
    public Date getFechaPrestamo(){
        return fechaPrestamo;
    }
    
    public Date getFechaDevolucion(){
        return fechaDevolucion;
    }
    
    public void setCodigoUser(int codigoUser){
        this.codigoUser = codigoUser;
    }
    
    public void setNumeroEquipo(int numeroEquipo){
        this.numeroEquipo = numeroEquipo;
    }
    
    public void setMarca(int marca){
        this.marca = marca;
    }
    
    public void setFechaPrestamo(Date fecha){
        this.fechaPrestamo = fecha;
    }
    
    public void setFechaDevolucion(Date fecha){
        this.fechaDevolucion = fecha;
    }
}
