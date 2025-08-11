package com.xworkz.inherit.internal.Tool;

public class Wheelbarrow extends Tool{
    public Wheelbarrow() {
        super();
        System.out.println("Running non-arg constructor Wheelbarrow");
    }

    @Override
    public void use() {
        System.out.println("Transporting loads --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Metal or plastic with a single wheel --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Transport Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Moving materials in construction or gardening --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Weather-resistant and sturdy --child");
    }
}
