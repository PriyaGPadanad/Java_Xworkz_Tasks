package com.xworkz.inherit.internal.Travel;

public class IceScraper extends Travel{
    public IceScraper() {
        super();
        System.out.println("Ice Scraper created -- child");
    }

    @Override
    public void use() {
        System.out.println("Removes ice from car windows -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic blade with handle -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Car Accessory -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Improves visibility in winter -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Durable and frost-resistant -- child");
    }
}
