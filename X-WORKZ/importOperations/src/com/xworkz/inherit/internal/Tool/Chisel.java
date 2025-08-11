package com.xworkz.inherit.internal.Tool;

public class Chisel extends Tool{
    public Chisel() {
        super();
        System.out.println("Running non-arg constructor Chisel");
    }

    @Override
    public void use() {
        System.out.println("Shaping or carving materials --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Hardened steel --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Shaping Tool --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used in woodworking or masonry --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Long-lasting if sharpened --child");
    }
}
