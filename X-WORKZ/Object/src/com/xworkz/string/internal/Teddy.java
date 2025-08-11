package com.xworkz.string.internal;

public class Teddy {
    private String color;
    private int softnessLevel;
    private boolean isGifted;

    public Teddy(String color, int softnessLevel, boolean isGifted) {
        this.color = color;
        this.softnessLevel = softnessLevel;
        this.isGifted = isGifted;
    }

    @Override
    public String toString() {
        return "Teddy [color=" + color + ", softnessLevel=" + softnessLevel + ", isGifted=" + isGifted + "]";
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
            return 976546;
        }

    }

}
