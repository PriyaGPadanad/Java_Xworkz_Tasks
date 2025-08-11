package com.xworkz.string.internal;

public class BluetoothSpeaker {
    private String brand;
    private int batteryHours;
    private boolean waterproof;

    public BluetoothSpeaker(String brand, int batteryHours, boolean waterproof) {
        this.brand = brand;
        this.batteryHours = batteryHours;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "BluetoothSpeaker [brand=" + brand + ", battery=" + batteryHours + "h, waterproof=" + waterproof + "]";
    }

        @Override
        public int hashCode(){
            return 2468;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BluetoothSpeaker) {
            BluetoothSpeaker other = (BluetoothSpeaker) obj;
            return this.brand.equals(other.brand);
        }
        return false;
    }

}


