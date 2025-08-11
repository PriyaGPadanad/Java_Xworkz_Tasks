package com.xworkz.iterator.runner;

import com.xworkz.iterator.dto.FallsDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FallsRunner {
    public static void main(String[] args) {
        List<FallsDTO> fallsList = new ArrayList<>();

        fallsList.add(new FallsDTO("Jog Falls","Shimoga","Karnataka",253,false,true,true,"Freshwater","August to December",true));
        fallsList.add(new FallsDTO("Dudhsagar Falls", "Goa-Karnataka Border", "Goa", 310, true, true, false, "Milky", "Monsoon", true));
        fallsList.add(new FallsDTO("Hogenakkal Falls", "Dharmapuri", "Tamil Nadu", 66, false, false, true, "River Cauvery", "October to March", true));
        fallsList.add(new FallsDTO("Abbey Falls", "Coorg", "Karnataka", 21, true, true, false, "River Kaveri", "July to October", true));
        fallsList.add(new FallsDTO("Iruppu Falls", "Kodagu", "Karnataka", 170, true, true, false, "Lakshmana Tirtha River", "Monsoon", true));
        fallsList.add(new FallsDTO("Shivanasamudra Falls", "Mandya", "Karnataka", 98, false, false, true, "River Cauvery", "July to October", true));
        fallsList.add(new FallsDTO("Barkana Falls", "Agumbe", "Karnataka", 259, true, false, false, "Seeta River", "Monsoon", false));
        fallsList.add(new FallsDTO("Meenmutty Falls", "Wayanad", "Kerala", 300, true, true, false, "Stream", "Post-Monsoon", false));
        fallsList.add(new FallsDTO("Hebbe Falls", "Chikmagalur", "Karnataka", 168, true, true, false, "Stream", "October to January", true));
        fallsList.add(new FallsDTO("Kunchikal Falls", "Agumbe", "Karnataka", 455, false, false, false, "Varahi River", "July to September", true));

        Iterator<FallsDTO> iterator = fallsList.iterator();
        while(iterator.hasNext()) {
            FallsDTO falls = iterator.next();
            System.out.println(falls);
        }
    }
}
