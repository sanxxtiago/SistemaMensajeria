package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelo.Servicio;
import util.RHException;
import util.ServiceLocator;

public class ServicioDAO {

    public ServicioDAO() {

    }

    public void registroServicio(Servicio servicio) throws RHException {//Clase que maneja el acceso a la tabla servicio de la BD.
        try {
            String strSQL = "INSERT INTO public.servicio(k_idservicio, k_tipoidcliente, k_idcliente,"
                    + " k_tipoidmensajero, k_idmensajero, k_codigopostal, q_costo, i_tipopaquete, f_solicitud,"
                    + " i_estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setInt(1, servicio.getIdServicio());
            prepStmt.setString(2, servicio.getTipoIdCliente());
            prepStmt.setInt(3, servicio.getIdCliente());
            prepStmt.setString(4, servicio.getTipoIdMensajero());
            prepStmt.setInt(5, servicio.getIdMensajero());
            prepStmt.setInt(6, servicio.getCodigoPostal());
            prepStmt.setInt(7, servicio.getCosto());
            prepStmt.setString(8, servicio.getTipoPaquete());
            prepStmt.setDate(9, java.sql.Date.valueOf(servicio.getF_solicitud()));
            prepStmt.setString(10, servicio.getEstado());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        } catch (SQLException e) {
            ServiceLocator.getInstance().rollback();
            throw new RHException("ServicioDAO", "No pudo crear el servicio" + e.getMessage());
        } finally {
            ServiceLocator.getInstance().liberarConexion();
        }
    }

    public ArrayList<Servicio> getServiciosSinAsignar() {
        ArrayList<Servicio> serviciosSinAsignar = new ArrayList<>();
        String strSQL = "SELECT k_idservicio, k_tipoidcliente, k_idcliente, "
                + "k_tipoidmensajero, k_idmensajero, k_codigopostal, q_costo, i_tipopaquete, f_solicitud, i_estado FROM servicio;";
        Connection conexion = ServiceLocator.getInstance().tomarConexion();
        try {
            PreparedStatement pstmt = conexion.prepareStatement(strSQL);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int idServicio = rs.getInt("k_idservicio");
                String tipoIdCliente = rs.getString("k_tipoidcliente");
                int idCliente = rs.getInt("k_idcliente");
                String tipoIdMensajero = rs.getString("k_tipoidmensajero");
                int idMensajero = rs.getInt("k_idmensajero");
                int codigoPostal = rs.getInt("k_codigopostal");
                int costo = rs.getInt("q_costo");
                String tipoPaquete = rs.getString("i_tipopaquete");
                Date solicitud = rs.getDate("f_solicitud");
                String estado = rs.getString("i_estado");

                Servicio servicio = new Servicio();
                servicio.setIdServicio(idServicio);
                servicio.setTipoIdCliente(tipoIdCliente);
                servicio.setIdCliente(idCliente);
                servicio.setTipoIdMensajero(tipoIdMensajero);
                servicio.setIdMensajero(idMensajero);
                servicio.setCodigoPostal(codigoPostal);
                servicio.setCosto(costo);
                servicio.setTipoPaquete(tipoPaquete);
                servicio.setF_solicitud(solicitud.toString());
                servicio.setEstado(estado);

                serviciosSinAsignar.add(servicio);

            }
            return serviciosSinAsignar;
        } catch (SQLException ex) {
            Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Es una buena práctica cerrar la conexión en el bloque finally
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ServicioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
