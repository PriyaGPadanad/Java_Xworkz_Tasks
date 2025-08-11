package com.xworkz.string.internal;

public class StickyNotes {
    private String color;
    private int numberOfSheets;
    private boolean isLined;

    public StickyNotes(String color, int numberOfSheets, boolean isLined) {
        this.color = color;
        this.numberOfSheets = numberOfSheets;
        this.isLined = isLined;
    }

    @Override
    public String toString() {
        return "StickyNotes [color=" + color + ", numberOfSheets=" + numberOfSheets + ", isLined=" + isLined + "]";
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
            return 976;
        }

    }

}
