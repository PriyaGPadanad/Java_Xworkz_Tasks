package com.xworkz.string.internal;

public class IronBox {
    private String type;
    private int wattage;
    private boolean isSteamEnabled;

    public IronBox(String type, int wattage, boolean isSteamEnabled) {
        this.type = type;
        this.wattage = wattage;
        this.isSteamEnabled = isSteamEnabled;
    }

    @Override
    public String toString() {
        return "IronBox [type=" + type + ", wattage=" + wattage + "W, steamEnabled=" + isSteamEnabled + "]";
    }

        @Override
        public int hashCode(){
            return 5543432;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IronBox) {
            IronBox other = (IronBox) obj;
            return this.type.equals(other.type) &&
                    this.wattage== other.wattage;
        }
        return false;
    }
}



