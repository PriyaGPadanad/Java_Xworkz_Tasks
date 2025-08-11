package com.xworkz.collections.runner;

import com.xworkz.collections.dto.MobileDTO;

import java.util.ArrayList;
import java.util.List;

public class MobileMain {
    public static void main(String[] args) {
        List<MobileDTO>mobiles=new ArrayList<>();

        mobiles.add(new MobileDTO("Samsung","S21",69999,"Black","Exynos",8,true));
        mobiles.add(new MobileDTO("Apple", "iPhone 14", 119999, "Blue", "A15 Bionic", 6, true));
        mobiles.add(new MobileDTO("OnePlus", "11R", 39999, "Red", "Snapdragon 8+", 8, true));
        mobiles.add(new MobileDTO("Realme", "Narzo", 15999, "Green", "MediaTek", 6, true));
        mobiles.add(new MobileDTO("Xiaomi", "Note 12", 17999, "Silver", "Snapdragon 695", 6, true));

        mobiles.set(2, new MobileDTO("Nothing", "Phone 2", 44999, "White", "Snapdragon 8+", 8, true));

        System.out.println("List size: " + mobiles.size());
        System.out.println("All Mobiles:");
        for(MobileDTO mobile:mobiles){
            System.out.println(mobile);
        }
    }
}
