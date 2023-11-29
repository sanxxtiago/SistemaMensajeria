package modelo;

import util.RHException;
import javax.swing.JOptionPane;
import modelo.GestionMensajero;
import vista.ClienteMain;
public class LoginController {

    private GestionClientes gestionClientes;
    private GestionMensajero gestionMensajeros;

    public LoginController() {
        gestionClientes = new GestionClientes();
        gestionMensajeros = new GestionMensajero();
    }

    public boolean login(String email, String password) {
        try {
            Cliente cliente = gestionClientes.consultarClientePorCorreo(email);
            if (cliente != null && cliente.getPassword().equals(password)) {
                System.out.println(cliente.getIdCliente());
                ClienteMain clienteMain = new ClienteMain(cliente);
                clienteMain.setVisible(true);
                return true; // Client login successful
            }

            Mensajero mensajero = gestionMensajeros.consultarMensajeroPorCorreo(email);
            if (mensajero != null && mensajero.getContrasena().equals(password)) {
                return true; // Mensajero login successful
            }

            return false; // Login failed
        } catch (RHException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
