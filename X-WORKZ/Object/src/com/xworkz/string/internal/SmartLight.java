package com.xworkz.string.internal;

public class SmartLight {
    private String brand;
    private boolean colorChange;
    private boolean appControl;

    public SmartLight(String brand, boolean colorChange, boolean appControl) {
        this.brand = brand;
        this.colorChange = colorChange;
        this.appControl = appControl;
    }

    @Override
    public String toString() {
        return "SmartLight [brand=" + brand + ", colorChange=" + colorChange + ", appControl=" + appControl + "]";
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
            return 6796;
        }

    }

}
