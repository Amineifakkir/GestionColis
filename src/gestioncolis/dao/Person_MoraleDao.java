/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis.dao;

import gestioncolis.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Yassine
 */
public class Person_MoraleDao {
    
    AllConnection ac = new AllConnection();
    
    public boolean CheckPersonExistence(String email){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from person_morale where email = ?");
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
    
    public boolean insertPerson(Person_Morale person){
        if(!CheckPersonExistence(person.getEmail())){
            try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into person_morale (nom,telephone,email,address,code_postal,ice,temps,password) values(?,?,?,?,?,?,?,?)");
            ps.setString(1,person.getNom());
            ps.setString(2,person.getTelephone());
            ps.setString(3,person.getEmail());
            ps.setString(6,person.getAddress());   
            ps.setString(4,person.getCode_postal());
            ps.setString(5,person.getIce());
            ps.setString(7,person.getTemps());
            ps.setString(8, person.getPassword());
            
            int rs = ps.executeUpdate();
            con.close();
            return rs > 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
        
        return false;
    }
    
    public boolean updatePerson(int id,Person_Morale person){
        if(CheckPersonExistence(getPersonById(id).getEmail())){
            try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("update person_morale set nom = ?, telephone= ?, email = ?, address = ?, code_postal = ?, ice= ?, temps= ? where id= ?");
            ps.setString(1,person.getNom());
            ps.setString(2,person.getTelephone());
            ps.setString(3,person.getEmail());
            ps.setString(6,person.getAddress());   
            ps.setString(4,person.getCode_postal());
            ps.setString(5,person.getIce());
            ps.setString(7,person.getTemps());
            ps.setInt(8, id);
            
            int rs = ps.executeUpdate();
            con.close();
            return rs > 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
        
        return false;
    }
    
    public boolean deletePerson(int id){
        if(CheckPersonExistence(getPersonById(id).getEmail())){
            try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from person_morale where id = ?");
            ps.setInt(1, id);
            
            int rs = ps.executeUpdate();
            con.close();
            return rs > 0;
        }catch(Exception ex){
            System.out.println(ex);
        }
            
        }
        
        
        return false;
    }
    
    public Person_Morale getPersonById(int id){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from person_morale where id = ?");
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Person_Morale person = new Person_Morale();
                person.setId(id);
                person.setNom(rs.getString("nom"));
                person.setTelephone(rs.getString("telephone"));
                person.setEmail(rs.getString("email"));
                person.setAddress(rs.getString("address"));
                person.setCode_postal(rs.getString("code_postal"));
                person.setIce(rs.getString("ice"));
                person.setTemps(rs.getString("temps"));
                person.setPassword(rs.getString("password"));
                return person;
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    
    
    public List<Person_Morale> getPersonsList(){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from person_morale");
            ResultSet rs = ps.executeQuery();
            List<Person_Morale> persons = new ArrayList();
            
            while(rs.next()){
                Person_Morale person = new Person_Morale();
                person.setId(rs.getInt("id"));
                person.setNom(rs.getString("nom"));
                person.setTelephone(rs.getString("telephone"));
                person.setEmail(rs.getString("email"));
                person.setAddress(rs.getString("address"));
                person.setCode_postal(rs.getString("code_postal"));
                person.setIce(rs.getString("ice"));
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
            PreparedStatement ps = con.prepareStatement("Select Max(id) from person_morale");
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
            PreparedStatement ps = con.prepareStatement("Select * from person_morale where email= ? and password = ?");
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
            PreparedStatement ps = con.prepareStatement("Select * from person_morale where email = ?");
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
            PreparedStatement ps = con.prepareStatement("update person_morale set password = ? where id= ?");
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
