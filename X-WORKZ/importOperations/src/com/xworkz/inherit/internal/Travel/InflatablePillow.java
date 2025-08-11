package com.xworkz.inherit.internal.Travel;

public class InflatablePillow extends Travel{
    public InflatablePillow() {
        super();
        System.out.println("Inflatable Pillow created -- child");
    }

    @Override
    public void use() {
        System.out.println("Used to rest neck during travel -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Soft plastic or foam with fabric cover -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Travel Comfort -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Provides neck support during journeys -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Reusable and travel-friendly -- child");
    }
}
