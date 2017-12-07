package Logic;

import java.sql.Date;

public class Loan {
    private int codigoUser;
    private int numeroEquipo;
    private int marca;
    private String fechaPrestamo;
    private String fechaDevolucion;
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
    
    public String getFechaPrestamo(){
        return fechaPrestamo;
    }
    
    public String getFechaDevolucion(){
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
    
    public void setFechaPrestamo(String fecha){
        this.fechaPrestamo = fecha;
    }
    
    public void setFechaDevolucion(String fecha){
        this.fechaDevolucion = fecha;
    }
}
