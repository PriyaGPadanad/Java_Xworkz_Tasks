package com.xworkz.assignment.implementation;

import com.xworkz.assignment.interfaces.VacuumCleaner;

public class DysonVacuum implements VacuumCleaner {
    public void startCleaning(){
        System.out.println("Dyson vacuum  started cleaning");
    }
    public void stopCleaning(){
        System.out.println("Dyson Vacuum stopping");
    }
    public void emptyDustbin(){
        System.out.println("Dyson vacuum emptying dustbin");
    }

}
