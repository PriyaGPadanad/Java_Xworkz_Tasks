package com.xworkz.inherit.internal.Tool;

public class CaulkingGun extends Tool{
    public CaulkingGun() {
        super();
        System.out.println("Running non-arg constructor CaulkingGun");
    }

    @Override
    public void use() {
        System.out.println("Sealing gaps and cracks --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Steel frame and plastic handle --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Sealant Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Applies sealants evenly --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Highly durable for frequent use --child");
    }
}
