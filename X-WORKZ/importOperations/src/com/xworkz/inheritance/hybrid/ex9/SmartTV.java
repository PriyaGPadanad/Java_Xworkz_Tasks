package com.xworkz.inheritance.hybrid.ex9;

public class SmartTV extends Appliance implements InternetEnabled{
    @Override
    public void connectWifi(){
        System.out.println("smartTV connected to wifi");
    }
}
