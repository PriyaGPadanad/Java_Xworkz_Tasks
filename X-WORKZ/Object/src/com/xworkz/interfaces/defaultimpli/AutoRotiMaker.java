package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.RotiMaker;

public class AutoRotiMaker implements RotiMaker {
    @Override
    public void makeRoti(){
        System.out.println("AutoRotiMaker:Making fluffy rotis with auto-press");
    }
}
