/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases.avanzado;

import java.time.Duration;
import java.time.LocalDate;
import java.time.*;

/**
 *
 * @author cesaralducinruiz
 *
 * Esta clase contiene las nuevas formas de crear Date, LocalDate y Time,
 * recordar que para Java 8 ya se utliza una nueva API
 * 
 * Peridodo se refiere a la diferencia entre fechas 
 * 
 * Duracion se refiere a la diferencia entre fechas en cuestion de minutos, segundos y horas.
 *
 * Para el Parametro Month.September es hora, minuto y segundo.
 */
public class NuevasFormas {

    public static void main(String[] args) {

        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10));
        System.out.println(d);
    }

}
