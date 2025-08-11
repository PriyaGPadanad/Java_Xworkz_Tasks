package com.xworkz.interfaceusage.ex2;

public class Government {
    private final Constitution constitution;
    public Government(Constitution constitution){
        this.constitution=constitution;
    }
    public void enforce(){
        constitution.followLaws();
    }
}
