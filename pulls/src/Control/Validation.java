/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import com.sun.glass.events.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Kevin
 */
public class Validation {
    
   public Validation(){}
    
    public boolean isEmail(String account){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(account);
        if(mat.find()){
            return true;
        }else
            return false;
        
    }
      
    public boolean IsString(java.awt.event.KeyEvent evt){
        char field=evt.getKeyChar();
        if((field<'a'||field>'z')&&(field<'A'||field>'Z')&&(field!=(char)KeyEvent.VK_SPACE)){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean IsInteger(java.awt.event.KeyEvent evt){
        char field=evt.getKeyChar();
        if((field<'0'||field>'9')&&(field!=(char)KeyEvent.VK_BACKSPACE)){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean Isphone(String fields){
        
        if(fields.length()==7||fields.length()==10||fields.length()==0){
            Pattern pat = null;
            Matcher mat = null;
            pat = Pattern.compile("^[0-9]*$");
            mat = pat.matcher(fields);
            if(mat.find()){
                return true;
            }else{
                return false;
            }
            
        }else
            return false;
    }
    
    public int Isnullfileds(String fields){
        int number;
        if(fields.equals("")){
            return 0;
        }else{
            return number=Integer.parseInt(fields);
        }
    }
    
    
    
}
