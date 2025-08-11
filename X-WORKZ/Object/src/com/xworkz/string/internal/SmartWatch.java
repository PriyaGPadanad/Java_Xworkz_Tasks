package com.xworkz.string.internal;

public class SmartWatch {
    private String brand;
    private boolean gps;
    private int batteryLife;

    public SmartWatch(String brand, boolean gps, int batteryLife) {
        this.brand = brand;
        this.gps = gps;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "SmartWatch [brand=" + brand + ", GPS=" + gps + ", battery=" + batteryLife + "h]";
    }
    package com.xworkz.string.internal;

    public class AlarmClock {
        private String type;
        private boolean snooze;
        private boolean batteryBackup;

        public AlarmClock(String type, boolean snooze, boolean batteryBackup) {
            this.type = type;
            this.snooze = snooze;
            this.batteryBackup = batteryBackup;
        }

        @Override
        public String toString() {
            return "AlarmClock [type=" + type + ", snooze=" + snooze + ", batteryBackup=" + batteryBackup + "]";


        }
        @Override
        public int hashCode(){
            return 96541;
        }

    }

}
