package com.xworkz.inherit.internal;

public class ClothesSteamer extends Appliance{
    public ClothesSteamer() {
        super();
        System.out.println("ClothesSteamer created --child");
    }

    @Override
    public void use() {
        System.out.println("Steaming wrinkles from clothes --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Philips --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 1600W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Laundry Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 2 years --child");
    }
}
