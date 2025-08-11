package com.xworkz.july;

import java.util.ArrayList;
import java.util.Collection;

public class Flowers {

    public static void main(String[] args) {
        Collection<String>flowers=new ArrayList<>();

        flowers.add("Rose");
        flowers.add("Aster");
        flowers.add("Lotus");
        flowers.add("Snapdragon");
        flowers.add("Cosmos");
        flowers.add("Bluebell");
        flowers.add("Ranunculus");
        flowers.add("Freesia");
        flowers.add("Magnolia");
        flowers.add("Petunia");

        System.out.println("The number of Dress Brands are "+flowers.size());

        flowers.clear();

        System.out.println("The number of Dress Brands are after clear "+flowers.size());

        flowers.add("Tulip");
        flowers.add("Sunflower");
        flowers.add("Daisy");
        flowers.add("Daffodil");
        flowers.add("Orchid");
        flowers.add("Poppy");
        flowers.add("Gardenia");
        flowers.add("Camellia");
        flowers.add("Hibiscus");
        flowers.add("Jasmine");

        System.out.println("The number of Dress Brands are "+flowers.size());

    }
}
