package Database_access;

import java.sql.*;

public class FacadeBD {

    String url, usuario, password;
    Connection conexion = null;
    Statement instruccion;
    ResultSet tabla;

    public FacadeBD() {
        url="jdbc:postgresql://localhost:5433/losy";
        usuario = "postgres";
        password = "3271586+";
    }

    public Connection conectar() {
        try {
            // Se carga el driver
            Class.forName("org.postgresql.Driver");
            //System.out.println( "Driver Cargado" );
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver.");
        }

        try {
            //Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion Abierta");
            return conexion;
            //Crear objeto Statement para realizar queries a la base de datos
        } catch (Exception e) {
            System.out.println("No se pudo abrir la bd.");
            return null;
        }

    }//end connectar

    public Connection getConnetion() {
        if (conexion == null) {
            return this.conectar();
        } else {
            return conexion;
        }

    }

    public void closeConection(Connection c) {
        try {
            if (conexion != null) {
                c.close();
            }

        } catch (Exception e) {
            System.out.println("No se pudo cerrar.");
        }
    }

}//end class
