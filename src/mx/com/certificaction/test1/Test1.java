/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificaction.test1;

import java.io.Console;

/**
 *
 * @author cesaralducinruiz
 * 
 * El metodo readLine devuelve un String 
 *y el metodo  readPassword devuelve un char por lo tanto este 
 * fragmento  de codigo no compila 
 */
public class Test1 {

    public static void main(String[] args) {
        
        java.io.Console c = new java.io.Console ();
                
        String id = c.readLine("%s", "Enter UserId:"); //1   
        System.out.println("userid is " + id); //2   
        String pwd = c.readPassword("%s", "Enter Password :"); //3   
        System.out.println("password is " + pwd); //4 
    }
}
