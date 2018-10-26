/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.lambdas;

import java.util.function.*;
import java.util.*;

/**
 *
 * @author consultor006
 * 
 * Esta clase tiene una variable d que se intenta imprimir en el método
 * Main, sin embargo esta solo esta declarada dentro del contexto 
 * del for
 */
public class Data {

    int value;

    Data(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        Data[] dataArr = new Data[]{new Data(1), new Data(2), new Data(3), new Data(4)};
        List<Data> dataList = Arrays.asList(dataArr); //1          
        for (Data element : dataList) {
            dataList.removeIf((Data d) -> {                
                System.out.println("Removed " + d + ", "); //3         
                return d.value % 2 == 0;
            });
             
        }  //2              
       
    }
}


