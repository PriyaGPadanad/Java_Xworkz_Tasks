package com.xworkz.inherit;

public class StrategyGame extends Game{
    public StrategyGame(){
        super();
        System.out.println("StrategyGame is subclass");
    }
    public void plan(){
        System.out.println("Planning Strategy");
    }

}
