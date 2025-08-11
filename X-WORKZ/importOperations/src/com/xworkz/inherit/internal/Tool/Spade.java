package com.xworkz.inherit.internal.Tool;

public class Spade extends Tool{
    public Spade() {
        super();
        System.out.println("Running non-arg constructor Spade");
    }

    @Override
    public void use() {
        System.out.println("Digging soil --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Metal blade with wooden/plastic handle --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Garden Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used in gardening and excavation --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Durable for outdoor use --child");
    }
}
