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
public class Kategorie implements Serializable {

    
    @Id
    @GeneratedValue
    private Long slug;
    
    private String name ="";
    
    @ManyToMany
    List<Anzeige> anzeigen = new ArrayList<>();
    
    @OneToMany // (mappedBy="kategorie") ??
    List<Kategorie> kategorien = new ArrayList<>();

    public Long getSlug() {
        return slug;
    }

    public void setSlug(Long slug) {
        this.slug = slug;
    }

    
    
}