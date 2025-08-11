package com.xworkz.inherit.internal.Tool;

public class WorkGloves extends Tool {
    public WorkGloves() {
        super();
        System.out.println("Running non-arg constructor WorkGloves");
    }

    @Override
    public void use() {
        System.out.println("Protecting hands during work --child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Leather, rubber, or fabric --child");
    }

    @Override
    public void getCategory() {
        System.out.println("Safety Equipment --child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for personal protection --child");
    }

    @Override
    public void getDurability() {
        System.out.println("Reusable with strong grip --child");
    }
}
