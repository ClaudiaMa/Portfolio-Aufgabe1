/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.ejb;

import com.mycompany.portfolioaufgabe1.jpa.Anzeige;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Claudia
 */

    @Stateless
public class AnzeigeBean {
    @PersistenceContext
    EntityManager em;

    //
    // Vorhandene Datensätze finden
    //
    public Anzeige findById(long id) {
        return em.find(Anzeige.class, id);
    }

   

    public List<Anzeige> findAll() {
        return em.createQuery("SELECT a FROM anzeige a")
                 .getResultList();
    }

    //
    // Datensätze speichern, ändern, löschen
    //
    public Anzeige saveNew(Anzeige anzeige) {
        em.persist(anzeige);
        return em.merge(anzeige);
    }

    public Anzeige update(Anzeige anzeige) {
        return em.merge(anzeige);
    }

    public void delete(Anzeige anzeige) {
        em.remove(anzeige);
    }
}
    