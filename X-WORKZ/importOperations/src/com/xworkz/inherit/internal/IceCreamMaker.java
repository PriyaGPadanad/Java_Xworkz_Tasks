package com.xworkz.inherit.internal;

public class IceCreamMaker extends Appliance{
    public IceCreamMaker() {
        super();
        System.out.println("IceCreamMaker created --child");
    }

    @Override
    public void use() {
        System.out.println("Making ice cream --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: KitchenAid --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 600W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Kitchen Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 1.5 years --child");
    }
}
