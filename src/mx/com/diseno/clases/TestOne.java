/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 * 
 * Las listas comienzan desde la posicion 0 y los tamaños desde 1
 * 
 * un Arreglo puede tener un tamaño de 5 pero comienza a llenarse desde la posición 0.
 * 
 */
public class TestOne {
    public static void main(String[] args) throws Exception {
        List  al = new ArrayList(); //1
        al.add(111); //2
        System.out.println("size"+" "+al.size());
        System.out.println(""+al.get(0));
       // System.out.println(al.get(al.size()));  //3
     }
}
