package com.xworkz.july;

import java.util.ArrayList;
import java.util.Collection;

public class Dryfruits {
    public static void main(String[] args) {
        Collection<String> dryfruits = new ArrayList<>();

        dryfruits.add("Almonds");
        dryfruits.add("Cashew");
        dryfruits.add("Pistachios");
        dryfruits.add("Walnuts");
        dryfruits.add("Hazelnuts");
        dryfruits.add("Raisins ");
        dryfruits.add("Sultanas");
        dryfruits.add("Figs");
        dryfruits.add("Apricots");
        dryfruits.add("Prunes");


        System.out.println("There are " + dryfruits.size() + " types af dryfruits are there");

        dryfruits.clear();

        System.out.println("There are " + dryfruits.size() + " types af dryfruits are there after clear");

        dryfruits.add("Brazil nuts");
        dryfruits.add("Dried mango");
        dryfruits.add("Dried cranberries");
        dryfruits.add("Dried kiwi");
        dryfruits.add("Dried mulberries");
        dryfruits.add("Dried tamarind");
        dryfruits.add("Dried lychee");
        dryfruits.add("Dried strawberries");
        dryfruits.add("Dried pineapple");
        dryfruits.add("Dried gooseberries");


        System.out.println("There are " + dryfruits.size() + " types af dryfruits are there");
    }
}
