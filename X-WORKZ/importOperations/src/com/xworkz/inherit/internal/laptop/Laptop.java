package com.xworkz.inherit.internal.laptop;

public class Laptop {
    public void powerOn() {
        System.out.println("Laptop is starting--parent");
    }

    public void powerOff() {
        System.out.println("Laptop is shutting down--parent");
    }

    public void runApplications() {
        System.out.println("Laptop runs applications--parent");
    }

    public void connectToWiFi() {
        System.out.println("Laptop connects to WiFi--parent");
    }

    public void updateOS() {
        System.out.println("Laptop updates operating system--parent");
    }
}
