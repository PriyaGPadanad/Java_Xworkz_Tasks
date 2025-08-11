package com.xworkz.inherit.internal.Tool;

public class Trowel extends Tool{
    public Trowel() {
        super();
        System.out.println("Running non-arg constructor Trowel");
    }

    @Override
    public void use() {
        System.out.println("Scooping and spreading soil or cement --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Steel or plastic blade with handle --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Garden Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used in gardening and masonry --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Lightweight and durable --child");
    }
}
