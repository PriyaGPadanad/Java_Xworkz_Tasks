package com.xworkz.inherit.internal;

public class ElectricBlanket extends Appliance{
    public ElectricBlanket() {
        super();
        System.out.println("ElectricBlanket created --child");
    }

    @Override
    public void use() {
        System.out.println("Warming the bed --child");
    }

    @Override
    public void getBrand() {
        System.out.println("Brand: Sunbeam --child");
    }

    @Override
    public void getPower() {
        System.out.println("Power: 200W --child");
    }

    @Override
    public void getType() {
        System.out.println("Type: Home Appliance --child");
    }

    @Override
    public void getWarranty() {
        System.out.println("Warranty: 3 years --child");
    }
}
