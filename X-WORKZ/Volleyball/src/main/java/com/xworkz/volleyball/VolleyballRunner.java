package com.xworkz.volleyball;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VolleyballRunner {
    public static void main(String[] args) {

        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("xworkz");
        if(eMF != null){
            System.out.println("EntityManagerFactory created successfully.");
        }
    }
}
