package com.xworkz.inherit;

import com.xworkz.Projector.internal.Screw;

public class Screwdriver extends Tool{
    public Screwdriver(){
        super();
        System.out.println("Screwdriver is subclass");
    }
    public void tighten(){
        System.out.println("Screwdriver tightening");
    }
    public void loosen(){
        System.out.println("Screwdriver loosening");
    }
}
