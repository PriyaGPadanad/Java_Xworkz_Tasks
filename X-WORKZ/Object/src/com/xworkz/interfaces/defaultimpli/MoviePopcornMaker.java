package com.xworkz.interfaces.defaultimpli;

public class MoviePopcornMaker implements PopcornMaker{
    @Override
    public void pop(){
        System.out.println("MoviePopcornMaker:pops theater-style popcorn");
    }
}
