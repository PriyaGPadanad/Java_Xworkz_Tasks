package com.xworkz.inherit;

public class Application extends Software{
    public Application(){
        super();
        System.out.println("application is subclass");
    }
    public void run(){
        System.out.println("Application running");
    }
    public void update(){
        System.out.println("Application updated");
    }
}
