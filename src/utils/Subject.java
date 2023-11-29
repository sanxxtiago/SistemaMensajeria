/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import modelo.Mensajero;
import modelo.Servicio;
/**
 *
 * @author dsola
 */


public class Subject {
    private List<Observer> observadores = new ArrayList<>();

    // Método para agregar observadores
    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    // Método para notificar a todos los observadores
    public void notificarObservadores(Servicio servicio, Mensajero mensajero) {
        for (Observer observador : observadores) {
            observador.actualizar(servicio, mensajero);
        }
    }

}
