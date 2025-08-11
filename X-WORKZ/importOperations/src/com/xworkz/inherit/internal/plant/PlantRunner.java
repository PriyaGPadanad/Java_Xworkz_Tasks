package com.xworkz.inherit.internal.plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.grow();
        plant1.photosynthesize();
        plant1.absorbWater();
        plant1.provideOxygen();
        plant1.reproduce();

        System.out.println("-------------------");
        Plant plant2 = new Cactus();
        plant2.grow();
        plant2.photosynthesize();
        plant2.absorbWater();
        plant2.provideOxygen();
        plant2.reproduce();

        System.out.println("-----------------");
        Cactus cactus = new Cactus();
        cactus.grow();
        cactus.photosynthesize();
        cactus.absorbWater();
        cactus.provideOxygen();
        cactus.reproduce();

        System.out.println("-------casting example------------");
        Gardener gardener = new Gardener();
        gardener.care(plant1);
        gardener.care(plant2);
        gardener.care(cactus);
    }
}
