package com.xworkz.inherit;

public class Truck extends Vehicle{
    public Truck(){
        super();
        System.out.println("truck is subclass ");
    }
    public void loadCargo(){
        System.out.println("Truck loaded cargo");
    }
    public void unloadCargo(){
        System.out.println("truck unloaded cargo");
    }

}
