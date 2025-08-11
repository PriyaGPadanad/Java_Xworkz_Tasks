package com.xworkz.string.internal;

public class Dustbin {
    private int capacity;
    private boolean hasLid;
    private String color;

    public Dustbin(int capacity, boolean hasLid, String color) {
        this.capacity = capacity;
        this.hasLid = hasLid;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dustbin [capacity=" + capacity + "L, lid=" + hasLid + ", color=" + color + "]";
    }

        @Override
        public int hashCode(){
            return 8906;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Dustbin) {
                Dustbin other = (Dustbin) obj;
                return this.color.equals(other.color) && this.hasLid==other.hasLid;
            }
            return false;
        }

    }


