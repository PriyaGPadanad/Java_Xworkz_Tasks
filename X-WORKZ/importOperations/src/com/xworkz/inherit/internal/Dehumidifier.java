package com.xworkz.inherit.internal;

public class Dehumidifier extends Appliance{
    public Dehumidifier() {
        super();
        System.out.println("Dehumidifier created --child");
    }

    @Override
    public void use() {
        System.out.println("Removing humidity from air --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Frigidaire --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 400W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Air Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 2 years --child");
    }
}
