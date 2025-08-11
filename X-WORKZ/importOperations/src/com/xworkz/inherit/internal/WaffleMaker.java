package com.xworkz.inherit.internal;

public class WaffleMaker extends Appliance{
    public WaffleMaker() {
        super();
        System.out.println("WaffleMaker created ");
    }

    @Override
    public void use() {
        System.out.println("Making waffles ");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Cuisinart ");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 1000W ");
    }

    @Override
    public void getType() {
        System.out.println("Type: Kitchen Appliance ");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 2 years ");
    }
}
