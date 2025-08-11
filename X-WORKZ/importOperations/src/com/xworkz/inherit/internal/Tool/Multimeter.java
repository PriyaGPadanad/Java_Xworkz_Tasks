package com.xworkz.inherit.internal.Tool;

public class Multimeter extends Tool{
    public Multimeter() {
        super();
        System.out.println("Running non-arg constructor Multimeter");
    }

    @Override
    public void use() {
        System.out.println("Measuring electrical values --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic body with electronic display --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Diagnostic Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for testing voltage, current, and resistance --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Durable for technical use --child");
    }
}
