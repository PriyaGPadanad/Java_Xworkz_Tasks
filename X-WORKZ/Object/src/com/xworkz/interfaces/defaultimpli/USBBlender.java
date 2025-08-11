package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.PortableBlender;

public class USBBlender implements PortableBlender {
    @Override
    public void blend(){
        System.out.println("USBBlender:Portable blending with USB charging");
    }
}
