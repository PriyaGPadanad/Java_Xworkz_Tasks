package com.xworkz.interfaces.defaultinterface;

public interface ElectricWok {
    default void stirFry() {
        System.out.println("ElectricWok: Stir-frying in default setting.");
    }
}
