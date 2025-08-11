package com.xworkz.collections.runner;

import com.xworkz.collections.dto.CarDTO;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<CarDTO> cars=new ArrayList<>();

        cars.add(new CarDTO("Hyundai","Creta","Petrol",1300000,"White",17,true));
        cars.add(new CarDTO("Kia","Seltos","Diesel",1450000,"Black",19,true));
        cars.add(new CarDTO("Tata","Nexon","Petrol",120000,"Grey",18,true));
        cars.add(new CarDTO("Mahindra","XUV 300","Diesel",1250000,"Red",20,false));
        cars.add(new CarDTO("Toyota","Innova","Diesel",1800000,"Silver",14,true));

        cars.set(2,new CarDTO("Honda","City","Petrol",14000000,"Blue",16,true));

        System.out.println("List size:"+cars.size());
        System.out.println("All Cars:");
        for(CarDTO car:cars){
            System.out.println(car);
        }
    }
}
