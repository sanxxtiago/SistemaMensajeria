package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Mensajero;
import util.RHException;
import util.ServiceLocator;

public class MensajeroDAO {

    public MensajeroDAO() {

    }

    public boolean registroMensajero(Mensajero mensajero) throws RHException {//Clase que maneja el acceso a la tabla clientes de la BD.
        try {
            String strSQL = "INSERT INTO public.mensajero(k_tipoid, k_idmensajero, n_nombre, n_apellido, q_telefono,"
                    + "f_nacimiento, n_nacionalidad, i_sexo, n_correo, n_contrasena, i_mediotransporte, q_calificacionpromedio)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, mensajero.getTipoId());
            prepStmt.setInt(2, mensajero.getIdMensajero());
            prepStmt.setString(3, mensajero.getNombre());
            prepStmt.setString(4, mensajero.getApellido());
            prepStmt.setInt(5, mensajero.getTelefono());
            prepStmt.setDate(6, java.sql.Date.valueOf(mensajero.getF_nacimiento()));
            prepStmt.setString(7, mensajero.getNacionalidad());
            prepStmt.setString(8, mensajero.getSexo());
            prepStmt.setString(9, mensajero.getCorreo());
            prepStmt.setString(10, mensajero.getContrasena());
            prepStmt.setString(11, mensajero.getMedioTransporte());
            prepStmt.setDouble(12, mensajero.getCalificacionPromedio());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
            return true;
        } catch (SQLException e) {
            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeroDAO", "No pudo crear el mensajero -> " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    // Método para consultar un mensajero por su correo
    public Mensajero consultarMensajeroPorCorreo(String correo) throws RHException {
        Mensajero mensajero = null;

        try {
            // Consulta SQL para seleccionar un mensajero por su correo
            String strSQL = "SELECT * FROM public.mensajero WHERE n_correo = ?";

            Connection conexion = ServiceLocator.getInstance().tomarConexion();

            // Crear un PS para ejecutar la consulta
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, correo);

            ResultSet rs = prepStmt.executeQuery();

            // If: Verificar si se encontró un resultado
            if (rs.next()) {
                // Resultados Mensajero
                mensajero = new Mensajero();
                mensajero.setTipoId(rs.getString("k_tipoid"));
                mensajero.setIdMensajero(rs.getInt("k_idmensajero"));
                mensajero.setNombre(rs.getString("n_nombre"));
                mensajero.setApellido(rs.getString("n_apellido"));
                mensajero.setTelefono(rs.getLong("q_telefono"));
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
            throw new RHException("MensajeroDAO", "Error al consultar el mensajero por correo: " + e.getMessage());
        } finally {
            // Realizar rollback en caso de excepción y liberar la conexión
            ServiceLocator.getInstance().rollback();
        }

        // Devolver el objeto Mensajero o null si no se encontró
        return mensajero;
    }

}
