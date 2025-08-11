package com.xworkz.interfaceusage.ex20;

public class Bakery {
    private Oven oven;
    public Bakery(Oven oven){
        this.oven=oven;
    }
    public void prepareFood(){
        oven.bake();
    }
}
