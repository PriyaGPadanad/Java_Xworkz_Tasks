package com.xworkz.inherit.internal.plant;

public class Cactus extends Plant{
    public Cactus() {
        super();
        System.out.println("Running non-arg constructor Cactus");
    }

    @Override
    public void grow() {
        System.out.println("Cactus grows in arid areas--child");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Cactus photosynthesizes using stem--child");
    }

    @Override
    public void absorbWater() {
        System.out.println("Cactus stores water in tissues--child");
    }

    @Override
    public void provideOxygen() {
        System.out.println("Cactus also provides oxygen--child");
    }

    @Override
    public void reproduce() {
        System.out.println("Cactus reproduces via offshoots--child");
    }

    public void storeWater() {
        System.out.println("new method storeWater in child class");
    }
}
