package com.xworkz.inherit.internal.biology;

public class NerveCell extends Cell{
    public NerveCell(){
        super();
        System.out.println("running non-arg constructor NerveCell");

    }
    @Override
    public void function(){
        System.out.println("Nerve cell transmits nerve impulses");
    }

    @Override
    public void divide(){
        System.out.println("Nerve cell rarely divides after maturity");
    }
    @Override
    public void absorbNutrients(){
        System.out.println("Nerve cell absorbs glucose and oxygen");
    }
    @Override
    public void releaseEnergy(){
        System.out.println("Nerve cell uses energy to send signals");
    }
    @Override
    public void maintainStructure(){
        System.out.println("Nerve cell has a long axon structure");
    }
    public void transmitSignal(){
        System.out.println("New method transmitSignal in child class");
    }


}
