package com.xworkz.inherit.internal.Tool;

public class StudFinder extends Tool{
    public StudFinder() {
        super();
        System.out.println("Running non-arg constructor StudFinder");
    }

    @Override
    public void use() {
        System.out.println("Locating studs behind walls --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic with electronic sensors --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Measuring Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used to find wall studs --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Moderately durable --child");
    }
}
