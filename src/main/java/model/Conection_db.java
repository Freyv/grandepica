/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author devmat
 */
public class Conection_db {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=reservasala;" + "integratedSecurity = true;"+"trustServerCertificate = true";
    
   public static Connection  getConection(){
       Connection connection = null;
       try{
       connection = DriverManager.getConnection(URL);
       System.out.println("conexão bem sucedida");
       }catch(SQLException e){
       System.out.println("falha de conexão" + e);
       }
       return connection;
   }
}
