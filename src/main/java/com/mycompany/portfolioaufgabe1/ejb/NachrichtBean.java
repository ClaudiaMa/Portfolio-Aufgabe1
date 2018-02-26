/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolioaufgabe1.ejb;
import com.mycompany.portfolioaufgabe1.jpa.Nachricht;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author Claudia
 */   
@Stateless
public class NachrichtBean {
    
 
    @PersistenceContext
    EntityManager em;

    //
    // Vorhandene Datensätze finden
    //
    public Nachricht findById(long id) {
        return em.find(Nachricht.class, id);
    }

   

    public List<Nachricht> findAll() {
        return em.createQuery("SELECT a FROM anzeige a")
                 .getResultList();
    }

    //
    // Datensätze speichern, ändern, löschen
    //
    public Nachricht saveNew(Nachricht nachricht) {
        em.persist(nachricht);
        return em.merge(nachricht);
    }

    public Nachricht update(Nachricht nachricht) {
        return em.merge(nachricht);
    }

    public void delete(Nachricht nachricht) {
        em.remove(nachricht);
    }
}
    

