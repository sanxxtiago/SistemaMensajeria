package negocio;

import util.RHException;

import java.util.List;

//import dao.ClienteDAO;
import dao.ServicioDAO;
import dao.MensajeroDAO;
//import modelo.Cliente;
import modelo.Servicio;
import modelo.Mensajero;

public class Controlador {

    //private ClienteDAO clienteDAO;
    private ServicioDAO servicioDAO;
    private MensajeroDAO mensajeroDAO;
    //private Cliente cliente;

    public Controlador() {
        //clienteDAO = new ClienteDAO();
        servicioDAO = new ServicioDAO();
        mensajeroDAO = new MensajeroDAO();
    }

        // Método para consultar servicios por ID de cliente
    public List<Servicio> consultarServiciosPorIdCliente(int idCliente) throws RHException {
        return servicioDAO.consultarServiciosPorIdCliente(idCliente);
    }

    // Método para consultar servicios por estado
    public List<Servicio> consultarServiciosPorEstado(String estado) throws RHException {
        return servicioDAO.consultarServiciosPorEstado(estado);
    }

    // Método para consultar un mensajero por ID
    public Mensajero consultarMensajeroPorId(int idMensajero) throws RHException {
        return mensajeroDAO.consultarMensajeroPorId(idMensajero);
    }

/*
    // Método para registrar un cliente dados sus datos.
    public void registroCliente(String tipoID, int idCliente, String nombre, String apellido, int telefono,
            String correo, String password) throws RHException {
        cliente = new Cliente();
        cliente.setTipoID(tipoID);
        cliente.setIdCliente(idCliente);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);
        cliente.setPassword(password);

        clienteDAO.registroCliente(cliente);
    }
 */
}
