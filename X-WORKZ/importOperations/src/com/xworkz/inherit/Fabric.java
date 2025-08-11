package com.xworkz.inherit;

public class Fabric extends Material{
    public Fabric(){
        super();
        System.out.println("fabric is subclass");
    }
    public void weave(){
        System.out.println("Fabric woven");
    }
    public void dye(){
        System.out.println("fabric dyed");
    }
}
