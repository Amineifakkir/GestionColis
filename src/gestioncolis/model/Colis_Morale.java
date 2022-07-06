/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis.model;

import java.sql.Date;

/**
 *
 * @author Yassine
 */
public class Colis_Morale {
    
    private int id;
    private String description;
    private String reference;
    private String address_source;
    private String address_destination;
    private String status;
    private Date date_envoie;
    private double poid;
    private double prix;
    private int user_id;
    
    public Colis_Morale(){
        
    }

    public Colis_Morale(int id, String description, String reference, String address_source, String address_destination, String status, Date date_envoie, double poid, double prix, int user_id) {
        this.id = id;
        this.description = description;
        this.reference = reference;
        this.address_source = address_source;
        this.address_destination = address_destination;
        this.status = status;
        this.date_envoie = date_envoie;
        this.poid = poid;
        this.prix = prix;
        this.user_id = user_id;
    }

    public Colis_Morale(String description, String reference, String address_source, String address_destination, String status, Date date_envoie, double poid, double prix, int user_id) {
        this.description = description;
        this.reference = reference;
        this.address_source = address_source;
        this.address_destination = address_destination;
        this.status = status;
        this.date_envoie = date_envoie;
        this.poid = poid;
        this.prix = prix;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAddress_source() {
        return address_source;
    }

    public void setAddress_source(String address_source) {
        this.address_source = address_source;
    }

    public String getAddress_destination() {
        return address_destination;
    }

    public void setAddress_destination(String address_destination) {
        this.address_destination = address_destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate_envoie() {
        return date_envoie;
    }

    public void setDate_envoie(Date date_envoie) {
        this.date_envoie = date_envoie;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    @Override
    public String toString() {
        return "Colis_Morale{" + "id=" + id + ", description=" + description + ", reference=" + reference + ", address_source=" + address_source + ", address_destination=" + address_destination + ", status=" + status + ", date_envoie=" + date_envoie + ", poid=" + poid + ", prix=" + prix + ", user_id=" + user_id + '}';
    }
    
    
    
    
    
    
}
