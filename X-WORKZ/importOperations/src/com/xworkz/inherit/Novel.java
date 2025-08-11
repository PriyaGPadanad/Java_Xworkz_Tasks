package com.xworkz.inherit;

public class Novel extends Book {
    public Novel(){
        super();
        System.out.println("Novel is superclass");
    }
    public void readChapter(){
        System.out.println("Reading chapter in novel");
    }
    public void turnPage(){
        System.out.println("Turning page in novel");
    }

}
