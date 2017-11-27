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

    public int insertEquipment(Equipment equipment){
        String sql;
        int numFilas=0;

        sql="INSERT INTO Equipos VALUES ('" +
                equipment.getEquipmentNumber() +  "', '" + equipment.getEquipmentName() +  "', '" +
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


    public Equipment readEquipment(int equipmentNumber){
        Equipment equipment= new Equipment();
        String sql_select;
        sql_select="SELECT numero_equipo, nombre_equipo, marca, descripcion, estado FROM  equipos WHERE numero_equipo='" + equipmentNumber +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while(tabla.next()){

                equipment.setEquipmentNumber(tabla.getInt(1));
                equipment.setEquipmentName(tabla.getString(2));
                equipment.setMake(tabla.getInt(3));
                equipment.setDescription(tabla.getString(4));
                equipment.setState(tabla.getInt(5));

                System.out.println("ok");
            }

            return equipment;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return null;
    }

    public Equipment deleteEquipment(int equipmentNumber){
        Equipment equipment= new Equipment();
        String sql_delete;
        sql_delete="DELETE FROM equipos WHERE numero_equipo='" + equipmentNumber +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_delete);

            return equipment;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return null;
    }

    public int updateEquipment(Equipment equipment){
        String sql_Up;
        int numFilas=0;

        sql_Up="UPDATE equipos SET nombre_equipo = '" + equipment.getEquipmentName() + "', marca = '" + equipment.getMake() +
                "' , descripcion = " + equipment.getDescription() +  "' , estado = " +equipment.getState()+
                " WHERE numero_equipo = '" + equipment.getEquipmentNumber() + "' ;" ;

        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_Up);
            System.out.println("up " + numFilas);
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
}
