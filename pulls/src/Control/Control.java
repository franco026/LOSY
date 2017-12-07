package Control;

import Database_access.DaoEquipment;
import Database_access.DaoPrestamo;
import Database_access.DaoProyect;
import Database_access.DaoUser;
import Logic.User;
import Logic.Equipment;
import Logic.Loan;
import Logic.Proyect;

import javax.swing.*;
import java.util.Vector;

public class Control {

    DaoUser daomember;
    DaoEquipment daoequipment;
    User datamember;
    DaoProyect daoProyect;
    DaoPrestamo daoPrestamo;
    int codigo;
    
    public Control() {
        daomember = new DaoUser();
        daoequipment = new DaoEquipment();
        datamember = new User();
        daoProyect = new DaoProyect();
        daoPrestamo = new DaoPrestamo();
    }

    public int insertmember(String name, String lastname, int code, String email, String position, String proyect, int document, int phone) {
        

        datamember.setName(name);
        datamember.setLastName(lastname);
        datamember.setCode(code);
        datamember.setEmail(email);
        datamember.setPosition(position);
        datamember.setProyect(proyect);
        datamember.setDocument(document);
        datamember.setPhone(phone);
        //JOptionPane.showMessageDialog(null, datamember.getPosition()+" "+ datamember.getEmail());
        int result = daomember.guardarUsuario(datamember);

        return result;

    }
    
    public int pasarCode(){
        return codigo;
    }

    public int insertAccount(int code, String password) {
        //User datamember = new User();

        datamember.setPassword(password);
        datamember.setCode(code);
        int result = daomember.SaveAccount(datamember);
        return result;
    }

    public boolean check(String password, int code) {
       
        boolean access;
        System.out.println("Se va a consultar un programa");
        access = daomember.check_account(password, code);
        return access;
    }

    public String check_position(String password, int code) {
        String position;
        codigo = code;
        System.out.println("Se va a consultar un programa");
        position = daomember.check_position(password, code);
        return position;
    }

    public boolean ALoneAWindow(JInternalFrame internalFrame, JDesktopPane desktopPane) {
        boolean show = true;
        for (int a = 0; a < desktopPane.getComponentCount(); a++) {

            if (internalFrame.getClass().isInstance(desktopPane.getComponent(a))) {
                JOptionPane.showMessageDialog(null, "La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
                internalFrame.toFront();
                desktopPane.moveToFront(internalFrame);
                show = false;
            }
        }
        return show;
    }

    public int  insertarEquipo(String  nombre, int marca, String descripcion, String estado){
        Equipment p = new Equipment();        

        p.setEquipmentname(nombre);
        p.setMake(marca);
        p.setDescription(descripcion);
        p.setState(estado);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daoequipment.guardarEquipo(p);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    
    public int  insertarProyecto(String proyectName, String description, int codigo){
        Proyect p = new Proyect();        

        p.setName(proyectName);
        p.setDescription(description);
        p.setDirectorCode(codigo);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daoProyect.guardarProyecto(p);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    
    public int  insertarMiembro(String name, String lastname, int code, String email, String position, String proyect, int document, int phone){
        User p = new User();        

        p.setCode(code);
        p.setName(name);
        p.setLastName(lastname);
        p.setPosition(position);
        p.setEmail(email);
        p.setProyect(proyect);
        p.setPhone(phone);
        p.setDocument(document);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result = daomember.guardarUsuario(p);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    
    public int insertarPrestamo(int key, int num, int marc, String date, String dateDev){
        Loan pres = new Loan();
        
        pres.setCodigoUser(key);
        pres.setNumeroEquipo(num);
        pres.setMarca(marc);
        pres.setFechaPrestamo(date);
        pres.setFechaDevolucion(dateDev);
        
        int result = daoPrestamo.guardarPrestamo(pres);
        
        return result;
    }

    public void setCode(int code) {
        codigo = code;
        
    }

}
