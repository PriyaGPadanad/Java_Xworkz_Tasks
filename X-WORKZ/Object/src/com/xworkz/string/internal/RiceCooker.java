package com.xworkz.string.internal;

public class RiceCooker {
    private String brand;
    private double capacity;
    private boolean keepWarm;

    public RiceCooker(String brand, double capacity, boolean keepWarm) {
        this.brand = brand;
        this.capacity = capacity;
        this.keepWarm = keepWarm;
    }

    @Override
    public String toString() {
        return "RiceCooker [brand=" + brand + ", capacity=" + capacity + "L, keepWarm=" + keepWarm + "]";
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
            return 9686;
        }

    }

}
