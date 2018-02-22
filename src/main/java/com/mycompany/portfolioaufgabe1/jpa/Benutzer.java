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
    private int telfonnummer = 0;
    
    
    @OneToMany //(mappedBy="benutzer")??
    List<Nachricht> nachrichten = new ArrayList<>();
    
    @OneToMany //(mappedBy="benutzer")??
    List<Anzeige> anzeigen1 = new ArrayList<>();
    
    @ManyToMany //(mappedBy="benutzer")??
    List<Anzeige> anzeigen2 = new ArrayList<>();
    
    public String getBenutzername() {
        return benutzername;
    }

    public void setId(String beutzername) {
        this.benutzername = benutzername;
    }

       
}
