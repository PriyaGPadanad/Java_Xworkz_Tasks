package com.xworkz.inherit;

public class Chair extends Furniture{
    public Chair(){
        super();
        System.out.println("Chair is subclass");
    }
    public void sitOn(){
        System.out.println("Chair sat on");
    }
    public void adjustHeight(){
        System.out.println("Chair height adjusted");
    }
}
