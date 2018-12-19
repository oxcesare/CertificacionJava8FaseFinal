/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.jdbc;

import java.sql.*;


/**
 *
 * @author cesaralducinruiz
 * 
 * Ejemplo de como se puede declarar un try - con recurso 
 * lo cual permite ya no tener que preocuparse por cerrar los recursos.
 * 
 * Siempre se considera una buena practica usar el try - con recurso 
 * para la interface statement
 * 
 * Connection tambien es una interface
 */
public class JdbcExample {
    
    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        
        try(Statement stmt = connection.createStatement()){
            
        }
        finally{
            
        }
    }
}
