package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricSlicer;

public class AdjustableSlicer implements ElectricSlicer {
    @Override
    public void slice() {
        System.out.println("AdjustableSlicer: Slicing with adjustable thickness.");
    }
}
