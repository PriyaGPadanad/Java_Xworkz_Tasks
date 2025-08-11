package com.xworkz.inherit.internal.Travel;

public class Travel {
    public Travel() {
        System.out.println("Running non-arg constructor TravelTool");
    }

    public void use() {
        System.out.println("Using the travel tool -- parent");
    }

    public void getMaterial() {
        System.out.println("Material of travel tool -- parent");
    }

    public void getCategory() {
        System.out.println("Category of travel tool -- parent");
    }

    public void getPurpose() {
        System.out.println("Purpose of travel tool -- parent");
    }

    public void getDurability() {
        System.out.println("Durability of travel tool -- parent");
    }
}
