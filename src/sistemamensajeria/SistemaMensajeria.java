/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamensajeria;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Santiago
 */
public class SistemaMensajeria {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        //Establece la conexión con la bd alojada en la nube
        Conexion.getSingleton().establecerConexion();
        
        try {
            System.out.println(Conexion.getSingleton().connection.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(SistemaMensajeria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
