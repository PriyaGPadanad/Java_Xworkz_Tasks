package com.xworkz.inherit.internal.Tool;

public class HoseNozzle extends Tool{

    public HoseNozzle() {
        super();
        System.out.println("Running non-arg constructor HoseNozzle");
    }

    @Override
    public void use() {
        System.out.println("Controlling water spray --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic or metal with trigger --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Water Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for gardening or cleaning --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Weather-resistant and sturdy --child");
    }
}
