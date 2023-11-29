package modelo;

import dao.ServicioDAO;
import java.util.ArrayList;
import java.util.List;
import util.RHException;

/**
 * Clase controladora de la aplicación para manejar operaciones de clientes.
 */
public class GestionServicio {
    private ServicioDAO servicioDAO;
    private Servicio servicio;

    public GestionServicio() {
        servicioDAO = new ServicioDAO();
    }

    /**
     * Registra un nuevo cliente en el sistema.
     *
     * @param servicio servicio que se va a registrar
     * @throws RHException Si ocurre un error en el registro.
     */
    public void registrarServicio(Servicio servicio) throws RHException {
        servicioDAO.registroServicio(servicio);
    }

    public ArrayList<Servicio> consultarServicioSinAsignar() throws RHException {
        return servicioDAO.getServiciosSinAsignar();
    }
}
