package com.xworkz.transport.runner;

import com.xworkz.transport.entity.BusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class BusRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF=null;
        EntityManager eM=null;
        EntityTransaction eT=null;

        try{
            eMF= Persistence.createEntityManagerFactory("transport");
            eM=eMF.createEntityManager();
            eT=eM.getTransaction();

            eT.begin();

//        List<BusEntity> busList = new ArrayList<>();
//
//        busList.add(new BusEntity(1, "KSRTC Express", "Bangalore", "Mangalore", 650, "06:30 AM"));
//        busList.add(new BusEntity(2, "VRL Travels", "Mangalore", "Bangalore", 750, "10:00 PM"));
//        busList.add(new BusEntity(3, "Sugama Tourist", "Udupi", "Bangalore", 600, "05:45 AM"));
//        busList.add(new BusEntity(4, "Durgamba", "Bangalore", "Udupi", 620, "09:15 PM"));
//        busList.add(new BusEntity(5, "SRS Travels", "Hubli", "Bangalore", 700, "06:00 AM"));
//        busList.add(new BusEntity(6, "Ganesh Travels", "Bangalore", "Karwar", 820, "08:30 PM"));
//        busList.add(new BusEntity(7, "Kukke Express", "Mangalore", "Kukke Subramanya", 450, "12:00 PM"));
//        busList.add(new BusEntity(8, "Canara Bus", "Kundapura", "Bangalore", 670, "10:45 PM"));
//        busList.add(new BusEntity(9, "Ocean Pearl", "Kasargod", "Mysore", 720, "07:00 AM"));
//        busList.add(new BusEntity(10, "Coastal Express", "Kannur", "Bangalore", 790, "08:15 PM"));

//            for(BusEntity busEntity:busList){
//                eM.persist(busEntity);
//            }
//            eT.commit();

            BusEntity busEntity=eM.find(BusEntity.class,4);
            System.out.println(busEntity);
            busEntity.setBusName("Royal");
            eM.merge(busEntity);
            eT.commit();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            eMF.close();
            eM.close();
            if(eT.isActive()){
                eT.rollback();
            }
        }
    }
}
