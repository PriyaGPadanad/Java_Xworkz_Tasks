package com.xworkz.inherit.internal.Tool;

public class BreadMaker extends Tool{
    public BreadMaker() {
        super();
        System.out.println("Running non-arg constructor BreadMakerTool -- child");
    }

    @Override
    public void use() {
        System.out.println("Automated bread making -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("BreadMakerTool made of plastic and metal -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Automated Baking Tool -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for baking bread automatically -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Sturdy and efficient -- child");
    }
}
