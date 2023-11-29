/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamensajeria;

import conexion.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ServiceLocator;

import vista.customer.Customer;
/**
 *
 * @author Santiago
 */
public class SistemaMensajeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Establece la conexión con la bd alojada en la nube
        Conexion.getSingleton().establecerConexion();
        ServiceLocator.getInstance().tomarConexion();
        try {
            System.out.println(!Conexion.getSingleton().connection.isClosed());
            if(!Conexion.getSingleton().connection.isClosed()) {
                Customer.getInstance();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SistemaMensajeria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
