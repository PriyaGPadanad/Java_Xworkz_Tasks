package com.xworkz.nursery.runner;

import com.xworkz.nursery.enitity.NurseryEnitity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class NurseryRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("Xworkz");
        EntityManager em = eMF.createEntityManager();

        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();
        NurseryEnitity nurseryEnitity = new NurseryEnitity(2, "pushpa Nursery", "puspa");
        em.persist(nurseryEnitity);
        entityTransaction.commit();
        System.out.println("Nursery is Running");
    }


}
