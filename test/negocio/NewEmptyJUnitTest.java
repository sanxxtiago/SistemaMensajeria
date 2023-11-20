/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package negocio;

import modelo.Cliente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Santiago
 */
public class NewEmptyJUnitTest {
    
    @Test
    public void testGetSingleton() throws Exception {
        Cliente c = new Cliente();
        System.out.println(Conexion.getSingleton().conn.isClosed());
        boolean expResult = false;
        assertEquals(expResult, Conexion.getSingleton().conn.isClosed());
        // TODO review the generated test code and remove the default call to fail.
        fail("La conexión está cerrada");
    }

}
