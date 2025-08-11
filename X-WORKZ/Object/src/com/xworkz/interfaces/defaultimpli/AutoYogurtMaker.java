package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.YogurtMaker;

public class AutoYogurtMaker implements YogurtMaker {
    @Override
    public void ferment(){
        System.out.println("AutoYogurtMaker:Making thick yogurt automatically");
    }
}
