/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases.avanzado;

/**
 *
 * @author consultor006
 * 
 * La teoria dice que los bloques estaticos se ejecutan al cargar 
 * la clase, si se tiene un constructor definido igualmente se carga el bloque
 * estatico. 
 */
public class StaticTest {

    static {
        System.out.println("In static");
    }
    
    public StaticTest() {
        System.out.println("Constructor de la clase");
    }
      
    public static void main(String[] args) {
      StaticTest estaticos = new StaticTest();              
    }

}
