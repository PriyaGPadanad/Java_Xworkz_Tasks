package com.xworkz.inherit;

public class Python extends Language{
    public Python(){
        super();
        System.out.println("python is subclass");
    }
    public void debug(){
        System.out.println("Python debugged");
    }
    public void execute(){
        System.out.println("Python executed");
    }


}
