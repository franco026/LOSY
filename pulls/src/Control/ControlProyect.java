/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Database_access.DaoProyect;
import Logic.Proyect;

/**
 *
 * @author Kevin
 */
public class ControlProyect {
    
    DaoProyect daoProyect;
    
    
    public ControlProyect(){
        daoProyect = new DaoProyect();
    }
    
     public int  insertarProyecto(String proyectName, String description, int codigo){
        Proyect proyect = new Proyect();        

        proyect.setName(proyectName);
        proyect.setDescription(description);
        proyect.setDirectorCode(codigo);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daoProyect.guardarProyecto(proyect);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
     
      public int  editproyect(String name,String descripcion,String state,int Code,
            int CodeD,int numero,String nombre){
        Proyect proyect = new Proyect();        
        
        proyect.setName(name);
        proyect.setId(Code);
        proyect.setDirectorCode(CodeD);
        proyect.setDescription(descripcion);
        proyect.setState(state);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daoProyect.editarProyecto(proyect, Code, nombre);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    
     
   
    
}
