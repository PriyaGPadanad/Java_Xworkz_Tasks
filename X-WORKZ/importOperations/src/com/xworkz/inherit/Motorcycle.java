package com.xworkz.inherit;

public class Motorcycle extends Vehicle{
    public Motorcycle(){
        super();
        System.out.println("Motorcycle subclass");

    }

    public void wheelie(){
        System.out.println("Motorcycle doing wheelie");
    }

    public void lean(){
        System.out.println("Motorcycle leaning");
    }
}
