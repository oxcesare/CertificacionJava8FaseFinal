/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.semana.uno;


import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;
/**
 *
 * @author cesaralducinruiz
 */
public class ExamplesGenericos {
    
    
    public static void main(String[] args) {
        String x="ABC";
        
        //System.out.println(""+x.length());
        
        
        Stream<String> stream = Stream.of("A","B","C","D");
        
        System.out.println(""+stream.peek(System.out::print).findAny().orElse("NA"));
        
        Path path = Paths.get(".\\");
        
        File file = new File("ocjpa.txt");
        file.getAbsolutePath();
        
        
        
    }
}
