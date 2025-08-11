package com.xworkz.string.internal;

public class PenStand {
    private String color;
    private int slots;
    private String shape;

    public PenStand(String color, int slots, String shape) {
        this.color = color;
        this.slots = slots;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "PenStand [color=" + color + ", slots=" + slots + ", shape=" + shape + "]";
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
            return 12435;
        }

    }

}
