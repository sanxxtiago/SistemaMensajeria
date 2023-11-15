/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Deliver;
import modelo.Service;

/**
 *
 * @author dsola
 */
public class ServiceDAO {
    public Service getService(String id) {
        return new Service(" bnvcb12", 2, "pending");
    }
    
    public Service[] getServices() {
        Deliver deliver = new Deliver("Pepito perez", "abc1", "pepito@gmail.com");
        Service[] services = new Service[2];
        services[0] = new Service(" bnvcb12", 2, "pending");
        services[1] = new Service("Pepito perez", deliver, 5, "completed");
        return services;
    }
}
