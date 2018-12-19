/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.ejemplos;

/**
 *
 * @author cesaralducinruiz
 *
 * Recordar que las interfaces también pueden llevar
 *
 * metodos con implementacion y no solo abstractos para que esta regla se cumpla
 * los metodos que se declaran deben de ser public default.
 * 
 * 
 * Si tienes un metodo en la interface e implementas esta entonces debes de implementar el metodo
 * el mismo IDE te indica que tienes que hacerlo.
 * 
 *
 *
 */
public interface Hola {

    public default String cadena() {
        return "000";
    }
    
    public void jump();
}

class A implements Hola {
    public static void main(String[] args) {
        
        Hola hola = new A (); //hacemos una instancia de la interface utilizando la clase A
        hola.cadena();
        
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
