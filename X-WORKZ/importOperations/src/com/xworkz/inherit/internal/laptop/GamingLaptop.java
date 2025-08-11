package com.xworkz.inherit.internal.laptop;

public class GamingLaptop extends Laptop{
    public GamingLaptop() {
        super();
        System.out.println("Running non-arg constructor GamingLaptop");
    }

    @Override
    public void powerOn() {
        System.out.println("Gaming laptop boots with RGB lights--child");
    }

    @Override
    public void powerOff() {
        System.out.println("Gaming laptop shuts down with animation--child");
    }

    @Override
    public void runApplications() {
        System.out.println("Gaming laptop runs high-end games--child");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Gaming laptop connects via high-speed adapter--child");
    }

    @Override
    public void updateOS() {
        System.out.println("Gaming laptop installs gaming drivers--child");
    }

    public void enableTurboMode() {
        System.out.println("new method enableTurboMode in child class");
    }
}
