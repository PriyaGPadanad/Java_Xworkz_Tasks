package com.xworkz.inherit;

public class Item extends Tool{
    public Item(){
        super();
        System.out.println("Item is subclass");
    }
    public void discard() {
        System.out.println("Discarding item");
    }

    public void inspect() {
        System.out.println("Inspecting item");
    }
}
