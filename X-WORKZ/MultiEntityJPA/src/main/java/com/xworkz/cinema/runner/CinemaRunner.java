package com.xworkz.cinema.runner;

import com.xworkz.cinema.entity.ActorEntity;
import com.xworkz.cinema.entity.CinemaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CinemaRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("Xworkz");
        EntityManager eM=eMF.createEntityManager();
        EntityTransaction eT=eM.getTransaction();
        eT.begin();

        List<ActorEntity> actorEntities = new ArrayList<>();
        actorEntities.add(new ActorEntity(1, "Amitabh Bachchan", 81, "Male", 15));
        actorEntities.add(new ActorEntity(2, "Deepika Padukone", 38, "Female", 9));
        actorEntities.add(new ActorEntity(3, "Rajkummar Rao", 40, "Male", 6));
        actorEntities.add(new ActorEntity(4, "Alia Bhatt", 32, "Female", 8));
        actorEntities.add(new ActorEntity(5, "Nawazuddin Siddiqui", 50, "Male", 7));
        actorEntities.add(new ActorEntity(6, "Kangana Ranaut", 38, "Female", 10));
        actorEntities.add(new ActorEntity(7, "Ranveer Singh", 39, "Male", 5));
        actorEntities.add(new ActorEntity(8, "Vidya Balan", 46, "Female", 11));
        actorEntities.add(new ActorEntity(9, "Manoj Bajpayee", 55, "Male", 13));
        actorEntities.add(new ActorEntity(10, "Taapsee Pannu", 37, "Female", 4));

        for(ActorEntity actorEntity:actorEntities){
            eM.persist(actorEntity);
        }



        CinemaEntity cinemaEntity=eM.find(CinemaEntity.class,1);

        eT.commit();
        eM.close();
    }
}
