package com.xworkz.inherit.internal;

public class Appliance {
    public Appliance(){
        System.out.println("Running non-arg constructor Appliance");
        System.out.println("Appliance created");
    }
    public void use(){
        System.out.println("using appliance");
    }
    public void getBrand(){
        System.out.println("Appliance brand");
    }
    public void getPower(){
        System.out.println("Appliance power consumption");
    }
    public void getType(){
        System.out.println("General appliance type");
    }
    public void getWarranty(){
        System.out.println("Appliance warranty details");
    }
}
