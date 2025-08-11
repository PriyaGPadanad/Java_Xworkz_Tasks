package com.xworkz.inherit.internal.plant;

public class Gardener {
    public void care(Plant plant) {
        plant.grow();
        plant.photosynthesize();
        plant.absorbWater();
        plant.provideOxygen();
        plant.reproduce();

        if(plant instanceof Cactus) {
            System.out.println("plant is an instance of Cactus");
            Cactus cactus = (Cactus) plant;
            cactus.storeWater();
        }
    }
}
