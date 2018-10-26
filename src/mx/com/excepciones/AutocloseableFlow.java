/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.excepciones;

import javax.management.RuntimeErrorException;

/**
 *
 * @author consultor006
 *
 * Ejemplo de la implementacion de Autocloseable, recordar que esta interface
 * implementa el método close.
 * 
 * Dentro de una clase podemos encontrar clases staticas internas.
 * 
 * En este ejemplo se imprimen todas las variables debido a que la clase statatica
 * Window manda lanza un RuntimeException y eso hace que se mande a llamar  a catch
 *
 */
public class AutocloseableFlow {

    static class Door implements AutoCloseable {

        public void close() {
            System.out.println("D");
        }
    }
    
    static class Window implements AutoCloseable {
        public void close() {
            System.out.println("W");
            throw new RuntimeException();
        }
    }
    
    public static void main (String []args){
        /**
         * Implementación de un try nueva version
         * donde ya no es necesario poner el catch
         * 
         * Estan los otros bloques como ejemplificacion 
         */
        try(Door d = new Door();Window w = new Window()) {
            System.out.println("T");
        }
//        } catch (Exception e) {
//            System.out.println("E");
//        }finally{
            System.out.println("F");
        //}
    }

}
