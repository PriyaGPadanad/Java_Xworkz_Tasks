package com.xworkz.string.internal;

public class SmartPlug {
    private String brand;
    private int maxLoad;
    private boolean voiceControl;

    public SmartPlug(String brand, int maxLoad, boolean voiceControl) {
        this.brand = brand;
        this.maxLoad = maxLoad;
        this.voiceControl = voiceControl;
    }

    @Override
    public String toString() {
        return "SmartPlug [brand=" + brand + ", maxLoad=" + maxLoad + "W, voiceControl=" + voiceControl + "]";
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
            return 7569;
        }

    }

}
