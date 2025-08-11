package com.xworkz.inheritance.hierarchical.ex11;

public class DeviceRunner {
    public static void main(String[] args){
        Tablet tab= new Tablet();
        tab.draw();
        tab.start();

        Laptop laptop=new Laptop();
        laptop.code();
        laptop.start();
    }
}
