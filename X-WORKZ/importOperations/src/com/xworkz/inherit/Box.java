package com.xworkz.inherit;

public class Box extends Container{
    public Box(){
        super();
        System.out.println("Box ix subclass");
    }
    public void pack(){
        System.out.println("box packed");
    }
    public void unpack(){
        System.out.println("box unpacked");
    }
}
