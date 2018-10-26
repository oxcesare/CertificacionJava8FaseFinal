/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 *
 * @author consultor006
 */
public class Book {

    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Thinking in Java", 30.0), new Book("Java in 24 hrs", 20.0), new Book("Java Recipies", 10.0));
        double averagePrice = books.stream().filter(b -> b.getPrice() > 10).mapToDouble(b -> b.getPrice()).average().getAsDouble();
        System.out.println(averagePrice);

        System.out.println("************************************************************************************");

        //List<Integer> ls = Arrays.asList(1, 2, 3);
        //ls.stream().forEach(System.out::print).map(a -> a * 2).forEach(System.out::print);
        System.out.println("**************************************************************************************");

        IntStream is1 = IntStream.range(0, 5); //1 
        OptionalDouble x = is1.average(); //2 
        System.out.println(x); //3

    }

}



