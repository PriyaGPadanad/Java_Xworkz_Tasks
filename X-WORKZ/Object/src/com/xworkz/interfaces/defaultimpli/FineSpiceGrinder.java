package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.SpiceGrinder;

public class FineSpiceGrinder implements SpiceGrinder {
    @Override
    public void grindSpices() {
        System.out.println("FineSpiceGrinder: Grinding to a fine powder.");
    }
}
