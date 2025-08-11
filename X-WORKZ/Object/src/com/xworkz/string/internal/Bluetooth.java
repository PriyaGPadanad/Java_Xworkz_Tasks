package com.xworkz.string.internal;

public class Bluetooth {
    private String version;
    private int rangeInMeters;
    private boolean supportsAudio;

    public Bluetooth(String version, int rangeInMeters, boolean supportsAudio) {
        this.version = version;
        this.rangeInMeters = rangeInMeters;
        this.supportsAudio = supportsAudio;
    }

    @Override
    public String toString() {
        return "Bluetooth [version=" + version + ", range=" + rangeInMeters + " meters, supportsAudio=" + supportsAudio + "]";
    }

        @Override
        public int hashCode(){
            return 321;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bluetooth) {
            Bluetooth other = (Bluetooth) obj;
            return this.version.equals(other.version);
        }
        return false;
    }

}


