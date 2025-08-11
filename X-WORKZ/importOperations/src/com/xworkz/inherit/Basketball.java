package com.xworkz.inherit;

public class Basketball extends Sport{
    public Basketball(){
        super();
        System.out.println("Basketball is subclass");
    }
    public void shoot(){
        System.out.println("Basketball shot");
    }
    public void dribble(){
        System.out.println("Basketball dribbled");
    }
}
