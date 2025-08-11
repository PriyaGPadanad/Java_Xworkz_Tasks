package com.xworkz.interfaceusage.ex3;

public class OperatingSystem {
    private Laptop laptop;
    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
    }
    public void operate(){
        laptop.process();
    }
}
