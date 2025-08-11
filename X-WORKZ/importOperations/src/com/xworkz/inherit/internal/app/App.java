package com.xworkz.inherit.internal.app;

public class App {
    public void launch() {
        System.out.println("Launching app--parent");
    }
    public void close() {
        System.out.println("Closing app--parent");
    }
    public void update() {
        System.out.println("App update available--parent");
    }
    public void notifyUser() {
        System.out.println("Sending notifications to user--parent");
    }
    public void userLogin() {
        System.out.println("User login to app--parent");
    }
}
