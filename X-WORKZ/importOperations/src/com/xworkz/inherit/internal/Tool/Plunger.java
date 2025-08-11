package com.xworkz.inherit.internal.Tool;

public class Plunger extends Tool{
    public Plunger() {
        super();
        System.out.println("Running non-arg constructor Plunger");
    }

    @Override
    public void use() {
        System.out.println("Unclogging drains --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Rubber and wood/plastic handle --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Plumbing Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Clears clogs in toilets and sinks --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Moderate durability --child");
    }
}
