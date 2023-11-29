package modelo;


import dao.MensajeroDAO;
import java.util.List;
import modelo.Mensajero;
import util.RHException;

/**
 * Clase controladora de la aplicación para manejar operaciones de clientes.
 */
public class GestionMensajero {
    private MensajeroDAO mensajeroDAO;

    public GestionMensajero() {
        mensajeroDAO = new MensajeroDAO();
    }

    /**
     * Registra un nuevo cliente en el sistema.
     *
     * @throws RHException Si ocurre un error en el registro.
     */
    public void registrarMensajero(Mensajero mensajero) throws RHException {
        mensajeroDAO.registroMensajero(mensajero);
    }
    /**
     * Consulta la información de un cliente por su correo electrónico.
     *
     * @param correo El correo electrónico del cliente.
     * @return Cliente El cliente consultado.
     * @throws RHException Si ocurre un error durante la consulta.
     */
    public Mensajero consultarMensajeroPorCorreo(String correo) throws RHException {
        return mensajeroDAO.consultarMensajeroPorCorreo(correo);
    }

}
