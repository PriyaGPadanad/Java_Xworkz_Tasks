package com.xworkz.inherit.internal.machine;

public class Machine {
    public void start() {
        System.out.println("Machine starting--parent");
    }

    public void stop() {
        System.out.println("Machine stopping--parent");
    }

    public void run() {
        System.out.println("Machine running--parent");
    }

    public void performTask() {
        System.out.println("Machine performing a task--parent");
    }

    public void consumeEnergy() {
        System.out.println("Machine consumes energy--parent");
    }
}
