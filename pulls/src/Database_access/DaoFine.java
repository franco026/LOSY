package Database_access;

import Logic.Fine;
import java.sql.*;

public class DaoFine {

    private FacadeBD fachada;

    public DaoFine(){
        fachada= new FacadeBD();
        disableWarning();
    }

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    public int saveFine(Fine fine){
        String sql_save;
        int numFilas=0;

        sql_save="INSERT INTO multa VALUES ('" +
                fine.getUserCode() + "', '" + fine.getValue() + ")";
        try{
            Connection conn= fachada.getConnetion();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_save);
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
    }//fin

    public Fine readFine(int idUser){
        Fine fine= new Fine();
        String sql_select;
        sql_select="SELECT  Codigo_Usuario, Valor FROM  multa WHERE Codigo_Usuario='" + idUser +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while(tabla.next()){

                fine.setUserCode(tabla.getInt(1));
                fine.setValue(tabla.getInt(2));
                System.out.println("ok");
            }

            return fine;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return null;
    }

    public Fine deleteFine(int idUser){
        Fine fine= new Fine();
        String sql_delete;
        sql_delete="DELETE FROM fine WHERE Codigo_Usuario='" + idUser +  "'";
        try{
            Connection conn= fachada.getConnetion();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_delete);

            return fine;
        }
        catch(SQLException e){ System.out.println(e); }
        catch(Exception e){ System.out.println(e); }
        return null;
    }

    public int updateFine(Fine fine){
        String sql_Up;
        int numFilas=0;

        sql_Up="UPDATE multa SET Valor = '" + fine.getValue() +
                " WHERE Codigo_Usuario = '" + fine.getUserCode() + "' ;" ;

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
