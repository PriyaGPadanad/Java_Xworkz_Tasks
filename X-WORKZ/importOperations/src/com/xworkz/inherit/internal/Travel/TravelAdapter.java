package com.xworkz.inherit.internal.Travel;

public class TravelAdapter extends Travel{
    public TravelAdapter() {
        super();
        System.out.println("Travel Adapter created -- child");
    }

    @Override
    public void use() {
        System.out.println("Converts plug types while traveling -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic with metal connectors -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Power Converter -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used to charge devices abroad -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Compact and long-lasting -- child");
    }

}
