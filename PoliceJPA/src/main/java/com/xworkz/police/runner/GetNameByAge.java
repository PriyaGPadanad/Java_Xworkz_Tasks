package com.xworkz.police.runner;

import com.xworkz.police.repository.PoliceRepositoryImpl;

import java.util.List;

public class GetNameByAge {
    public static void main(String[] args) {
        List<String> list = new PoliceRepositoryImpl().getNameByAge();

        // Optional: print the names
        for (String name : list) {
            System.out.println(name);
        }
    }
}