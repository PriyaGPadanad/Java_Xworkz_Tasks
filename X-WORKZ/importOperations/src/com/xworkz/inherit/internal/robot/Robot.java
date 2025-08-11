package com.xworkz.inherit.internal.robot;

public class Robot {
    public void powerOn() {
        System.out.println("Robot is powering on--parent");
    }

    public void performTask() {
        System.out.println("Robot is performing a task--parent");
    }

    public void recharge() {
        System.out.println("Robot is recharging--parent");
    }

    public void move() {
        System.out.println("Robot is moving--parent");
    }

    public void shutdown() {
        System.out.println("Robot is shutting down--parent");
    }
}
