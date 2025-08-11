package com.xworkz.inherit.internal.Tool;

public class FondueSet extends Tool{
    public FondueSet() {
        super();
        System.out.println("Running non-arg constructor FondueSet -- child");
    }

    @Override
    public void use() {
        System.out.println("Using fondue set -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("FondueSet made of ceramic and metal -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Specialty Cookware -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for melting cheese/chocolate -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("High durability -- child");
    }
}
