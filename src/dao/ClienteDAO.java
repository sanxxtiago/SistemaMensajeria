/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import modelo.Cliente;
import util.RHException;
import util.ServiceLocator;

import java.sql.SQLException;

/**
 *
 * @author Santiago
 */
public class ClienteDAO {
    
    public ClienteDAO(){

    }

    public void registroCliente(Cliente cliente) throws RHException{//Clase que maneja el acceso a la tabla clientes de la BD.
        try{
            String strSQL = "INSERT INTO cliente(k_tipoid, k_idcliente, n_nombre, n_apellido, q_telefono, n_correo, n_contrasena)  VALUES(?,?,?,?,?,?,?)";
            Connection conexion = ServiceLocator.getInstance().tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.setString(1,cliente.getTipoID()); 
            prepStmt.setInt(2, cliente.getIdCliente()); 
            prepStmt.setString(3, cliente.getNombre()); 
            prepStmt.setString(4, cliente.getApellido()); 
            prepStmt.setInt(5, cliente.getTelefono());   
            prepStmt.setString(6, cliente.getCorreo());  
            prepStmt.setString(7, cliente.getPassword());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance().commit();
        }catch(SQLException e){
            ServiceLocator.getInstance().rollback();
            throw new RHException( "ClienteDAO", "No pudo crear el cliente"+ e.getMessage());
        }finally{
            ServiceLocator.getInstance().liberarConexion();
        }
    }


}
