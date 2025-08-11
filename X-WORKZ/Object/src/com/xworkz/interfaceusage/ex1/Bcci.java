package com.xworkz.interfaceusage.ex1;

public class Bcci {
    private Icc icc;
    public Bcci(Icc icc){
        this.icc=icc;
    }
    public void display(){
        icc.fairPlay();
    }

}
