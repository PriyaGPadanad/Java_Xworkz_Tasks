package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.HandMixer;

public class TurboMixer implements HandMixer {
    @Override
    public void mix(){
        System.out.println("TurboMixer:Mixing with turbo speed settings");
    }
}
