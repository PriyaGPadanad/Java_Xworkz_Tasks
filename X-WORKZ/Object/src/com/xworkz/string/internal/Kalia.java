package com.xworkz.string.internal;

public class Kalia {
    private String rival;
    private int egoLevel;
    private boolean isScaredOfBheem;

    public Kalia(String rival, int egoLevel, boolean isScaredOfBheem) {
        this.rival = rival;
        this.egoLevel = egoLevel;
        this.isScaredOfBheem = isScaredOfBheem;
    }

    @Override
    public String toString() {
        return "Kalia [rival=" + rival + ", egoLevel=" + egoLevel + ", isScaredOfBheem=" + isScaredOfBheem + "]";
    }


        @Override
        public int hashCode(){
            return 96432;
        }
        @Override
    public boolean equals(Object obj){
        if(obj instanceof Kalia){
            Kalia other=(Kalia)obj;
            return this.rival.equals(other.rival) && this.egoLevel==(other.egoLevel);
        }
        return false;
        }

    }


