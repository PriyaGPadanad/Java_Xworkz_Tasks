package com.xworkz.inherit.internal.Tool;

public class EggSlicer extends Tool{
    public EggSlicer() {
        super();
        System.out.println("Running non-arg constructor EggSlicer -- child");
    }

    @Override
    public void use() {
        System.out.println("Slicing boiled eggs -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Egg slicer made of plastic and steel -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Food Cutter -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for slicing eggs evenly -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Lightweight and moderate durability -- child");
    }
}
