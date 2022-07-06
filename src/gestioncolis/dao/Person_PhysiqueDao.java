/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis.dao;

import gestioncolis.model.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Yassine
 */
public class Person_PhysiqueDao {
    
    AllConnection ac = new AllConnection(); 
    
    public boolean CheckPersonExistence(String email){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from person_physique where email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return false;
    }
    
    public boolean insertPerson(Person_Physique person){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into person_physique(designation,telephone,email,address,code_postal,cin,temps,password) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, person.getDesignation());
            ps.setString(2, person.getTelephone());
            ps.setString(3, person.getEmail());
            ps.setString(4, person.getAddress());
            ps.setString(5, person.getCode_postal());
            ps.setString(6, person.getCIN());
            ps.setString(7, person.getTemps());
            ps.setString(8, person.getPassword());
            
            int rs = ps.executeUpdate();
            con.close();
            return rs > 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return false;
    }
    
    public boolean updatePerson(int id,Person_Physique person){
         try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("update person_physique set designation = ?, telephone = ?, email= ?, address= ?, code_postal= ?, cin = ?, temps= ?   where id = ?");
            ps.setString(1, person.getDesignation());
            ps.setString(2, person.getTelephone());
            ps.setString(3, person.getEmail());
            ps.setString(4, person.getAddress());
            ps.setString(5, person.getCode_postal());
            ps.setString(6, person.getCIN());
            ps.setString(7, person.getTemps());
            ps.setInt(8, id);
            
            int rs = ps.executeUpdate();
            con.close();
            return rs > 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return false;
        
    }
    
    public boolean deletePerson(int id){
         try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from person_physique where id= ?");
            ps.setInt(1, id);
            
            int rs = ps.executeUpdate();
            con.close();
            return rs > 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return false;
    }
    
    public Person_Physique getPersonById(int id){
         try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from person_physique where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Person_Physique person = new Person_Physique();
                person.setId(id);
                person.setDesignation(rs.getString("designation"));
                person.setTelephone(rs.getString("telephone"));
                person.setEmail(rs.getString("email"));
                person.setAddress(rs.getString("address"));
                person.setCode_postal(rs.getString("code_postal"));
                person.setCIN(rs.getString("cin"));
                person.setTemps(rs.getString("temps"));
                person.setPassword(rs.getString("password"));
                return person;
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }
    
    public List<Person_Physique> getPersonsList(){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from person_physique");
            ResultSet rs = ps.executeQuery();
            List<Person_Physique> persons = new ArrayList();
            while(rs.next()){
                Person_Physique person = new Person_Physique();
                person.setId(rs.getInt("id"));
                person.setDesignation(rs.getString("designation"));
                person.setTelephone(rs.getString("telephone"));
                person.setEmail(rs.getString("email"));
                person.setAddress(rs.getString("address"));
                person.setCode_postal(rs.getString("code_postal"));
                person.setCIN(rs.getString("cin"));
                person.setTemps(rs.getString("temps"));
                persons.add(person);
            }
            return persons;
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }
    
    public int getNewId(){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select Max(id) from person_physique");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(0);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    
    public int LoginCheck(String email,String password){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from person_physique where email= ? and password = ?");
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("id");
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return -1;
    }
    
    public int FindPersonByEmail(String email){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from person_physique where email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("id");
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return -1;
    }
    
    public boolean updatePassword(int id,String password){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("update person_physique set password = ? where id= ?");
            ps.setString(1, password);
            ps.setInt(2, id);
            
            int rs = ps.executeUpdate();
            con.close();
            return rs > 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return false;
    }
    
}
