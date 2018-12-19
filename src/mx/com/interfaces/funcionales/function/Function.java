/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.interfaces.funcionales.function;


import java.util.function.Function.*;

/**
 *
 * @author cesaralducinruiz
 *
 * Esta interface funcional sirve para crear una solución y devolver un tipo de
 * esa solucion.
 */
public class Function {

    public static void main(String[] args) {


    }

    public static void funcion() {
        Function<Integer, Double> centigradeToFahrenheitInt = x -> new Double((x * 9 / 5) + 32);

        Function<String, Integer> stringToInt = x -> Integer.valueOf(x);
        
        Integer centigrade =null;

        System.out.println("Centigrade to Fahrenheit: " + centigradeToFahrenheitInt.apply(centigrade));
        
        System.out.println(" String to Int: " + stringToInt.apply("4"));

    }

}
