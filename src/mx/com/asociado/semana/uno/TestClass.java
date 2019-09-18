/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.semana.uno;

/**
 *
 * 
 * @author cesaralducinruiz
 * 
 * Ejemplo de la llamada a super utilizando la herencia
 * 
 * 
 */
public class TestClass {

    public static void main(String args[]) {
        B c = new C();
        System.out.println(c.max(10, 20));
    }
}

class A {

    int max(int x, int y) {
        System.out.println("A");
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

class B extends A {

    int max(int x, int y) {
        System.out.println("B");
        return 2 * super.max(x, y);
    }
}

class C extends B {

    int max(int x, int y) {
        System.out.println("C");
        return super.max(2 * x, 2 * y);
    }
}
