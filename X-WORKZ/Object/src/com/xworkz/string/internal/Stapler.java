package com.xworkz.string.internal;

public class Stapler {
    private String brand;
    private int stapleCapacity;
    private boolean isHeavyDuty;

    public Stapler(String brand, int stapleCapacity, boolean isHeavyDuty) {
        this.brand = brand;
        this.stapleCapacity = stapleCapacity;
        this.isHeavyDuty = isHeavyDuty;
    }

    @Override
    public String toString() {
        return "Stapler [brand=" + brand + ", capacity=" + stapleCapacity + ", heavyDuty=" + isHeavyDuty + "]";
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
            return 99;
        }

    }

}
