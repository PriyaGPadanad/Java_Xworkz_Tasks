package com.xworkz.string.internal;

public class ElectricIron {
    private String brand;
    private int powerWatts;
    private boolean steamEnabled;

    public ElectricIron(String brand, int powerWatts, boolean steamEnabled) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.steamEnabled = steamEnabled;
    }

    @Override
    public String toString() {
        return "ElectricIron [brand=" + brand + ", power=" + powerWatts + "W, steamEnabled=" + steamEnabled + "]";
    }

        @Override
        public int hashCode(){
            return 7887;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ElectricIron) {
            ElectricIron other = (ElectricIron) obj;
            return this.brand.equals(other.brand) && this.powerWatts==other.powerWatts;
        }
        return false;
    }
    }


