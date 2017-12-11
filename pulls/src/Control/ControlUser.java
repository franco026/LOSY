package Control;

import Database_access.DaoEquipment;
import Database_access.DaoProyect;
import Database_access.DaoUser;
import Logic.User;
import Logic.Equipment;
import Logic.Proyect;
import javax.swing.JOptionPane;

public class ControlUser {

    DaoUser daomember;
    User datamember;
    
    public ControlUser() {
        daomember = new DaoUser();
        datamember = new User();
        
    }

    public int insertmember(String name, String lastname, int code, String email,
            String position, String proyect, int document, int phone) {
        

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

    public int insertAccount(int code, String password) {
        //User datamember = new User();

        datamember.setPassword(password);
        datamember.setCode(code);
        int result = daomember.SaveAccount(datamember);
        return result;
    }

    public boolean check(String password,String account) {
        
        boolean access;
        int code;
        try{
            code=Integer.parseInt(account);
            System.out.println("Se va a consultar un programa");
            access = daomember.check_account_code(password,code);
            return access;
        }catch(Exception e){
            System.out.println("Se va a consultar un programa");
            access = daomember.check_account_email(password,account);
            return access;
        }
        
        
        
    }

    public String check_position(String account) {
        String position;
        int code;
        try{
            code=Integer.parseInt(account);
            System.out.println("Se va a consultar un programa");
            position = daomember.check_position_code(code);
            return position;
        }catch(Exception e){
            System.out.println("Se va a consultar un programa");
            position = daomember.check_position_email(account);
            return position;
        }
        
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
    
    public int return_code(String account) {
        int code;
            code = daomember.return_code(account);
            return code;
        
    }
    
 public int editmember(String name, String lastname, int code, String email, String position, 
         String proyect, int document,String state, int phone,String answer,String Question,String password,int oldcode) {
        

        datamember.setName(name);
        datamember.setLastName(lastname);
        datamember.setCode(code);
        datamember.setEmail(email);
        datamember.setPosition(position);
        datamember.setProyect(proyect);
        datamember.setDocument(document);
        datamember.setPhone(phone);
        datamember.setAnswer(answer);
        datamember.setPassword(password);
        datamember.setState(state);
        datamember.setQuestion(Question);
        //JOptionPane.showMessageDialog(null, datamember.getPosition()+" "+ datamember.getEmail());
        int result = daomember.modificar(datamember,oldcode)+daomember.new_password(datamember,oldcode);

        return result;

    }
 
    public boolean NewPassword(int code) {
        
        boolean access;
        System.out.println("Se va a consultar un programa");
        access = daomember.check_code(code);
        return access;
        
        
        
    }
    
   public int Password(String password,int code) {
        


        datamember.setPassword(password);
        //JOptionPane.showMessageDialog(null, datamember.getPosition()+" "+ datamember.getEmail());
        int result = daomember.new_password(datamember,code);

        return result;

    }
}
