package com.xworkz.inherit;

public class Refrigerator extends Container{
    public Refrigerator(){
        super();
        System.out.println("Refrigerator is subclass");
    }
    public void cool(){
        System.out.println("cooling items");
    }
    public void openDoor(){
        System.out.println("opening door");
    }

    public void closeDoor(){
        System.out.println("closing door");
    }

    public void defrost(){
        System.out.println("defrosting to prevent ice build up");
    }
}
