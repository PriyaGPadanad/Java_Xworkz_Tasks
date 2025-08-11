package com.xworkz.inherit.internal.Travel;

public class Binoculars extends Travel{
    public Binoculars() {
        super();
        System.out.println("Binoculars created -- child");
    }

    @Override
    public void use() {
        System.out.println("Binoculars magnify distant objects -- child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Made with lenses and rubber body -- child");
    }

    @Override
    public void getCategory() {
        System.out.println("Viewing Tool -- child");
    }

    @Override
    public void getPurpose() {
        System.out.println("Used for sightseeing and birdwatching -- child");
    }

    @Override
    public void getDurability() {
        System.out.println("Weather-resistant and sturdy -- child");
    }
}
