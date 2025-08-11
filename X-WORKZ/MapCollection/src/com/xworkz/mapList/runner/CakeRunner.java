package com.xworkz.mapList.runner;

import com.xworkz.mapList.dto.CakeDTO;

import java.util.*;

public class CakeRunner {
    public static void main(String[] args) {
        Map<String, CakeDTO> map = new HashMap<>();

        map.put("ChocoDelight", new CakeDTO("ChocoDelight", "Chocolate", 799.99, "Medium", false, "Round", "Brown", "France", 2, 2015));
        map.put("VanillaDream", new CakeDTO("VanillaDream", "Vanilla", 699.99, "Small", true, "Square", "White", "USA", 1, 2018));
        map.put("BerryBlast", new CakeDTO("BerryBlast", "Strawberry", 899.99, "Large", false, "Heart", "Pink", "Italy", 3, 2020));
        map.put("TropicalTwist", new CakeDTO("TropicalTwist", "Pineapple", 749.99, "Medium", true, "Round", "Yellow", "India", 2, 2017));
        map.put("NuttyBuddy", new CakeDTO("NuttyBuddy", "Hazelnut", 999.99, "Large", false, "Rectangle", "Brown", "Germany", 4, 2016));
        map.put("RedVelvetRush", new CakeDTO("RedVelvetRush", "Red Velvet", 849.99, "Medium", true, "Round", "Red", "USA", 2, 2019));
        map.put("CoffeeCrave", new CakeDTO("CoffeeCrave", "Coffee", 799.99, "Small", false, "Square", "Tan", "Brazil", 1, 2021));
        map.put("MangoMagic", new CakeDTO("MangoMagic", "Mango", 699.99, "Medium", true, "Round", "Orange", "India", 2, 2022));
        map.put("BlackForest", new CakeDTO("BlackForest", "Black Forest", 899.99, "Large", false, "Round", "Dark Brown", "Germany", 3, 2014));
        map.put("LemonLush", new CakeDTO("LemonLush", "Lemon", 749.99, "Small", true, "Oval", "Light Yellow", "UK", 1, 2023));

        List<Map.Entry<String, CakeDTO>> cakeList = new ArrayList<>(map.entrySet());

        System.out.println("Cake List using iterator");
        Iterator<Map.Entry<String, CakeDTO>> iterator = cakeList.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, CakeDTO> entry = iterator.next();
            System.out.println("Key:" + entry.getKey());
            System.out.println("Value:" + entry.getValue());


        }
    }
}
