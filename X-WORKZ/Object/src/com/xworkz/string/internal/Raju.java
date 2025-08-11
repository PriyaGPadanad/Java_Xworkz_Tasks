package com.xworkz.string.internal;

public class Raju {
    private int age;
    private String weapon;
    private boolean wearsDiaper;

    public Raju(int age, String weapon, boolean wearsDiaper) {
        this.age = age;
        this.weapon = weapon;
        this.wearsDiaper = wearsDiaper;
    }

    @Override
    public String toString() {
        return "Raju [age=" + age + ", weapon=" + weapon + ", wearsDiaper=" + wearsDiaper + "]";
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
            return 4678;
        }

    }

}
