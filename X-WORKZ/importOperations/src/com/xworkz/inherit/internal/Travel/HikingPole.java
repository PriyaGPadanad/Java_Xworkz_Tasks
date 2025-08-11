package com.xworkz.inherit.internal.Travel;

public class HikingPole extends Travel{
    public HikingPole() {
        super();
        System.out.println("Hiking Pole created -- child");
    }

    @Override
    public void use() {
        System.out.println("Provides stability during hiking -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Aluminum or carbon fiber -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Trekking Gear -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Supports body while climbing -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Strong and adjustable -- child");
    }
}
