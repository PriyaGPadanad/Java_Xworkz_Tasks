package com.xworkz.inherit.internal.Tool;

public class Level extends Tool{
    public Level() {
        super();
        System.out.println("Running non-arg constructor Level");
    }

    @Override
    public void use() {
        System.out.println("Checking surface alignment --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Aluminum or plastic with bubble tube --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Precision Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used to measure flatness --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Durable with high precision --child");
    }
}
