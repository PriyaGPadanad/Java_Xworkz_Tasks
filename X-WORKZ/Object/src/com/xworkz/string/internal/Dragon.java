package com.xworkz.string.internal;

public class Dragon {
    private String species;
    private int firePower;
    private boolean canFly;

    public Dragon(String species, int firePower, boolean canFly) {
        this.species = species;
        this.firePower = firePower;
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Dragon [species=" + species + ", firePower=" + firePower + ", canFly=" + canFly + "]";
    }

        @Override
        public int hashCode(){
            return  43;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dragon) {
            Dragon other = (Dragon) obj;
            return this.species.equals(other.species) && this.canFly;
        }
        return false;
    }

}


