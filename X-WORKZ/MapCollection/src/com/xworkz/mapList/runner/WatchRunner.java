package com.xworkz.mapList.runner;

import com.xworkz.mapList.dto.WatchDTO;

import java.util.*;

public class WatchRunner {
    public static void main(String[] args) {

        Map<String, WatchDTO> map = new HashMap<>();

        map.put("Rolex", new WatchDTO("Rolex", "Submariner", 899999.99, "Black", "Analog", true, "Steel", "Switzerland", 5, 2022));
        map.put("Casio", new WatchDTO("Casio", "G-Shock", 7999.50, "Red", "Digital", true, "Resin", "Japan", 2, 2021));
        map.put("Omega", new WatchDTO("Omega", "Speedmaster", 759999.00, "Silver", "Analog", false, "Titanium", "Switzerland", 4, 2023));
        map.put("Fossil", new WatchDTO("Fossil", "Grant", 9999.00, "Blue", "Analog", false, "Leather", "USA", 2, 2020));
        map.put("Apple", new WatchDTO("Apple", "Watch Series 9", 45999.99, "Space Gray", "Smart", true, "Aluminum", "USA", 1, 2023));
        map.put("Seiko", new WatchDTO("Seiko", "Presage", 34999.00, "Green", "Analog", true, "Steel", "Japan", 3, 2022));
        map.put("Tag Heuer", new WatchDTO("Tag Heuer", "Carrera", 599999.00, "White", "Analog", false, "Ceramic", "Switzerland", 5, 2021));
        map.put("Tissot", new WatchDTO("Tissot", "PRX", 69999.00, "Gold", "Analog", true, "Gold-Plated", "Switzerland", 2, 2023));
        map.put("Garmin", new WatchDTO("Garmin", "Fenix 7", 54999.99, "Black", "Smart", true, "Polymer", "USA", 2, 2022));
        map.put("Timex", new WatchDTO("Timex", "Weekender", 4999.00, "Brown", "Analog", false, "Fabric", "USA", 1, 2019));

        List<Map.Entry<String, WatchDTO>> watchList = new ArrayList<>(map.entrySet());

        System.out.println("Watch List using Iterator");
        Iterator<Map.Entry<String, WatchDTO>> iterator = watchList.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, WatchDTO> entry = iterator.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());

        }
    }
}
