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

    public void registroMensajero(Mensajero mensajero) throws RHException {//Clase que maneja el acceso a la tabla clientes de la BD.
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
        } catch (SQLException e) {
            ServiceLocator.getInstance().rollback();
            throw new RHException("MensajeroDAO", "No pudo crear el mensajero -> " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

}
