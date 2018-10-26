/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.diseno.clases;

/**
 *
 * @author consultor006
 */
public class Test2 {

    public static void stringTest(String s) {
        s.replace('h', 's');
    }

    public static void stringBuilderTest(StringBuilder s) {
        s.append("o");
    }

    public static void main(String[] args) {
        String s = "hell";
        StringBuilder sb = new StringBuilder("well");
        stringTest(s);
        stringBuilderTest(sb);
        System.out.println(s + sb);
        String c = new String();
        c.intern(); //El método intern retorna un valor canonico 
        
    }
}
