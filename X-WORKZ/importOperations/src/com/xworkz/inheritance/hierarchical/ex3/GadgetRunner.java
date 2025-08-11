package com.xworkz.inheritance.hierarchical.ex3;

public class GadgetRunner {
    public static void main(String[] args){
        SmartPhone phone=new SmartPhone();
        phone.powerOn();
        phone.makeCall();

        Smartwatch watch=new Smartwatch();
        watch.powerOn();
        watch.showTime();
    }
}
