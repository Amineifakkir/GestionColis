/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Electronic Store
 */
public class Cnx {
    public static Connection connect() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PosteMaroc", "ntic");           
            return c;
        } catch (Exception ex) {ex.printStackTrace(); }
        return null;

    }
        
    }


    
    

    

    
    
    
    

