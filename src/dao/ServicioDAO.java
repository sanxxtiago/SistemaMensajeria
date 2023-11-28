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

    public ServicioDAO(){
    }

    public List<Servicio> consultarServiciosPorEstado(String estado) throws RHException {
        List<Servicio> servicios = new ArrayList<>();

        try {
            String strSQL = "SELECT * FROM public.servicio WHERE estado = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1, estado);

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {
                // Mapear los resultados a objetos Servicio y agregarlos a la lista
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
            ServiceLocator.getInstance().liberarConexion();
        }
        return servicios;
    }   

    public List<Servicio> consultarServiciosPorIdCliente(int idCliente) throws RHException {
        List<Servicio> servicios = new ArrayList<>();

        try {
            String strSQL = "SELECT * FROM public.servicio WHERE idCliente = ?";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, idCliente);

            ResultSet rs = prepStmt.executeQuery();

            while (rs.next()) {
                // Mapear los resultados a objetos Servicio y agregarlos a la lista
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
            throw new RHException("ServicioDAO", "Error al consultar servicios por ID de cliente: " + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }

        return servicios;
    }
}
