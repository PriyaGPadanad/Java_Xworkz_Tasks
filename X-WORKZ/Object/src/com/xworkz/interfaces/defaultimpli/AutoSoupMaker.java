package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.SoupMaker;

public class AutoSoupMaker implements SoupMaker {
    @Override
    public void makeSoup(){
        System.out.println("AutoSoupMaker:preparing creamy soup with one-touch button");
    }
}
