package com.xworkz.interfaces.defaultimpli;

public class FruitDehydrator implements FoodDehydrator{
    @Override
    public void dehydrate(){
        System.out.println("FruitDehydrator:dehydrating fruits efficiently");
    }
}
