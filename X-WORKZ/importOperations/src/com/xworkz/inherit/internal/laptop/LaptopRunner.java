package com.xworkz.inherit.internal.laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.powerOn();
        l1.powerOff();
        l1.runApplications();
        l1.connectToWiFi();
        l1.updateOS();

        System.out.println("-------------------");
        Laptop l2 = new GamingLaptop();
        l2.powerOn();
        l2.powerOff();
        l2.runApplications();
        l2.connectToWiFi();
        l2.updateOS();

        System.out.println("-----------------");
        GamingLaptop gl = new GamingLaptop();
        gl.powerOn();
        gl.powerOff();
        gl.runApplications();
        gl.connectToWiFi();
        gl.updateOS();

        System.out.println("-------casting example------------");
        User user = new User();
        user.use(l1);
        user.use(l2);
        user.use(gl);
    }
}
