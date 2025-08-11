package com.xworkz.inherit.internal.clothing;

public class Raincoat extends Clothing{
    public Raincoat() {
        super();
        System.out.println("Running non-arg constructor Raincoat");
    }

    @Override
    public void wear() {
        System.out.println("Wearing raincoat during rainy weather--child");
    }

    @Override
    public void wash() {
        System.out.println("Washing the waterproof raincoat--child");
    }

    @Override
    public void fold() {
        System.out.println("Folding the raincoat compactly--child");
    }

    @Override
    public void dry() {
        System.out.println("Air drying the raincoat--child");
    }

    @Override
    public void store() {
        System.out.println("Storing the raincoat in the closet--child");
    }

    public void repelWater() {
        System.out.println("New method repelWater in child class");
    }
}
