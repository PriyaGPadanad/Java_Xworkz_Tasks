package com.xworkz.string.internal;

public class Marvel {
    private String heroName;
    private String superPower;
    private boolean isAvenger;

    public Marvel(String heroName, String superPower, boolean isAvenger) {
        this.heroName = heroName;
        this.superPower = superPower;
        this.isAvenger = isAvenger;
    }

    @Override
    public String toString() {
        return "Marvel [heroName=" + heroName + ", superPower=" + superPower + ", isAvenger=" + isAvenger + "]";
    }

        @Override
        public int hashCode(){
            return 9675;
        }

        @Override
    public boolean equals(Object obj){
        if(obj instanceof Marvel){
            Marvel other=(Marvel)obj;
            return this.heroName.equals(other.heroName) && this.isAvenger==other.isAvenger && this.superPower.equals(other.superPower);
        }
        return false;
        }

    }

