package com.xworkz.inherit.internal.transport;

public class ElectricCar extends Transport{
    public ElectricCar() {
        super();
        System.out.println("Running non-arg constructor ElectricCar");
    }

    @Override
    public void move() {
        System.out.println("Electric car is moving silently--child");
    }

    @Override
    public void fuelType() {
        System.out.println("Electric car uses electricity--child");
    }

    @Override
    public void capacity() {
        System.out.println("Electric car fits 5 people--child");
    }

    @Override
    public void speed() {
        System.out.println("Electric car has high acceleration--child");
    }

    @Override
    public void cost() {
        System.out.println("Electric car has low running cost--child");
    }

    public void batteryStatus() {
        System.out.println("New method batteryStatus in child class");
    }
}
