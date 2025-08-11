package com.xworkz.collection.compar.runner;
import com.xworkz.collection.compar.dto.*;

import java.util.*;

public class CollectionRunner {
    public static void main(String[] args) {

        System.out.println("\n=== DTOs With Comparable ===");

        List<VegetableDto> vegetables = Arrays.asList(
                new VegetableDto(90, "Potato"),
                new VegetableDto(110, "Onion"),
                new VegetableDto(50, "Carrot")
        );
        Collections.sort(vegetables);
        for (VegetableDto dto : vegetables) {
            System.out.println(dto);
        }

        List<FruitDto> fruits = Arrays.asList(
                new FruitDto(100, "Mango"),
                new FruitDto(80, "Apple"),
                new FruitDto(150, "Orange")
        );
        Collections.sort(fruits);
        for (FruitDto dto : fruits) {
            System.out.println(dto);
        }

        List<FlowerDto> flowers = Arrays.asList(
                new FlowerDto(40, "Rose"),
                new FlowerDto(200, "Lily"),
                new FlowerDto(10, "Tulip")
        );
        Collections.sort(flowers);
        for (FlowerDto dto : flowers) {
            System.out.println(dto);
        }

        List<FishDto> fish = Arrays.asList(
                new FishDto(500, "Angel"),
                new FishDto(100, "Bangda"),
                new FishDto(50, "Boothayi"),
                new FishDto(1000, "Manji")
        );
        Collections.sort(fish);
        for (FishDto dto : fish) {
            System.out.println(dto);
        }

        System.out.println("\n=== DTOs Without Comparable using Comparator/Stream API ===");

        List<AnimalDto> animals = Arrays.asList(
                new AnimalDto(300, "Dog"),
                new AnimalDto(150, "Cat"),
                new AnimalDto(50, "Rabbit")
        );
        System.out.println("Ascending Animal Prices:");
        animals.stream()
                .sorted((a1, a2) -> Integer.compare(a1.getPrice(), a2.getPrice()))
                .forEach(a -> System.out.println(a));

        List<BirdDto> birds = Arrays.asList(
                new BirdDto(150, "Sparrow"),
                new BirdDto(250, "Parrot"),
                new BirdDto(50, "Pigeon")
        );
        System.out.println("Descending Bird Prices:");
        birds.stream()
                .sorted((b1, b2) -> Integer.compare(b2.getPrice(), b1.getPrice()))
                .forEach(b -> System.out.println(b));

        List<CarDto> cars = Arrays.asList(
                new CarDto(5000, "Honda"),
                new CarDto(12000, "BMW"),
                new CarDto(1000, "Maruti")
        );
        System.out.println("> 100 Cars:");
        cars.stream()
                .filter(car -> car.getPrice() > 100)
                .forEach(car -> System.out.println(car));

        List<MobileDto> mobiles = Arrays.asList(
                new MobileDto(900, "Samsung"),
                new MobileDto(50, "Micromax"),
                new MobileDto(5000, "iPhone")
        );
        System.out.println("< 100 Mobiles:");
        mobiles.stream()
                .filter(mobile -> mobile.getPrice() < 100)
                .forEach(mobile -> System.out.println(mobile));
    }
}

