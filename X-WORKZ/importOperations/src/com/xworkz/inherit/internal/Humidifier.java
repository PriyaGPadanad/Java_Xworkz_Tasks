package com.xworkz.inherit.internal;

public class Humidifier extends Appliance{
    public Humidifier() {
        super();
        System.out.println("Humidifier created --child");
    }

    @Override
    public void use() {
        System.out.println("Adding moisture to air --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Levoit --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 30W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Air Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 1 year --child");
    }
}
