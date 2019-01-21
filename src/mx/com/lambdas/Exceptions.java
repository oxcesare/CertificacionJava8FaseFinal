/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.lambdas;

/**
 *
 * @author cesaralducinruiz
 *
 * Se pueden manejar exceptiones con expresiones lambda, sin embargo no se
 * pueden lanzar directamente para ello es necesario capturar dentro de la
 * expresion lambda una exception.
 * 
 * Una regla que se puede manejar es declar la expresion lambda
 * desde ahí hacer la invocación al método y posteriormente 
 * dentro del metodo capturar la exception.
 * 
 * 
 * Continuando con una buena practica lo correcto sería crear
 * una interface funcional en cuya implementacion se haga la validacion
 * de la exception y ya invocarla dentro de la expresion lambda.
 * 
 * 
 */
public class Exceptions {

    public static void main(String[] args) {
        myList.stream()
                .map(item -> {
                    return doSomething(item);
                })
                .forEach(System.out::println);
    }

}
