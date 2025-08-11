package com.xworkz.string.internal;

public class Cupcake {
    private String flavor;
    private String frostingColor;
    private boolean hasSprinkles;

    public Cupcake(String flavor, String frostingColor, boolean hasSprinkles) {
        this.flavor = flavor;
        this.frostingColor = frostingColor;
        this.hasSprinkles = hasSprinkles;
    }

    @Override
    public String toString() {
        return "Cupcake [flavor=" + flavor + ", frostingColor=" + frostingColor + ", hasSprinkles=" + hasSprinkles + "]";
    }

        @Override
        public int hashCode(){
            return 1357;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cupcake) {
            Cupcake other = (Cupcake) obj;
            return this.flavor.equals(other.flavor);
        }
        return false;
    }

}

