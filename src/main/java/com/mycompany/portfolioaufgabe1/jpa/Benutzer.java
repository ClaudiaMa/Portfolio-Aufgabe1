/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
/**
 *
 * @author Claudia
 */
@Entity
public class Benutzer implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private String benutzername = "";

    private String passwortHash = "";
    private String vorname = "";
    private String nachname = "";
    private String straße = "";
    private int hausnummer = 0;
    private int plz = 0;
    private String ort = "";
    private String land = "";
    private String email = "";
    private int telefonnummer = 0;
    
    
    @OneToMany //(mappedBy="benutzer")??
    List<Nachricht> nachrichten = new ArrayList<>();
    
    @OneToMany //(mappedBy="benutzer")??
    List<Anzeige> anzeigen1 = new ArrayList<>();
    
    @ManyToMany //(mappedBy="benutzer")??
    List<Anzeige> anzeigen2 = new ArrayList<>();
    
    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String beutzername) {
        this.benutzername = benutzername;
    }
    
    public String getPasswortHash() {
        return passwortHash;
    }

    public void setPassowrtHash(String passwortHash) {
        this.passwortHash = passwortHash;
    }
    
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }
    
    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }
    
    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }
    
    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    
   
       
       
}
