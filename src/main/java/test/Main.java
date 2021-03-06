package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by dmitriyal on 10.05.16.
 */
public class Main {
    public static void main(String[] args) {
        Book book = new Book("H2G2", "THE HITCHHIKER'S GUIDE TO THE GALAXY", 12.5F, "1-84023-742-2", 354, false);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();
        em.close();
        emf.close();
    }
}
