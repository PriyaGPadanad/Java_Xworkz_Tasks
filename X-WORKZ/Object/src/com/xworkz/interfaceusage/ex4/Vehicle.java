package com.xworkz.interfaceusage.ex4;

public class Vehicle {
    private Engine engine;
    public Vehicle(Engine engine){
        this.engine=engine;
    }
    public void run(){
        engine.start();
    }
}
