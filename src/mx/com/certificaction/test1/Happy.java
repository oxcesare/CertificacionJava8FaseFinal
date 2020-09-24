/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificaction.test1;

/**
 *
 * @author cesaralducinruiz
 */
public class Happy {
    int id;
    Happy(int i){
        this.id=i;
    }
    
    public static void main(String[] args) {
        Happy h1 = new Happy(1); //1
        Happy h2 = h1.go(h1);
        System.out.println(h2.id);
        
    }
    
    Happy go(Happy h){
        Happy h3 = h; //al crearse este objeto h valdra lo que contenga h3
        Happy h1 = h;
        h3.id=5;
        h1.id=h.id;
        return h1;
    }
    
}
