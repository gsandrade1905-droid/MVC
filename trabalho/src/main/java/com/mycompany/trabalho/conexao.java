/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class conexao {
     private static final String URL = "jdbc:mysql://localhost:3306/sistema_login";
    private static final String User = "root";
    private static final String Senha = "1234";
    
    public static Connection conectar(){
        try {
            return DriverManager.getConnection( URL,User, Senha);
        }
        catch (SQLException e){
            throw new RuntimeException("ERRO AO CONECTAR ", e);
        }
    }
    
    
}
