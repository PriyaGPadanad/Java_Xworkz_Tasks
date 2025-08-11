package com.xworkz.inheritance.hybrid.ex2;

public class SmartPrinter extends Machine implements Printer{
    public void print(){
        System.out.println("SmartPrinter is printing high-quality pages");
    }
}
