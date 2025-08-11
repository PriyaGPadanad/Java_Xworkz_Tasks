package com.xworkz.inherit.internal;

public class Projector extends Appliance{
    public Projector() {
        super();
        System.out.println("Projector created --child");
    }

    @Override
    public void use() {
        System.out.println("Projecting images and videos --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Epson --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 300W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Entertainment Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 3 years --child");
    }
}
