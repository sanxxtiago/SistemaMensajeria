package negocio;

import util.RHException;
import dao.ClienteDAO;
import dao.MensajeroDAO;
import dao.ServicioDAO;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mensajero;
import modelo.Servicio;

public class Controlador {//Clase que permite controlar la app.

    private ClienteDAO clienteDAO;
    private MensajeroDAO mensajeroDAO;
    private ServicioDAO servicioDAO;
    
    public Controlador() {
        clienteDAO = new ClienteDAO();
        mensajeroDAO = new MensajeroDAO();
        servicioDAO = new ServicioDAO();
    }

    //Metodo para registrar un cliente dados sus datos.
    public boolean registroCliente(Cliente cliente) throws RHException {
        return clienteDAO.registroCliente(cliente);
    }
    
    public boolean registroMensajero(Mensajero mensajero) throws RHException{
        return mensajeroDAO.registroMensajero(mensajero);
    }
    
    public ArrayList<Servicio> getServiciosSinAsignar(){
        return servicioDAO.getServiciosSinAsignar();
    }
}
