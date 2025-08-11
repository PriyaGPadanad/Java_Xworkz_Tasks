package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.BreadMaker;

public class DigitalBreadMaker implements BreadMaker {
    @Override
    public void bakeBread(){
        System.out.println("DigitalBreadMaker:Baking multigrain bread with timer");
    }
}
