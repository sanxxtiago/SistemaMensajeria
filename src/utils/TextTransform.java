/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author dsola
 */
public class TextTransform {
     public static String getTimeElapsed(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime ahora = LocalDateTime.now();
        Duration duracion = Duration.between(LocalDateTime.parse(fecha, formatter), ahora);

        long horas = duracion.toHours();
        long minutos = duracion.toMinutes() % 60;
        return String.format("%d horas y %d minutos", horas, minutos);
    }
}
