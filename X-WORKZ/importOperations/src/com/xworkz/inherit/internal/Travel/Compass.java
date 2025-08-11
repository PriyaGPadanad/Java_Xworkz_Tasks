package com.xworkz.inherit.internal.Travel;

public class Compass extends Travel{
    public Compass() {
        super();
        System.out.println("Compass created -- child");
    }

    @Override
    public void use() {
        System.out.println("Compass shows direction -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Compass is made of plastic/metal -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Navigation Tool -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("To navigate and find directions -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Durable for outdoor use -- child");
    }
}
