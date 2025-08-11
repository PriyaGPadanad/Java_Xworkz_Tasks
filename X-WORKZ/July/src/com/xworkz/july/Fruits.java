package com.xworkz.july;

import java.util.ArrayList;
import java.util.Collection;

public class Fruits {
    public static void main(String[] args) {
        Collection<String>fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");
        fruits.add("Custard Apple");
        fruits.add("Pineapple");
        fruits.add("Berries");
        fruits.add("Fig");
        fruits.add("Watermelon");
        fruits.add("Dragon");

        System.out.println("There are "+fruits.size()+" types af fruits are there");

        fruits.clear();

        System.out.println("There are "+fruits.size()+" types af fruits are there after clear");

        fruits.add("Jack Fruit");
        fruits.add("Grapes");
        fruits.add("Strawberry");
        fruits.add("Cherry");
        fruits.add("Peach");
        fruits.add("Plum");
        fruits.add("Apricot");
        fruits.add("Gooseberry");
        fruits.add("Mulberry");
        fruits.add("Papaya");

        System.out.println("There are "+fruits.size()+" types af fruits are there");

    }
}
