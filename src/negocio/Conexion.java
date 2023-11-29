package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    private static Conexion conexion = null;

    // Singleton
    public static Conexion getSingleton() {
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }

    private String jdbcUrl;
    private String usuario;
    private String contrasenia;

    public Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public Conexion() {

        this.jdbcUrl = "jdbc:postgresql://ep-misty-math-86012971.us-east-2.aws.neon.fl0.io:5432/SistemaMensajeriaDB?sslmode=require";
        //this.jdbcUrl = "jdbc:postgresql://localhost:5432/ProyectoPrueba";
        this.usuario = "fl0user";
        this.contrasenia = "LbcJs1Sx4mwa";
        
        
    }

    public void establecerConexion() {
        try {
            // Cargar el controlador JDBC
            Class.forName("org.postgresql.Driver");

            // Establecer la conexi�n
            connection = DriverManager.getConnection(jdbcUrl, usuario, contrasenia);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("sisas");
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
                System.out.println("La conexi�n se cerr� satisfactoriamente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
