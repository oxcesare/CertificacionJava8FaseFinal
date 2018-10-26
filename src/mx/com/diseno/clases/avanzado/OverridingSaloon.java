/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases.avanzado;

/**
 *
 * @author consultor006
 */

interface X {
    public int m2();
}
class Saloon {

    protected int m1() {
        return 0;
    }
}

public class OverridingSaloon extends Saloon  implements X{

    @Override
    public int m2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
