/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dsola
 */
public class Service {
    private String id;
    private Deliver deliver;
    private int trayectos;
    private String state;
    
    public Service(String id, Deliver deliver,int trayectos, String state){
        this.id = id;
        this.deliver = deliver;
        this.trayectos = trayectos;
        this.state = state;
    }
    
    public Service(String id, int trayectos, String state){
        this.id = id;
        this.trayectos = trayectos;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Deliver getDeliver() {
        return deliver;
    }

    public void setDeliver(Deliver deliver) {
        this.deliver = deliver;
    }

    public int getTrayectos() {
        return trayectos;
    }

    public void setTrayectos(int trayectos) {
        this.trayectos = trayectos;
    }

       
}
