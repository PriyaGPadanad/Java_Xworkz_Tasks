package com.xworkz.interfaceusage.ex12;

public class Kitchen {
    private Fridge fridge;
    public Kitchen(Fridge fridge){
        this.fridge=fridge;
    }
    public void preserveFood(){
        fridge.cool();
    }
}
