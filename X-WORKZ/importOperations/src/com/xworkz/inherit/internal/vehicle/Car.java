package com.xworkz.inherit.internal.vehicle;

public class Car extends Vehicle{
    public Car(){
        super();
        System.out.println("Running non-arg constructor Car");
    }
    @Override
    public void start(){
        System.out.println("Running non-arg constructor Car");
    }
    @Override
    public void stop(){
        System.out.println("car comes to a halt");
    }
    @Override
    public void accelerate(){
        System.out.println("car speeds up");
    }

    @Override
    public void brake() {
        System.out.println("Car usesABS brakes");
    }
    @Override
    public void fuel(){
        System.out.println("car uses petrol or diesel");
    }

    public void openTrunk(){
        System.out.println("new method openTrunk in child class");
    }


}
