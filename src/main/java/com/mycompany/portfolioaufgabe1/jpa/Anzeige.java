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


/**
 *
 * @author Claudia
 */
@Entity
public class Anzeige implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id = 0;
    
    private String art =""; //Angebot oder Besuch
    private String titel ="";
    
    @Lob
    private String beschreibung = "";
    
    private Date onlineBis = new Date();
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
    
    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
    
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
    
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    
    public Date getOnlineBis(){
        return onlineBis;
    }
    
    public void setOnlineBis(Date onlineBis){
        this.onlineBis = onlineBis;
    }
    
    public long getPreisvorstellung(){
        return preisvorstellung;
    }
    
    public void setPreisvorstellung(long preisvorstellung){
        this.preisvorstellung = preisvorstellung;
    }
    
    public String getArtPreis() {
        return artPreis;
    }

    public void setArtPreis(String artPreis) {
        this.artPreis = artPreis;
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
    
    
}
