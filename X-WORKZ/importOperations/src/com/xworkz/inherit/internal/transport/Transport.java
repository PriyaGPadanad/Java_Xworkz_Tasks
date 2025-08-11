package com.xworkz.inherit.internal.transport;

public class Transport {
    public void move() {
        System.out.println("Transport is moving--parent");
    }
    public void fuelType() {
        System.out.println("Transport uses fuel--parent");
    }
    public void capacity() {
        System.out.println("Transport has capacity for passengers--parent");
    }
    public void speed() {
        System.out.println("Transport has average speed--parent");
    }
    public void cost() {
        System.out.println("Transport has a maintenance cost--parent");
    }
}
