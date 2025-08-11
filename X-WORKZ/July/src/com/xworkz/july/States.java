package com.xworkz.july;

import java.util.ArrayList;
import java.util.Collection;

public class States {
    public static void main(String[] args) {
        Collection<String> states = new ArrayList<>();

        states.add("Karnataka");
        states.add("Sikkim");
        states.add("TamilNadu");
        states.add("Punjab");
        states.add("Telangana");
        states.add("Tripura");
        states.add("UP");
        states.add("MP");
        states.add("West Bengal");
        states.add("Ladakh");

        System.out.println("These are " + states.size() + " number af fruits are there");

        states.clear();

        System.out.println("These are " + states.size() + " number af states are there after clear");

        states.add("Goa");
        states.add("Assam");
        states.add("Gujarat");
        states.add("Jharkhand");
        states.add("Maharashtra");
        states.add("Kerala");
        states.add("Manipur");
        states.add("Meghalaya");
        states.add("Mizoram");
        states.add("Odisha");


        System.out.println("These are " + states.size() + " number af states are there");
    }
}
