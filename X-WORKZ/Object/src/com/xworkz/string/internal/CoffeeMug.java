package com.xworkz.string.internal;

public class CoffeeMug {
    private String color;
    private int capacityInMl;
    private boolean isMicrowaveSafe;

    public CoffeeMug(String color, int capacityInMl, boolean isMicrowaveSafe) {
        this.color = color;
        this.capacityInMl = capacityInMl;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public String toString() {
        return "CoffeeMug [color=" + color + ", capacity=" + capacityInMl + "ml, microwaveSafe=" + isMicrowaveSafe + "]";
    }

        @Override
        public int hashCode(){
            return 5678;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CoffeeMug) {
            CoffeeMug other = (CoffeeMug) obj;
            return this.color.equals(other.color);
        }
        return false;
    }

}

