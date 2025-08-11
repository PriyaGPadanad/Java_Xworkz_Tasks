package com.xworkz.inherit.internal.laptop;

public class User {
    public void use(Laptop laptop) {
        laptop.powerOn();
        laptop.powerOff();
        laptop.runApplications();
        laptop.connectToWiFi();
        laptop.updateOS();

        if(laptop instanceof GamingLaptop) {
            System.out.println("laptop is an instance of GamingLaptop");
            GamingLaptop gl = (GamingLaptop) laptop;
            gl.enableTurboMode();
        }
    }
}
