/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificaction.test7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/**
 *
 * @author cesaralducinruiz
 */
public class Test2 {

    public static void main(String[] args) {
        List<String> myList
                = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
