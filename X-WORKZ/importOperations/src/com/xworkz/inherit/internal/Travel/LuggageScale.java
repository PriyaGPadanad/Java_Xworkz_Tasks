package com.xworkz.inherit.internal.Travel;

public class LuggageScale extends Travel{
    public LuggageScale() {
        super();
        System.out.println("Luggage Scale created -- child");
    }

    @Override
    public void use() {
        System.out.println("Measures weight of luggage -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic and digital display -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Travel Accessory -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Avoids excess baggage fees -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Portable and durable -- child");
    }
}
