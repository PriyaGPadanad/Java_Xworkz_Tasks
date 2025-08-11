package com.xworkz.inherit.internal;

public class PopcornMachine extends Appliance{
    public PopcornMachine() {
        super();
        System.out.println("PopcornMachine created --child");
    }

    @Override
    public void use() {
        System.out.println("Popping popcorn --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Nostalgia --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 800W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Kitchen Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 1 year --child");
    }
}
