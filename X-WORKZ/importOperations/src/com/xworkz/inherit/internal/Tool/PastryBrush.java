package com.xworkz.inherit.internal.Tool;

public class PastryBrush extends Tool{
    public PastryBrush() {
        super();
        System.out.println("Running non-arg constructor PastryBrush -- child");
    }

    @Override
    public void use() {
        System.out.println("Brushing butter or egg wash -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Brush made of silicone or bristles -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Baking Tool -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for glazing pastry -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Reusable and washable -- child");
    }
}
