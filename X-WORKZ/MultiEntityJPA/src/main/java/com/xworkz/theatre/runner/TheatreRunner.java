package com.xworkz.theatre.runner;

import com.xworkz.theatre.entity.ShowEntity;
import com.xworkz.theatre.entity.TheatreEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TheatreRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("Xworkz");
        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT= eM.getTransaction();
        eT.begin();

        List<ShowEntity>showEntities=new ArrayList<>();
        showEntities.add(new ShowEntity(1, "The Silent Echo", "2025-08-01 18:30", "English", "2h 10m", 350.0));
        showEntities.add(new ShowEntity(2, "Chandni Raat", "2025-08-01 20:00", "Hindi", "2h 45m", 420.0));
        showEntities.add(new ShowEntity(3, "Mystic River", "2025-08-02 17:00", "English", "1h 55m", 300.0));
        showEntities.add(new ShowEntity(4, "Samurai Sun", "2025-08-02 19:00", "Japanese", "2h 20m", 400.0));
        showEntities.add(new ShowEntity(5, "Desert Mirage", "2025-08-03 16:00", "Arabic", "2h 5m", 380.0));
        showEntities.add(new ShowEntity(6, "Kaalchakra", "2025-08-03 19:30", "Hindi", "2h 30m", 450.0));
        showEntities.add(new ShowEntity(7, "Aurora’s Edge", "2025-08-04 18:00", "English", "2h 15m", 370.0));
        showEntities.add(new ShowEntity(8, "Noche de Luz", "2025-08-04 20:30", "Spanish", "2h 10m", 360.0));
        showEntities.add(new ShowEntity(9, "The Green Pulse", "2025-08-05 17:45", "English", "1h 50m", 320.0));
        showEntities.add(new ShowEntity(10, "Echoes of Bengal", "2025-08-05 20:00", "Bengali", "2h 25m", 390.0));

        for(ShowEntity showEntity:showEntities){
            eM.persist(showEntity);
        }

        ShowEntity showEntity=eM.find(ShowEntity.class,1);


        List<TheatreEntity> theatreEntities = new ArrayList<>();
        theatreEntities.add(new TheatreEntity(1, "PVR Koramangala", "Bengaluru", 1200, 6, 9876543210L));
        theatreEntities.add(new TheatreEntity(2, "INOX Nehru Place", "Delhi", 950, 5, 9123456789L));
        theatreEntities.add(new TheatreEntity(3, "Cinepolis Kukatpally", "Hyderabad", 1100, 7, 9988776655L));
        theatreEntities.add(new TheatreEntity(4, "SPI Escape", "Chennai", 1000, 6, 9871234567L));
        theatreEntities.add(new TheatreEntity(5, "Carnival IMAX Wadala", "Mumbai", 1300, 8, 9765432109L));
        theatreEntities.add(new TheatreEntity(6, "Miraj Cinemas", "Ahmedabad", 900, 4, 9654321098L));
        theatreEntities.add(new TheatreEntity(7, "PVR Grand Mall", "Kochi", 1050, 5, 9543210987L));
        theatreEntities.add(new TheatreEntity(8, "INOX Quest Mall", "Kolkata", 1150, 6, 9432109876L));
        theatreEntities.add(new TheatreEntity(9, "PVR Orion East", "Bengaluru", 980, 5, 9321098765L));
        theatreEntities.add(new TheatreEntity(10, "Cinepolis Seasons Mall", "Pune", 1080, 6, 9210987654L));

        for(TheatreEntity theatreEntity:theatreEntities){
            eM.persist(theatreEntity);
        }

        TheatreEntity theatreEntity=eM.find(TheatreEntity.class,1);

        eT.commit();
        eM.close();
    }
}
