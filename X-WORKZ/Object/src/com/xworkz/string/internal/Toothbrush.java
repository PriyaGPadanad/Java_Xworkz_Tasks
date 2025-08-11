package com.xworkz.string.internal;

public class Toothbrush {
    private String brand;
    private boolean isElectric;
    private String color;

    public Toothbrush(String brand, boolean isElectric, String color) {
        this.brand = brand;
        this.isElectric = isElectric;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Toothbrush [brand=" + brand + ", electric=" + isElectric + ", color=" + color + "]";
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
            return 108;
        }

    }

}
