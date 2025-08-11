package com.xworkz.inherit;

public class Printer extends Device{
    public Printer(){
        super();
        System.out.println("Printer is subclass");
    }
    public void printDocument(){
        System.out.println("Printer printing Document");
    }
    public void scanDocument(){
        System.out.println("Printer scanning document");
    }
}
