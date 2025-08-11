package com.xworkz.iterator.runner;

import com.xworkz.iterator.dto.PerfumeDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PerfumeRunner {
    public static void main(String[] args) {
        List<PerfumeDTO> perfumeList = new ArrayList<>();

        perfumeList.add(new PerfumeDTO("Mist Bliss", "Fogg", "Body Spray", 199.0, "Citrus", 120, "Blue", "India", true, "2026-12"));
        perfumeList.add(new PerfumeDTO("Fresh Bloom", "Engage", "Deodorant", 210.0, "Floral", 150, "Pink", "India", true, "2027-01"));
        perfumeList.add(new PerfumeDTO("Ocean Vibe", "Park Avenue", "Perfume", 349.0, "Aqua", 100, "Teal", "India", false, "2025-11"));
        perfumeList.add(new PerfumeDTO("Royal Oud", "Ajmal", "Attar", 799.0, "Woody", 50, "Golden", "UAE", false, "2026-05"));
        perfumeList.add(new PerfumeDTO("Velvet Musk", "Skinn", "Perfume", 1299.0, "Musk", 100, "White", "France", true, "2027-08"));
        perfumeList.add(new PerfumeDTO("Citrus Glimport java.util.*;\now", "Nivea", "Deodorant", 179.0, "Citrus", 150, "Yellow", "Germany", true, "2026-03"));
        perfumeList.add(new PerfumeDTO("Lavender Mist", "Wild Stone", "Perfume", 399.0, "Lavender", 120, "Purple", "India", false, "2027-09"));
        perfumeList.add(new PerfumeDTO("Black Night", "Axe", "Body Spray", 299.0, "Spicy", 110, "Black", "India", true, "2026-07"));
        perfumeList.add(new PerfumeDTO("White Oud", "Zara", "Perfume", 1599.0, "Oud", 100, "White", "Spain", false, "2028-01"));
        perfumeList.add(new PerfumeDTO("Floral Kiss", "Titan", "Perfume", 899.0, "Rose", 75, "Red", "India", true, "2026-10"));

        Iterator<PerfumeDTO> iterator = perfumeList.iterator();
        while (iterator.hasNext()) {
            PerfumeDTO perfume = iterator.next();
            System.out.println(perfume);


        }


    }
}

