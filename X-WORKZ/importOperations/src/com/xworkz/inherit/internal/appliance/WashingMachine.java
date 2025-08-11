package com.xworkz.inherit.internal.appliance;

public class WashingMachine extends Appliance{
    public WashingMachine() {
        super();
        System.out.println("Running non-arg constructor WashingMachine");
    }

    @Override
    public void switchOn() {
        System.out.println("Washing machine powered on--child");
    }

    @Override
    public void switchOff() {
        System.out.println("Washing machine powered off--child");
    }

    @Override
    public void consumePower() {
        System.out.println("Washing machine uses moderate electricity--child");
    }

    @Override
    public void operate() {
        System.out.println("Washing machine cleans clothes--child");
    }

    @Override
    public void maintain() {
        System.out.println("Washing machine needs cleaning regularly--child");
    }

    public void rinseClothes() {
        System.out.println("new method rinseClothes in child class");
    }
}
