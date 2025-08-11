package com.xworkz.inherit.internal.Tool;

public class CookieCutter extends Tool{
    public CookieCutter() {
        super();
        System.out.println("Running non-arg constructor CookieCutter -- child");
    }

    @Override
    public void use() {
        System.out.println("Cutting dough into shapes -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Cookie cutter made of plastic or steel -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Category: Baking Shaper -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used to shape cookies -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Reusable with care -- child");
    }
}
