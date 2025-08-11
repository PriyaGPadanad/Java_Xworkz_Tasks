package com.xworkz.string.internal;

public class Milkshake {
    private String flavor;
    private String size;         // Small, Medium, Large
    private boolean hasWhippedCream;

    public Milkshake(String flavor, String size, boolean hasWhippedCream) {
        this.flavor = flavor;
        this.size = size;
        this.hasWhippedCream = hasWhippedCream;
    }

    @Override
    public String toString() {
        return "Milkshake [flavor=" + flavor + ", size=" + size + ", hasWhippedCream=" + hasWhippedCream + "]";
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
            return 9643;
        }

    }

}
