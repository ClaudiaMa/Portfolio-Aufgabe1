/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author Claudia
 */
@Entity
public class Nachricht implements Serializable {

    
    @Id
    @GeneratedValue
    private Long id;
    private String von = "";
    private String an = "";
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nachricht)) {
            return false;
        }
        Nachricht other = (Nachricht) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.portfolioaufgabe1.jpa.Nachricht[ id=" + id + " ]";
    }
    
}
