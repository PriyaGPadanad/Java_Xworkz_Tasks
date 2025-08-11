package com.xworkz.string.internal;

public class Headphones {
    private String type;
    private boolean isWireless;
    private String color;

    public Headphones(String type, boolean isWireless, String color) {
        this.type = type;
        this.isWireless = isWireless;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Headphones [type=" + type + ", wireless=" + isWireless + ", color=" + color + "]";
    }

        @Override
        public int hashCode(){
            return 7676;
        }

        @Override
    public boolean equals(Object obj){
        if(obj instanceof Headphones){
            Headphones other=(Headphones)obj;
            return this.type.equals(other.type)&& this.color.equals(other.color);
        }
        return false;
    }
}


