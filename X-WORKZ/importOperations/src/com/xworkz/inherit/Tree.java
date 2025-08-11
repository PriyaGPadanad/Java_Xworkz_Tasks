package com.xworkz.inherit;

public class Tree extends Plant{
    public Tree(){
        super();
        System.out.println("Tree is subclass");
    }
    public void shedLeaves(){
        System.out.println("Tree shed leaves ");
    }
    public void produceFruit(){
        System.out.println("Tree produce fruit");
    }
}
