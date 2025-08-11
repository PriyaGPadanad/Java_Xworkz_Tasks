package com.xworkz.assignment.implementation;

import com.xworkz.assignment.interfaces.CoffeeMachine;
public class NesCafeMachine implements CoffeeMachine{

    public void brew(){
        System.out.println("Nescafe brewing coffee");
    }
    public void steamMilk(){
        System.out.println("NesCafe steaming milk");
    }
    public void clean(){
        System.out.println("Nescafe cleaning process running");
    }
}
