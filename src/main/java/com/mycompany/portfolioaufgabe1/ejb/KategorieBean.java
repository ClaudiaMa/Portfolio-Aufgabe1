/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.ejb;

import com.mycompany.portfolioaufgabe1.jpa.Kategorie;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Claudia
 */

@Stateless
public class KategorieBean {
    @PersistenceContext
    EntityManager em;

    //
    // Vorhandene Datensätze finden
    //
    public Kategorie findById(long id) {
        return em.find(Kategorie.class, id);
    }

   

    public List<Kategorie> findAll() {
        return em.createQuery("SELECT k FROM kategorie k")
                 .getResultList();
    }

    //
    // Datensätze speichern, ändern, löschen
    //
    public Kategorie saveNew(Kategorie kategorie) {
        em.persist(kategorie);
        return em.merge(kategorie);
    }

    public Kategorie update(Kategorie kategorie) {
        return em.merge(kategorie);
    }

    public void delete(Kategorie kategorie) {
        em.remove(kategorie);
    }
}
    
   
