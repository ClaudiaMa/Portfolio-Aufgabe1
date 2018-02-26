/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author Claudia
 */
@Entity
public class Nachricht implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id =0;
    
    private String vonBenutzer = "";
    private String anBenutzer = "";
    private String zuArtikel = ""; //??Nummer oder Bezeichnung
    
    @Lob
    private String text ="";
    
    @ManyToOne
    Benutzer benutzer = new Benutzer();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVonBenutzer() {
        return vonBenutzer;
    }
    
    public void setVonBenutzer(String vonBenutzer){
        this.vonBenutzer = vonBenutzer;
    }
    
    public String getAnBenutzer(){
        return anBenutzer;
    }
    
    public void setAnBenutzer(String anBenutzer){
        this.anBenutzer = anBenutzer;
    }
    
    public String getZuArtikel(){
        return zuArtikel;
    }
    
    public void setZuArtikel(String zuArtikel){
        this.zuArtikel = zuArtikel;
    }
    
    public String getText(){
        return text;
    }
          
    public void setText(String text){
        this.text = text;
    }
}