package com.xworkz.interfaces.defaultinterface;

public interface PortableBlender {
    default void blend(){
        System.out.println("PortableBlender:Blending on default speed");
    }
}
