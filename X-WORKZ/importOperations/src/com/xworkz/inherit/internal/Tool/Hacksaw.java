package com.xworkz.inherit.internal.Tool;

public class Hacksaw extends Tool{
    public Hacksaw() {
        super();
        System.out.println("Running non-arg constructor Hacksaw");
    }

    @Override
    public void use() {
        System.out.println("Cutting through metal and plastic --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Metal frame with replaceable blades --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Cutting Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Precision cutting --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Durable with proper care --child");
    }
}
