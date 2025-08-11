package com.xworkz.inherit;

public class Glass extends Material{
    public Glass(){
        super();
        System.out.println("Glass is subclass");
    }
    public void melt(){
        System.out.println("Glass melted");
    }
    public void temper(){
        System.out.println("Glass tempered");
    }
}
