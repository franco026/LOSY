package Control;

import Database_access.DaoEquipment;
import Database_access.DaoUser;
import Logic.User;
import Logic.Equipment;

import javax.swing.*;
import java.util.Vector;

public class Control {
    DaoUser daoUser;
    DaoEquipment daoequipment;

    public Control(){
        daoUser =new DaoUser();
        daoequipment = new DaoEquipment();
    }

    public int  insertmember (String  name, String lastname,int code, String email, String position, String proyect, int document, int phone){
        User datamember = new User();

        datamember.setName(name);
        datamember.setLastName(lastname);
        datamember.setCode(code);
        datamember.setEmail(email);
        datamember.setPosition(position);
        datamember.setProyect(proyect);
        datamember.setDocument(document);
        datamember.setPhone(phone);


        int result = daoUser.Savemember(datamember);

        return result;

    }

    public int insertAccount(int code,String password){
        User datamember = new User();

        datamember.setPassword(password);
        datamember.setCode(code);
        int result = daoUser.SaveAccount(datamember);
        return result;
    }

    public boolean check(String password,int code){

        boolean access;
        System.out.println("Se va a consultar un programa");
        access = daoUser.check_account(password,code);
        return access;
    }

    public String check_position(String password,int code){
        String position;
        System.out.println("Se va a consultar un programa");
        position = daoUser.check_position(password,code);
        return  position;
    }

    public boolean ALoneAWindow(JInternalFrame internalFrame,JDesktopPane desktopPane){
        boolean show=true;
        for (int a=0;a<desktopPane.getComponentCount();a++){

            if( internalFrame.getClass().isInstance( desktopPane.getComponent(a) )){
                JOptionPane.showMessageDialog(null,"La ventana que intenta abrir ya está abierta, cierre la ventana actual e intente nuevamente");
                internalFrame.toFront();
                desktopPane.moveToFront(internalFrame);
                show=false;
            }
        }
     return show;
    }

    public int insertequipment(int equipmentnumber,String equipmentname,int serialU,String description){

        Equipment equipmentdata = new Equipment();

        equipmentdata.setEquipmentnumber(equipmentnumber);
        equipmentdata.setEquipmentname(equipmentname);
        equipmentdata.setMake(serialU);
        equipmentdata.setState(1);
        equipmentdata.setDescription(description);
        int result = daoequipment.insertequipment(equipmentdata);
        return result;
    }

    public Vector<String> fill(){

        Vector<String> list = daoequipment.telldata();

        Vector<String> combo = new Vector<String>();
        for(int i=0;i<list.size();i=i+1)
        {
            combo.addElement(list.get(i));
        }

        return combo;
    }

}
