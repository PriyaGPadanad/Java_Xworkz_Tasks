package com.xworkz.inheritance.hybrid.ex5;

public class CorporateTrainer extends Employee implements Trainer{
    @Override
    public void giveTraining(){
        System.out.println("CorporateTrainer is giving a session on leadership");
    }

}
