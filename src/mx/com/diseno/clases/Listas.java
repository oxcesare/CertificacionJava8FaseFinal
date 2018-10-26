/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases;

import java.util.*;

/**
 *
 * @author consultor006
 */
public class Listas {
    
    public static void main(String[] args) {
        
        List<String> listaNumeros = new ArrayList<String>();
        List<String> proceso = new ArrayList<String>();
        
        listaNumeros.add("9514780204");
        listaNumeros.add("9514780205");
        listaNumeros.add("7442963315");
        listaNumeros.add("2293749618");

        //Proceso
        proceso.add("9514780202");
        proceso.add("9514780201");
        proceso.add("9514780201");
        proceso.add("9514780204");
        
        for (int i = 0; i < proceso.size(); i++) {
            if (listaNumeros.contains(proceso.get(i))) {
                System.out.println("Son iguales");
            } else {                
            }
        }
        
    }
    
}
