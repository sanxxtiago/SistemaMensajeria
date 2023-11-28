package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Servicio;
import util.RHException;
import util.ServiceLocator;

public class ServicioDAO {

    // Constructor Servicio
    public ServicioDAO() {
        // Constructor vacío por ahora
    }

    // Método para consultar servicios por estado
    public List<Servicio> consultarServiciosPorEstado(String estado) throws RHException {
        List<Servicio> servicios = new ArrayList<>();

        try {
            // Consulta SQL para seleccionar servicios por estado
            String strSQL = "SELECT * FROM public.servicio WHERE estado = ?";
            
            // Obtener la conexión desde el ServiceLocator
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            
            // PS para ejecutar la consulta
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, estado);

            ResultSet rs = prepStmt.executeQuery();

            // Itera sobre los resultados y los "convierte" a objetos Servicio
            while (rs.next()) {
                Servicio servicio = new Servicio();
                servicio.setIdServicio(rs.getInt("idServicio"));
                servicio.setTipoIdCliente(rs.getString("tipoIdCliente"));
                servicio.setIdCliente(rs.getInt("idCliente"));
                servicio.setTipoIdMensajero(rs.getString("tipoIdMensajero"));
                servicio.setIdMensajero(rs.getInt("idMensajero"));
                servicio.setCodigoPostal(rs.getInt("codigoPostal"));
                servicio.setCosto(rs.getInt("costo"));
                servicio.setTipoPaquete(rs.getString("tipoPaquete"));
                servicio.setF_solicitud(rs.getString("f_solicitud"));
                servicio.setEstado(rs.getString("estado"));

                servicios.add(servicio);
            }
            rs.close();
            prepStmt.close();

        } catch (SQLException e) {
            throw new RHException("ServicioDAO", "Error al consultar servicios por estado: " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().rollback();
        }

        // Devolver la lista de servicios
        return servicios;
    }

    // Método para consultar servicios por ID de cliente
    public List<Servicio> consultarServiciosPorIdCliente(int idCliente) throws RHException {
        List<Servicio> servicios = new ArrayList<>();

        try {
            // Consulta SQL para seleccionar servicios por ID de cliente
            String strSQL = "SELECT * FROM public.servicio WHERE idCliente = ?";
            
            // Obtener la conexión desde el ServiceLocator
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            
            // PS preparada para ejecutar la consulta
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, idCliente);

            // Ejecutar la consulta 
            ResultSet rs = prepStmt.executeQuery();

            // Itera sobre los resultados y los "convierte" a objetos Servicio
            while (rs.next()) {
                Servicio servicio = new Servicio();
                servicio.setIdServicio(rs.getInt("idServicio"));
                servicio.setTipoIdCliente(rs.getString("tipoIdCliente"));
                servicio.setIdCliente(rs.getInt("idCliente"));
                servicio.setTipoIdMensajero(rs.getString("tipoIdMensajero"));
                servicio.setIdMensajero(rs.getInt("idMensajero"));
                servicio.setCodigoPostal(rs.getInt("codigoPostal"));
                servicio.setCosto(rs.getInt("costo"));
                servicio.setTipoPaquete(rs.getString("tipoPaquete"));
                servicio.setF_solicitud(rs.getString("f_solicitud"));
                servicio.setEstado(rs.getString("estado"));

                servicios.add(servicio);
            }
            // Cierre
            rs.close();
            prepStmt.close();

        } catch (SQLException e) {
            throw new RHException("ServicioDAO", "Error al consultar servicios por ID de cliente: " + e.getMessage());
        } finally {

            ServiceLocator.getInstance().rollback();
        }
        // Devolver la lista de servicios
        return servicios;
    }
}
