package com.xworkz.string.internal;

public class Tripod {
    private int height;
    private String material;
    private boolean isFlexible;

    public Tripod(int height, String material, boolean isFlexible) {
        this.height = height;
        this.material = material;
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "Tripod [height=" + height + "cm, material=" + material + ", flexible=" + isFlexible + "]";
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
            return 456;
        }

    }

}
