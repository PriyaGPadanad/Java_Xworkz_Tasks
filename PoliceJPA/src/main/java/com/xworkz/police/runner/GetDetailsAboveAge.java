package com.xworkz.police.runner;


import com.xworkz.police.entity.PoliceEntity;
import com.xworkz.police.service.PoliceServiceImpl;

import java.util.List;

public class GetDetailsAboveAge {
    public static void main(String[] args) {
        List<PoliceEntity> list = new PoliceServiceImpl().getNameAndPlaceAndEmailByAgeLessThan30();

        // Optional: print the results
        list.forEach(System.out::println);
    }
}