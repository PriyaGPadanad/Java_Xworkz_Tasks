package com.xworkz.inherit.internal.Travel;

public class SnowBoots extends Travel{
    public SnowBoots() {
        super();
        System.out.println("Snow Boots created -- child");
    }

    @Override
    public void use() {
        System.out.println("Protects feet from cold and snow -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Rubber sole with insulated fabric -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Winter Footwear -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Keeps feet warm and dry -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Waterproof and long-lasting -- child");
    }
}
