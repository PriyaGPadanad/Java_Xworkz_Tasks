package com.xworkz.inherit;

public class SavingsAccount extends Account{
    public SavingsAccount(){
        super();
        System.out.println("savingsAccount is subclass");
    }
    public void calculateInterest(){
        System.out.println("Calculating interest");
    }
}
