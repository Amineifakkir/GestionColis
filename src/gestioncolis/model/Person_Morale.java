/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolis.model;

/**
 *
 * @author Yassine
 */
public class Person_Morale {
    
    private int id;
    private String nom;
    private String telephone;
    private String email;
    private String address;
    private String code_postal;
    private String ice;
    private String temps;
    private String password;

    
    public Person_Morale(){
        
    }

    public Person_Morale(String nom, String telephone, String email, String address, String code_postal, String ice, String temps) {
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.code_postal = code_postal;
        this.ice = ice;
        this.temps = temps;
    }
    
    
    
    public Person_Morale(int id, String nom, String telephone, String email, String address, String code_postal, String ice, String temps,String password) {
        this.id = id;
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.code_postal = code_postal;
        this.ice = ice;
        this.temps = temps;
        this.password = password;
    }
    
    public Person_Morale(String nom, String telephone, String email, String address, String code_postal, String ice, String temps,String password) {
        this.nom = nom;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.code_postal = code_postal;
        this.ice = ice;
        this.temps = temps;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "Person_Morale{" + "id=" + id + ", nom=" + nom + ", telephone=" + telephone + ", email=" + email + ", address=" + address + ", code_postal=" + code_postal + ", ice=" + ice + ", temps=" + temps + '}';
    }
    
    public int getType(){
        return 1;
    }
    
    
    
    
}
