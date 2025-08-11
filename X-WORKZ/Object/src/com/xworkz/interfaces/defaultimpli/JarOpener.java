package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.ElectricOpener;

public class JarOpener implements ElectricOpener {
    @Override
    public void open() {
        System.out.println("JarOpener: Automatically opening tight lids.");
    }
}
