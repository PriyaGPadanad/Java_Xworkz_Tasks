package com.xworkz.string.internal;

public class WaterBottle {
    private String material;
    private int capacity;
    private boolean isInsulated;

    public WaterBottle(String material, int capacity, boolean isInsulated) {
        this.material = material;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "WaterBottle [material=" + material + ", capacity=" + capacity + "ml, insulated=" + isInsulated + "]";
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
            return 1334;
        }

    }

}
