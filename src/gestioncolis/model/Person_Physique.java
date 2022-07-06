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
public class Person_Physique {
    
    private int id;
    private String designation;
    private String telephone;
    private String email;
    private String address;
    private String code_postal;
    private String CIN;
    private String temps;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public Person_Physique(){
        
    }
    
    

    public Person_Physique(int id, String designation, String telephone, String email, String address, String code_postal, String CIN, String temps,String password) {
        this.id = id;
        this.designation = designation;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.code_postal = code_postal;
        this.CIN = CIN;
        this.temps = temps;
        this.password = password;
    }
    
    public Person_Physique(int id, String designation, String telephone, String email, String address, String code_postal, String CIN,String password) {
        this.id = id;
        this.designation = designation;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.code_postal = code_postal;
        this.CIN = CIN;
        this.password = password;
    }
    
    public Person_Physique(String designation, String telephone, String email, String address, String code_postal, String CIN, String temps,String password) {
        this.designation = designation;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.code_postal = code_postal;
        this.CIN = CIN;
        this.temps = temps;
        this.password = password;
    }
    
    public Person_Physique(String designation, String telephone, String email, String address, String code_postal, String CIN,String password) {
        this.designation = designation;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
        this.code_postal = code_postal;
        this.CIN = CIN;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "Person_Physique{" + "id=" + id + ", designation=" + designation + ", telephone=" + telephone + ", email=" + email + ", address=" + address + ", code_postal=" + code_postal + ", CIN=" + CIN + ", temps=" + temps + '}';
    }
    
    public int getType(){
        return 0;
    }
    
    
    
    
    
    
    
}
