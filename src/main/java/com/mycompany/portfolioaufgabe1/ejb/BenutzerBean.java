/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.ejb;

import com.mycompany.portfolioaufgabe1.jpa.Benutzer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Claudia
 */

@Stateless
public class BenutzerBean {
    @PersistenceContext
    EntityManager em;

    //
    // Vorhandene Datensätze finden
    //
    public Benutzer findById(long id) {
        return em.find(Benutzer.class, id);
    }

   

    public List<Benutzer> findAll() {
        return em.createQuery("SELECT b FROM benutzer b")
                 .getResultList();
    }

    //
    // Datensätze speichern, ändern, löschen
    //
    public Benutzer saveNew(Benutzer benutzer) {
        em.persist(benutzer);
        return em.merge(benutzer);
    }

    public Benutzer update(Benutzer benutzer) {
        return em.merge(benutzer);
    }

    public void delete(Benutzer benutzer) {
        em.remove(benutzer);
    }
}
  
    

