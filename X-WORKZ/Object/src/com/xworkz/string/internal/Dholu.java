package com.xworkz.string.internal;

public class Dholu {
    private String twinName;
    private boolean followsKalia;
    private int comedyLevel;

    public Dholu(String twinName, boolean followsKalia, int comedyLevel) {
        this.twinName = twinName;
        this.followsKalia = followsKalia;
        this.comedyLevel = comedyLevel;
    }

    @Override
    public String toString() {
        return "Dholu [twinName=" + twinName + ", followsKalia=" + followsKalia + ", comedyLevel=" + comedyLevel + "]";
    }

        @Override
        public int hashCode(){
            return 75656;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dholu) {
            Dholu other = (Dholu) obj;
            return this.twinName.equals(other.twinName);
        }
        return false;
    }

}


