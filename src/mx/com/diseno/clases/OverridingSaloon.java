/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases;

/**
 *
 * @author consultor006
 * 
 * Cuando sobreescribimos un metodo de a clase padre y este 
 * es de menor nivel de accesibilidad entonces el compilador nos indica que 
 * existe un error, en este ejemplo el metodo de la clase padre es protected
 * y cuando lo sobrescribimos no tiene modificador de acceso es decir es default.
 * 
 * la jerarquia es : private, public, protected, default. 
 */
abstract class Saloon {

    protected int m1() {
        return 0;
    }
}

public class OverridingSaloon extends Saloon {

    int m1() {
        return 1;
    }
}
