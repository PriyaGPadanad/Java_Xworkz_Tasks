package com.xworkz.inherit;

public class Java extends Language{
    public Java(){
        super();
        System.out.println("Java is subclass");
    }
    public void compile(){
        System.out.println("Java compiled");
    }
    public void run(){
        System.out.println("Java run");
    }
}
