/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Claudia
 */
@Entity
public class Anzeige implements Serializable {

    @Id
    @GeneratedValue
    private long id = 0;
    private String art =""; //Angebot oder Besuch
    private String titel ="";
    
    @Lob
    private String beschreibung = "";
    
    private Date onlinebis = new Date();
    private long preisvorstellung = 0;
    private String artPreis = ""; //FP, VHB,...
    private int plz = 0;
    private String ort = "";
    
    
    
    @ManyToMany //(mappedBy="anzeige")??
    List<Kategorie> kategorien = new ArrayList<>();

    //veröffentlicht
    @ManyToOne
    Benutzer benutzer = new Benutzer();

    //merkt sich
    @ManyToMany //(mappedBy="anzeige")??
    List<Benutzer> benutzern = new ArrayList<>();
        

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return "com.mycompany.portfolioaufgabe1.jpa.Anzeige[ id=" + id + " ]";
    }
    
}
