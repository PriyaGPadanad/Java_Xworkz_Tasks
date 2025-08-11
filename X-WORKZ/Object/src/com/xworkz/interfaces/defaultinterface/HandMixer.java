package com.xworkz.interfaces.defaultinterface;

public interface HandMixer {
    default void mix(){
        System.out.println("HandMixer:Mixing ingredients smoothly");
    }
}
