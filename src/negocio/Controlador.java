package negocio;

import util.RHException;
import dao.ClienteDAO;
import modelo.Cliente;

public class Controlador {//Clase que permite controlar la app.
    private ClienteDAO clienteDAO;
    private Cliente cliente;

    public Controlador(){
        clienteDAO = new ClienteDAO();
    }

    //Metodo para registrar un cliente dados sus datos.
    public void registroCliente(String tipoID, int idCliente, String nombre, String apellido, int telefono, String correo, String password) throws RHException{  
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
}
