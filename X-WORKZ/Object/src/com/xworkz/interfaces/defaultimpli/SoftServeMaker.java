package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.IceCreamMaker;

public class SoftServeMaker implements IceCreamMaker {
    @Override
    public void freeze(){
        System.out.println("SoftServeMaker:Making soft-serve ice cream");
    }
}
