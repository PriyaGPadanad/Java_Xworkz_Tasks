package com.xworkz.inherit;

public class Skyscraper extends Building{
    public Skyscraper(){
        super();
        System.out.println("skyscraper is subclass");
    }
    public void elevate(){
        System.out.println("skyscraper elevated");
    }
    public void illuminate(){
        System.out.println("skyscraper illuminated");
    }
}
