package com.xworkz.inherit.internal.Tool;

public class Tool {
    public Tool() {
        System.out.println("Running non-arg constructor Tool -- parent");
    }

    public void use() {
        System.out.println("Using tool -- parent");
    }

    public void getMaterial() {
        System.out.println("Tool material -- parent");
    }

    public void getCategory() {
        System.out.println("Tool category -- parent");
    }

    public void getPurpose() {
        System.out.println("Tool purpose -- parent");
    }

    public void getDurability() {
        System.out.println("Tool durability -- parent");
    }
}
