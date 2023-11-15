/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Deliver;

/**
 *
 * @author dsola
 */
public class DeliverDAO {
    public Deliver getDeliver(String id) {
        return new Deliver("Pepito perez", id, "pepito@gmail.com");
    }
    
    public Deliver[] getDelivers() {
        Deliver[] clients = new Deliver[4];
        clients[0] = new Deliver("Pepito perez", "abc1", "pepito@gmail.com");
        clients[1] = new Deliver("Pepito perez", "abc2", "pepito@gmail.com");
        clients[2] = new Deliver("Pepito perez", "abec3", "pepito@gmail.com");
        clients[3] = new Deliver("Pepito perez", "abec4", "pepito@gmail.com");
        return clients;
    }
}
