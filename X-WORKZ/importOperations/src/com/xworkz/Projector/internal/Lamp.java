package com.xworkz.Projector.internal;

public class Lamp {
    Warranty warranty;

    public Lamp() {
        warranty = new Warranty();
    }

    public void replaceLamp() {
        System.out.println("Lamp is being replaced.");
    }
}
