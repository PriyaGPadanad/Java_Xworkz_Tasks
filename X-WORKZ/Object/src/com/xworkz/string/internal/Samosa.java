package com.xworkz.string.internal;

public class Samosa {
    private String fillingType;
    private int calories;
    private boolean isSpicy;

    public Samosa(String fillingType, int calories, boolean isSpicy) {
        this.fillingType = fillingType;
        this.calories = calories;
        this.isSpicy = isSpicy;
    }

    @Override
    public String toString() {
        return "Samosa [fillingType=" + fillingType + ", calories=" + calories + ", isSpicy=" + isSpicy + "]";
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
            return 3457;
        }

    }

}
