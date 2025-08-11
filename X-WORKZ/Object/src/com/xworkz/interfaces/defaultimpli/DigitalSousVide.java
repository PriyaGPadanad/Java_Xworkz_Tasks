package com.xworkz.interfaces.defaultimpli;

import com.xworkz.interfaces.defaultinterface.SousVide;

public class DigitalSousVide implements SousVide {
    @Override
    public void cookSousVide(){
        System.out.println("DigitalSousVide:Sous-vide cooking with bluetooth monitoring");
    }
}
