/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases;

import java.util.stream.Stream;

/**
 *
 * @author consultor006
 * 
 * El modificador de acceso al que estamos tratando de accesar
 * es de tipo private al momento de sobrescribir el metodo y el compilador
 * por lo tanto nos genera un error.
 * 
 * 
 */
public class A {

    A() {
        print();
    }

    /**
     * El modificador tendria que ser public para que no mande error,
     * 
     * private solo aplica para metodos y atributos dentro de la misma clase 
     */
    protected void print() {
        System.out.println("A");
    }
}

class B extends A {

    int i = Math.round(3.5f);

    public static void main(String[] args) {
        A a = new B();
        a.print();
        
        Stream  impares = Stream.iterate(1, x -> x + 2).limit(10);
        System.out.println("impares"+" " + impares);
    }

    public void print() {
        System.out.println(i);
    }
}
