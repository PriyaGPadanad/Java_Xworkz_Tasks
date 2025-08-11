package com.xworkz.inherit.internal;

public class VacuumSealer extends Appliance{
    public VacuumSealer() {
        super();
        System.out.println("VacuumSealer created --child");
    }

    @Override
    public void use() {
        System.out.println("Sealing food in vacuum bags --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: FoodSaver --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 120W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Food Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 1 year --child");
    }
}
