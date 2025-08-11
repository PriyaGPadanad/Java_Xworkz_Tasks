package com.xworkz.inherit;

public class Dolphin extends Animal{
    public Dolphin(){
        super();
        System.out.println("Dolphin is subclass");

    }
    public void swim(){
        System.out.println("Dolphin swam");
    }
    public void echolocate(){
        System.out.println("Dolphin echolocated");
    }
}
