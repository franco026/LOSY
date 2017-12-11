/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Database_access.DaoEquipment;
import Logic.Equipment;

/**
 *
 * @author Kevin
 */
public class ControlEquipment {
    
    DaoEquipment daoequipment;
    public ControlEquipment()
    {
        daoequipment = new DaoEquipment();
    }
    
    public int  insertarEquipo(String  nombre, int marca, String descripcion, String estado){
        Equipment equipment = new Equipment();        

        equipment.setEquipmentName(nombre);
        equipment.setMake(marca);
        equipment.setDescription(descripcion);
        equipment.setState(estado);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daoequipment.insertequipment(equipment);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    
    public int  modificar_Estado(String estado, int numEquipo){
        Equipment equipment = new Equipment();        

        equipment.setNumeroEquipo( numEquipo);
        equipment.setState(estado);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daoequipment.editarEquipo(equipment);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    
    public int  editequipment(String name,String descripcion,String state,String liststate,
            int number,int serial,int numero,String nombre){
        Equipment equipment = new Equipment();        
        
        equipment.setEquipmentName(name);
        equipment.setMake(serial);
        equipment.setDescription(descripcion);
        equipment.setState(state);
        equipment.setNumeroEquipo(number);
        equipment.setStateequipment(liststate);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daoequipment.modificar(equipment,numero,nombre);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    
    
    
}
