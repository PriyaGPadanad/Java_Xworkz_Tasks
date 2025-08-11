package com.xworkz.inherit;

public class Router extends NetworkDevice{
    public Router(){
        super();
        System.out.println("Router is subclass");
    }
    public void routePackets(){
        System.out.println("Routing packets");
    }
}
