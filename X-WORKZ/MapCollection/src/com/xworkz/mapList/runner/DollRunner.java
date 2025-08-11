package com.xworkz.mapList.runner;

import com.xworkz.mapList.dto.DollDTO;

import java.util.*;

public class DollRunner {

    public static void main(String[] args) {
        Map<String, DollDTO> map = new HashMap<>();

        map.put("Barbie", new DollDTO("Barbie", "Mattel", 1499.99, "Plastic", "Pink", true, "USA", 5, 2022, "Fashion"));
        map.put("Ken", new DollDTO("Ken", "Mattel", 1299.99, "Plastic", "Blue", false, "USA", 5, 2022, "Fashion"));
        map.put("American Girl", new DollDTO("American Girl", "Pleasant Company", 8999.99, "Vinyl", "Brown", true, "USA", 8, 2021, "Historical"));
        map.put("Bratz", new DollDTO("Bratz", "MGA Entertainment", 1999.99, "Plastic", "Purple", false, "USA", 6, 2020, "Fashion"));
        map.put("Monster High", new DollDTO("Monster High", "Mattel", 2499.99, "Plastic", "Multicolor", true, "USA", 7, 2023, "Fantasy"));
        map.put("L.O.L. Surprise", new DollDTO("L.O.L. Surprise", "MGA Entertainment", 999.99, "Plastic", "Various", false, "China", 4, 2022, "Surprise"));
        map.put("Disney Princess", new DollDTO("Disney Princess", "Hasbro", 1799.99, "Plastic", "Yellow", true, "China", 3, 2023, "Princess"));
        map.put("Baby Alive", new DollDTO("Baby Alive", "Hasbro", 2299.99, "Vinyl", "Peach", false, "China", 2, 2021, "Baby"));
        map.put("Cabbage Patch", new DollDTO("Cabbage Patch", "Original Appalachian Artworks", 3499.99, "Cloth", "Green", true, "USA", 3, 2019, "Classic"));
        map.put("Rainbow High", new DollDTO("Rainbow High", "MGA Entertainment", 2799.99, "Plastic", "Rainbow", true, "China", 6, 2023, "Fashion"));

        List<Map.Entry<String,DollDTO>> dollList=new ArrayList<>(map.entrySet());

        System.out.println("Doll List using Iterator");
        Iterator<Map.Entry<String,DollDTO>> iterator=dollList.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,DollDTO>entry=iterator.next();
            System.out.println("Key:"+entry.getKey());
            System.out.println("Value:"+entry.getValue());
        }
    }
}
