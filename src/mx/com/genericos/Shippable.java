/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.genericos;

/**
 *
 * @author consultor006
 */
public interface Shippable<T> {

    void ship(T t);
}

class ShippableAbstractCrate<U> implements Shippable<U> {

    public void ship(U u) {

    }
}

class C {

}

class D {

}
