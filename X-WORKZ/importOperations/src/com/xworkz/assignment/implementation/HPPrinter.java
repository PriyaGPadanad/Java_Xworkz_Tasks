package com.xworkz.assignment.implementation;

import com.xworkz.assignment.interfaces.Printer;

public class HPPrinter implements Printer {
    public void print(){
        System.out.println("HP printer is printing");
    }
    public void scan(){
        System.out.println("HP Printer is scanning");
    }

    public void copy(){
        System.out.println("HP Printer is copying");
    }

}
