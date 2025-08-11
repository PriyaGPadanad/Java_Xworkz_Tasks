package com.xworkz.inherit.internal.Travel;

public class TentStakes extends Travel{
    public TentStakes() {
        super();
        System.out.println("Tent Stakes created -- child");
    }

    @Override
    public void use() {
        System.out.println("Secures tents to ground -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Metal or plastic rods -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Camping Equipment -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Holds tent in place during wind -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Weather-proof and sturdy -- child");
    }
}
