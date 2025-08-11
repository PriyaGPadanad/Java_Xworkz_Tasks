package com.xworkz.mapList.runner;

import com.xworkz.mapList.dto.SunscreenDTO;

import java.util.*;

public class SunscreenRunner {
    public static void main(String[] args) {

        Map<String, SunscreenDTO> map = new HashMap<>();

        map.put("Neutrogena", new SunscreenDTO("Neutrogena", "Ultra Sheer", 549.99, 50, true, "Oily", "Gel", "USA", 88, 2021));
        map.put("La Roche-Posay", new SunscreenDTO("La Roche-Posay", "Anthelios XL", 1499.00, 60, true, "Sensitive", "Cream", "France", 50, 2022));
        map.put("Biotique", new SunscreenDTO("Biotique", "Bio Sandalwood", 299.00, 50, false, "Dry", "Lotion", "India", 120, 2020));
        map.put("Lotus", new SunscreenDTO("Lotus", "Safe Sun", 349.00, 40, true, "Combination", "Cream", "India", 100, 2019));
        map.put("Nivea", new SunscreenDTO("Nivea", "Sun Protect", 499.00, 30, false, "Normal", "Lotion", "Germany", 125, 2021));
        map.put("Mamaearth", new SunscreenDTO("Mamaearth", "Aqua Glow", 399.00, 50, true, "All", "Gel", "India", 80, 2023));
        map.put("The Derma Co", new SunscreenDTO("The Derma Co", "1% Hyaluronic Sunscreen", 499.00, 50, true, "Dry", "Cream", "India", 50, 2022));
        map.put("Minimalist", new SunscreenDTO("Minimalist", "SPF 50 PA++++", 599.00, 50, true, "All", "Cream", "India", 50, 2023));
        map.put("Cetaphil", new SunscreenDTO("Cetaphil", "Sun SPF 50+", 899.00, 50, true, "Sensitive", "Lotion", "USA", 100, 2020));
        map.put("WOW Skin Science", new SunscreenDTO("WOW Skin Science", "Matte Finish", 349.00, 35, false, "Oily", "Cream", "India", 100, 2021));

        List<Map.Entry<String, SunscreenDTO>> sunScreenList = new ArrayList<>(map.entrySet());

        System.out.println("Sunscreen List using Iterator");
        Iterator<Map.Entry<String, SunscreenDTO>> iterator = sunScreenList.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, SunscreenDTO> entry = iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());

        }
    }
}
