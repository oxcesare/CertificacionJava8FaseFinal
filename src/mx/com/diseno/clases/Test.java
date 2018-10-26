/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases;

import other.*;

/**
 *
 * @author consultor006
 */
public class Test {
//
//    public int methodA(int a) {
//        return a * 2;
//    } //1     
//    public long methodA(int a){  return a; } //2

    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
       // System.out.print((other.hello == hello) + " ");    //line 1
        System.out.print((other.Other.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel" + "lo")) + " ");           //line 3
        System.out.print((hello == ("Hel" + lo)) + " ");              //line 4
        System.out.println(hello == ("Hel" + lo).intern());          //line 5
        
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
    }
}
