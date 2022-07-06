/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis;

import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import gestioncolis.dao.*;
import gestioncolis.model.*;
/**
 *
 * @author Yassine
 */
public class Extras {
    public int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
    }
    
    
    public String generatePassword(){
        String password;
        char[] pass = new char[8];
        
        int r1 = getRandomNumber(65,90);
        pass[0] = (char) r1;
        int r2;
        for(int i=1;i<8;i++){
            r2 = getRandomNumber(97,122);
            pass[i] = (char) r2;
        }
        password = String.valueOf(pass);
        return password;
    }
    
    public void sendEmail(String to,String subject,String content){
        if(NetworkConnectionVerify()){
            String from = "";
            String host = "localhost";
            Properties p = new Properties();
            p.put("mail.smtp.auth","true");
            p.put("mail.smtp.starttls.enable","true");
            p.put("mail.smtp.host","smtp.gmail.com");
            p.put("mail.smtp.port","587");
            Session s = Session.getDefaultInstance(p,new javax.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("testprojet2003@gmail.com","Yassine+3");
                }
            });
            try{
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                m.setSubject(subject);
                m.setText(content);
                Transport.send(m);
               // System.out.println("Success. Email sent");
            }catch(Exception ex){
                System.out.println(ex);
               
            }
            
        }
        
    }
    
    public boolean NetworkConnectionVerify(){
        try {
         URL url = new URL("http://www.google.com");
         URLConnection connection = url.openConnection();
         connection.connect();
         return true;
        // System.out.println("Internet is connected");
      } catch (Exception e) {
         // System.out.println(e);
         return false;
      } 
       
    }
    
    
    public String makeReference(){
        char reference[] = new char[16];
        
        int r1 = getRandomNumber(65,90);
        reference[0] = (char) r1;
        
        for(int i=1;i<16;i++){
            int r2 = getRandomNumber(97,122);
            reference[i] = (char) r2;
        }
        
        return String.valueOf(reference);
    }
    
    public void ColisTable(JTable table,int id,int type){
        
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         Object row[];
         if(type == 0){
             
             Colis_PhysiqueDao dao = new Colis_PhysiqueDao();
             List<Colis_Physique> list = dao.getColisListById(id);
             for(int i=0 ; i<list.size();i++){
                 row = new Object[6];
                 row[0] = list.get(i).getReference();
                 row[1] = list.get(i).getDescription();
                 row[2] = list.get(i).getAddress_destination();
                 row[3] = list.get(i).getStatus();
                 row[4] = list.get(i).getPoid();
                 row[5] = list.get(i).getPrix();
                 
                model.addRow(row);
             }
             
         }else if(type == 1){
             Colis_MoraleDao dao = new Colis_MoraleDao();
             List<Colis_Morale> list = dao.getColisListById(id);
             
             for(int i=0;i<list.size();i++){
                 row = new Object[6];
                 row[0] = list.get(i).getReference();
                 row[1] = list.get(i).getDescription();
                 row[2] = list.get(i).getAddress_destination();
                 row[3] = list.get(i).getStatus();
                 row[4] = list.get(i).getPoid();
                 row[5] = list.get(i).getPrix();
                model.addRow(row);
             }
         }else {
             System.out.println("Test type is wrong");
         }
         
         
    }
    
}
