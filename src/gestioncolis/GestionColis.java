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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.regex.Pattern;

/**
 *
 * @author Electronic Store
 */
public class GestionColis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
}
      public static int executerMAJ(String req){
        int rs=-1;
          try {
              
              Class.forName("oracle.jdbc.OracleDriver");
            Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","PosteMaroc", "ntic");         
         
              Statement st=cn.createStatement();
              rs=st.executeUpdate(req);

          } catch (Exception ex) {
              System.out.println(ex.getMessage());
          }

          return rs;
        }
}

    
    
