/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Usuario
 */
import java.sql.Date;

public class Loan {
    private int codigoUser;
    private int numeroEquipo;
    private int id;

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String state;
    private String motivo;

    public String getState() {
        return state;
    }

    public String getMotivo(){
        return motivo;
    }
    
    public void setMotivo(String motivo){
        this.motivo = motivo;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    private String[] encabezado = {"codigo_usuario", "numero_equipo", "marca", "fecha_prestamo", "fecha_devolucion"};
    
    public Loan() {
    }
    
    public int getCodigoUser(){
        return codigoUser;
    }
    
    public int getNumeroEquipo(){
        return numeroEquipo;
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
    
    public void setFechaPrestamo(String fecha){
        this.fechaPrestamo = fecha;
    }
    
    public void setFechaDevolucion(String fecha){
        this.fechaDevolucion = fecha;
    }
}    