/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo2.general;

import java.util.function.Predicate;

/**
 *
 * @author consultor006
 *
 * 1. Recordar que en el paquete java.util.function estan todas las interfaces
 * funcionales 2. Para este ejercicio se hace uso de la interface funcional
 * Predicate
 *
 * 2. El metodo Test recibe un objeto panda y ese objeto esta pasado como
 * parametro en la interface funcional Predicate
 *
 * 3. El metodo test pertece a la interface funcional Predicate
 */
public class Panda {

    int age;

    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        check(p1, p -> p.age < 5);

        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Respuesta></TOKEN><IdError>-1</IdError><MsgError>E-Se ha bloqueado al usuario por accesos incorrectos.</MsgError></Respuesta>";

        String encabezado = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

        String xmlC = xml.replace(encabezado, "");
        
        System.out.println("xmlC"+ " " + xmlC);

    }
    
    /**
     * 
     * @param panda
     * @param pred 
     * 
     * La interface funcional tiene un metodo test de tipo boolean 
     * que recibe un objeto para saber si es del tipo del que fue declarado.
     */
    private static void check(Panda panda, Predicate<Panda> pred) {
        String result = pred.test(panda) ? "match" : "no match";
        System.out.println(result);
    }

}
