package com.xworkz.string.internal;

public class Microphone {
    private String type;
    private boolean isUSB;
    private String brand;

    public Microphone(String type, boolean isUSB, String brand) {
        this.type = type;
        this.isUSB = isUSB;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Microphone [type=" + type + ", USB=" + isUSB + ", brand=" + brand + "]";
    }

        @Override
        public int hashCode(){
            return 24573;
        }

        @Override
    public boolean equals(Object obj){
        if(obj instanceof Microphone){
            Microphone other=(Microphone)obj;
            return this.type.equals(other.type) && this.brand.equals(other.brand) && this.isUSB==other.isUSB;
        }
        return false;
        }
    }


