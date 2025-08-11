package com.xworkz.inherit;

public class Bag extends Container{
    public Bag(){
        super();
        System.out.println("bag is subclass");
    }
    public void carry(){
        System.out.println("Bag carried");
    }
    public void fold(){
        System.out.println("bag folded");
    }
}
