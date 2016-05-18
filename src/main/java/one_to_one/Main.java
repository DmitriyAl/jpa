package one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by root on 18.05.16.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Gubernator gubernator = new Gubernator();
        Region region = new Region();
        gubernator.setRegion(region);
        region.setGubernator(gubernator);
        region.setRegionName("smth obl");
        gubernator.setName("smone");
        em.persist(gubernator);
        et.commit();
    }
}
