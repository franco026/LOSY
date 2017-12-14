/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Database_access.DaoFine;
import Logic.Fine;

/**
 *
 * @author Kevin
 */
public class ControlFine {
    DaoFine fineDao;
    Fine fine = new Fine();
    public ControlFine(){
        fineDao= new DaoFine();
    }
    
    public void Crearmulta(int code,int valor,int id){
        fine.setUserCode(code);
        fine.setValue(valor);
        fineDao.saveFine(fine, id);
        
    }
    
    public boolean check_fine(int id){
        return fineDao.cheack_fine(id);
    }
}
