package com.xworkz.inherit.internal;

public class SpaceHeater extends Appliance{
    public SpaceHeater() {
        super();
        System.out.println("SpaceHeater created --child");
    }

    @Override
    public void use() {
        System.out.println("Heating the room --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Dyson --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 1500W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Heating Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 2 years --child");
    }
}
