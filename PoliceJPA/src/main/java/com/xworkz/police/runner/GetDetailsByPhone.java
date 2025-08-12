package com.xworkz.police.runner;

import com.xworkz.police.entity.PoliceEntity;
import com.xworkz.police.service.PoliceServiceImpl;

public class GetDetailsByPhone {
    public static void main(String[] args) {
        PoliceEntity policeEntity = new PoliceServiceImpl().getNameAndAgeByPhoneNo(9812345670L);

        // Optional: print the result
        System.out.println(policeEntity);
    }
}

