package com.xworkz.inherit;

public class Smartphone extends Device{
    public Smartphone(){
        super();
        System.out.println("Smartphone is subclass");
    }

    public void makeCall(){
        System.out.println("Making a call");
    }

    public void browserInternet(){
        System.out.println("Browsing the internet");
    }
}
