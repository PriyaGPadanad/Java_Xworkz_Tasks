package com.xworkz.string.internal;

public class WallClock {
    private String brand;
    private boolean isDigital;
    private String shape;

    public WallClock(String brand, boolean isDigital, String shape) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "WallClock [brand=" + brand + ", digital=" + isDigital + ", shape=" + shape + "]";
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
            return 8787;
        }

    }

}
