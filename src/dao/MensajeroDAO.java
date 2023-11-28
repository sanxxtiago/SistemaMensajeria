package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Mensajero;
import util.RHException;
import util.ServiceLocator;

public class MensajeroDAO {

    // Constructor Mensajero
    public MensajeroDAO() {
        // Constructor vacío por ahora
    }

    // Método para consultar un mensajero por su ID
    public Mensajero consultarMensajeroPorId(int idMensajero) throws RHException {
        Mensajero mensajero = null;

        try {
            // Consulta SQL para seleccionar un mensajero por su ID
            String strSQL = "SELECT * FROM public.mensajero WHERE k_idmensajero = ?";
            
            // Obtener la conexión desde el ServiceLocator
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            
            // Crear un PS para ejecutar la consulta
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, idMensajero);

            ResultSet rs = prepStmt.executeQuery();

            // If: Verificar si se encontró un resultado
            if (rs.next()) {
                // Resultados Mensajero
                mensajero = new Mensajero();
                mensajero.setTipoId(rs.getString("k_tipoid"));
                mensajero.setIdMensajero(rs.getInt("k_idmensajero"));
                mensajero.setNombre(rs.getString("n_nombre"));
                mensajero.setApellido(rs.getString("n_apellido"));
                mensajero.setTelefono(rs.getInt("q_telefono"));
                mensajero.setF_nacimiento(rs.getDate("f_nacimiento").toString());
                mensajero.setNacionalidad(rs.getString("n_nacionalidad"));
                mensajero.setSexo(rs.getString("i_sexo"));
                mensajero.setCorreo(rs.getString("n_correo"));
                mensajero.setContrasena(rs.getString("n_contrasena"));
                mensajero.setMedioTransporte(rs.getString("i_mediotransporte"));
                mensajero.setCalificacionPromedio(rs.getDouble("q_calificacionpromedio"));
            }

            rs.close();
            prepStmt.close();

        } catch (SQLException e) {
            // Excepción
            throw new RHException("MensajeroDAO", "Error al consultar el mensajero por ID: " + e.getMessage());
        } finally {
            // Realizar rollback en caso de excepción y liberar la conexión
            ServiceLocator.getInstance().rollback();
        }

        // Devolver el objeto Mensajero o null si no se encontró
        return mensajero;
    }
}
