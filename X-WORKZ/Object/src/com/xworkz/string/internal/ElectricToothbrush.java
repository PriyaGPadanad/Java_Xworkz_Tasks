package com.xworkz.string.internal;

public class ElectricToothbrush {
    private String brand;
    private int speedLevels;
    private boolean timer;

    public ElectricToothbrush(String brand, int speedLevels, boolean timer) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "ElectricToothbrush [brand=" + brand + ", speeds=" + speedLevels + ", timer=" + timer + "]";
    }

        @Override
        public int hashCode(){
            return 2456;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ElectricToothbrush) {
                ElectricToothbrush other = (ElectricToothbrush) obj;
                return this.brand.equals(other.brand) && this.timer==other.timer;
            }
            return false;
        }
    }


