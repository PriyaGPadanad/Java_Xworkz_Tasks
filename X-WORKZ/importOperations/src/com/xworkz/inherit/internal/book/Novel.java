package com.xworkz.inherit.internal.book;

public class Novel extends Book{
    public Novel(){
        super();
        System.out.println("running non-arg constructor Novel");
    }
    @Override
    public void read(){
        System.out.println("reading a fiction");
    }
    @Override
    public void open(){
        System.out.println("opening a hardcover novel");
    }
    @Override
    public void close(){
        System.out.println("closing the novel after reading");
    }
    @Override
    public void bookmark(){
        System.out.println("using a ribbon bookmark in novel");
    }
    @Override
    public void carry(){
        System.out.println("carrying a novel with travelling");

    }
    public void review(){
        System.out.println("new method review in child class");
    }
}
