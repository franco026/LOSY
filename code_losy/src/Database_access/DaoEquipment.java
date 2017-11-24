package Database_access;

import java.sql.*;
import java.util.Vector;

import Logic.Equipment;

public class DaoEquipment {
    FacadeBD fachada;

    public DaoEquipment(){
        fachada= new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    public int insertequipment(Equipment equipment){
        String sql;
        int numFilas=0;

        sql="INSERT INTO Equipos VALUES ('" +
                equipment.getEquipmentnumber() +  "', '" +equipment.getEquipmentname() +  "', '" +
                equipment.getMake() + "', '" + equipment.getDescription() + "', '" +
                equipment.getState()  +  "'" +
                ")";
        try{
            Connection conx= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentence = conx.createStatement();

            numFilas = sentence.executeUpdate(sql);
            return numFilas;

        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        return -1;

    }

    public Vector<String> telldata(){
        String sql;
        sql="SELECT nombre_equipo FROM Equipos";
        try{
            Connection conx= fachada.getConnetion();
            Statement sentencia = conx.createStatement();
            ResultSet resultSet = sentencia.executeQuery(sql);

            Vector<String> list = new Vector<String>();

            do
            {
                list.addElement(resultSet.getString(1));
            }
            while(resultSet.next());
            return list;


        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return null;
    }

}
