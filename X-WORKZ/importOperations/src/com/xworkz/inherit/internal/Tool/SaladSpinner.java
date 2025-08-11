package com.xworkz.inherit.internal.Tool;

public class SaladSpinner extends Tool{
    public SaladSpinner() {
        super();
        System.out.println("Running non-arg constructor SaladSpinner -- child");
    }

    @Override
    public void use() {
        System.out.println("Drying salad leaves -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Salad spinner made of plastic -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Drying Tool -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for spinning salad dry -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Long-lasting with gentle use -- child");
    }
}
