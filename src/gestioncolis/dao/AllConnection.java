/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Yassine
 */
public class AllConnection {
    
    private String url = "jdbc:mysql://localhost:3307/projetcolis";
    private String username="root";
    private String pass="";
    
    
    
    public AllConnection(){
        
    }
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,pass);
            return con;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    
    
  
    
    
    
    
}
