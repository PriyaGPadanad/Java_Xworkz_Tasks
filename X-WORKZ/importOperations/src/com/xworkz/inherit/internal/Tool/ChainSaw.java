package com.xworkz.inherit.internal.Tool;

public class ChainSaw extends Tool{
    public ChainSaw() {
        super();
        System.out.println("Running non-arg constructor ChainSaw");
    }

    @Override
    public void use() {
        System.out.println("Cutting trees and wood logs --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Steel blade with motor --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Power Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Heavy-duty cutting --child");
    }

    @Override
    public void getDurability() {
        System.out.println("High performance and durable --child");
    }
}
