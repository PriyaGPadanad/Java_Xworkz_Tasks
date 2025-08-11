package com.xworkz.interfaces.defaultinterface;

public interface FoodDehydrator {
    default void dehydrate(){
        System.out.println("FoodDehydrator:Default dehydrating");
    }
}
