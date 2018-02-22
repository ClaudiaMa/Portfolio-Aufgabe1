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
import javax.persistence.ManyToOne;

/**
 *
 * @author Claudia
 */
@Entity
public class Foto implements Serializable {

    
    @Id
    @GeneratedValue
    private long id;
    
    private String bezeichnung ="";
    private String bilddaten ="";
    
    @ManyToOne
    Anzeige anzeige = new Anzeige();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    
}
