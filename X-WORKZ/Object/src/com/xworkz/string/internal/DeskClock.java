package com.xworkz.string.internal;

public class DeskClock {
    private String type; // analog or digital
    private String brand;
    private boolean hasAlarm;

    public DeskClock(String type, String brand, boolean hasAlarm) {
        this.type = type;
        this.brand = brand;
        this.hasAlarm = hasAlarm;
    }

    @Override
    public String toString() {
        return "DeskClock [type=" + type + ", brand=" + brand + ", hasAlarm=" + hasAlarm + "]";
    }


    @Override
    public int hashCode(){
        return 6348;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DeskClock) {
            DeskClock other = (DeskClock) obj;
            return this.type.equals(other.type);
        }
        return false;
    }


}

