package com.xworkz.string.internal;

public class Dishwasher {
    private String brand;
    private int racks;
    private boolean hasDryer;

    public Dishwasher(String brand, int racks, boolean hasDryer) {
        this.brand = brand;
        this.racks = racks;
        this.hasDryer = hasDryer;
    }

    @Override
    public String toString() {
        return "Dishwasher [brand=" + brand + ", racks=" + racks + ", dryer=" + hasDryer + "]";
    }

        @Override
        public int hashCode(){
            return 8790;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dishwasher) {
            Dishwasher other = (Dishwasher) obj;
            return this.brand.equals(other.brand);
        }
        return false;
    }

}


