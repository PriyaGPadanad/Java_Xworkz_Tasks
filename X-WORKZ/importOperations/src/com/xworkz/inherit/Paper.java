package com.xworkz.inherit;

public class Paper extends Publication{
    public Paper(){
        super();
        System.out.println("paper is subclass");
    }
    public void read(){
        System.out.println("paper read");
    }
    public void summarize(){
        System.out.println("paper summarize");
    }
}
