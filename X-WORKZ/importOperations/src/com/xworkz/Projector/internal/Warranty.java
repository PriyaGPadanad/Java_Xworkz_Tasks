package com.xworkz.Projector.internal;

public class Warranty {
    String startDate;
    String endDate;

    public Warranty() {
        startDate = "2023-01-01";
        endDate = "2024-01-01";
    }

    public void checkWarranty() {
        System.out.println("Checking warranty.");
    }
}
