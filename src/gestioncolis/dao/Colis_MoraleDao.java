/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis.dao;

import gestioncolis.model.Colis_Morale;
import gestioncolis.model.Colis_Physique;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yassine
 */
public class Colis_MoraleDao {
    
     private AllConnection ac = new AllConnection();
    
    public int checkColisExistence(String reference){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from colis_morale where reference = ?");
            ps.setString(1, reference);
            ResultSet rs = ps.executeQuery();
            
            return rs.getInt("id");
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return 0;
    }
    
    public boolean insertColis(Colis_Morale colis){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into colis_morale(description,reference,address_source,address_destination,status,date_envoie,poids,prix,user_id) values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, colis.getDescription());
            ps.setString(2, colis.getReference());
            ps.setString(3, colis.getAddress_source());
            ps.setString(4, colis.getAddress_destination());
            ps.setString(5, colis.getStatus());
            ps.setDate(6, colis.getDate_envoie());
            ps.setDouble(7, colis.getPoid());
            ps.setDouble(8, colis.getPrix());
            ps.setInt(9, colis.getUser_id());
            
            int rs = ps.executeUpdate();
            return (rs > 0);
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return false;
    }
    
    public boolean updateColis(int id,Colis_Morale colis){
        
        if(checkColisExistence(colis.getReference()) == 0){
            try{
                Connection con = ac.getConnection();
                PreparedStatement ps = con.prepareStatement("update colis_morale set description=?, address_source=?,address_destination= ?, status=?, poids=?, prix=? where id=?");
                ps.setString(1, colis.getDescription());
                ps.setString(2, colis.getAddress_source());
                ps.setString(3, colis.getAddress_destination());
                ps.setString(4, colis.getStatus());
                ps.setDouble(5, colis.getPoid());
                ps.setDouble(6, colis.getPrix());
                
                int rs = ps.executeUpdate();
                return rs > 0;
                
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        return false;
    }
    
    public boolean deleteColis(int id){
        if(checkColisExistence(getColisById(id).getReference()) !=0){
            try{
                Connection con = ac.getConnection();
                PreparedStatement ps = con.prepareStatement("delete from colis_morale where id= ?");
                ps.setInt(1, id);
                int rs = ps.executeUpdate();
                return rs > 0;
                
            }catch(Exception ex){
                System.out.println(ex);
            }
            
        }
        
        return false;
    }
    
    public Colis_Morale getColisById(int id){
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from colis_morale where id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Colis_Morale colis = new Colis_Morale();
            if(rs.next()){
                colis.setId(id);
                colis.setDescription(rs.getString("decription"));
                colis.setReference(rs.getString("reference"));
                colis.setAddress_source(rs.getString("address_source"));
                colis.setAddress_destination(rs.getString("address_destination"));
                colis.setStatus(rs.getString("Status"));
                colis.setDate_envoie(rs.getDate("date_envoie"));
                colis.setPoid(rs.getDouble("poids"));
                colis.setPrix(rs.getDouble("prix"));
                colis.setUser_id(rs.getInt("user_id"));
                return colis;
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }
    
    public List<Colis_Morale> getColisList(){
        List<Colis_Morale> coliss = new ArrayList();
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from colis_morale");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Colis_Morale colis = new Colis_Morale();
                colis.setId(rs.getInt("id"));
                colis.setDescription(rs.getString("description"));
                colis.setReference(rs.getString("reference"));
                colis.setAddress_source(rs.getString("address_source"));
                colis.setAddress_destination(rs.getString("address_destination"));
                colis.setStatus(rs.getString("Status"));
                colis.setDate_envoie(rs.getDate("date_envoie"));
                colis.setPoid(rs.getDouble("poids"));
                colis.setPrix(rs.getDouble("prix"));
                colis.setUser_id(rs.getInt("user_id"));
                coliss.add(colis);
            }
            return coliss;
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }
    
    public List<Colis_Morale> getColisListById(int id){
        List<Colis_Morale> coliss = new ArrayList();
        try{
            Connection con = ac.getConnection();
            PreparedStatement ps = con.prepareStatement("Select * from colis_morale where user_id =?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Colis_Morale colis = new Colis_Morale();
                colis.setId(rs.getInt("id"));
                colis.setDescription(rs.getString("description"));
                colis.setReference(rs.getString("reference"));
                colis.setAddress_source(rs.getString("address_source"));
                colis.setAddress_destination(rs.getString("address_destination"));
                colis.setStatus(rs.getString("Status"));
                colis.setDate_envoie(rs.getDate("date_envoie"));
                colis.setPoid(rs.getDouble("poids"));
                colis.setPrix(rs.getDouble("prix"));
                colis.setUser_id(rs.getInt("user_id"));
                coliss.add(colis);
            }
            return coliss;
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return null;
    }
    
    
    
}
