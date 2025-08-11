package com.xworkz.string.internal;

public class Phoenix {
    private String name;
    private int rebirthCycle;
    private boolean glowsInDark;

    public Phoenix(String name, int rebirthCycle, boolean glowsInDark) {
        this.name = name;
        this.rebirthCycle = rebirthCycle;
        this.glowsInDark = glowsInDark;
    }

    @Override
    public String toString() {
        return "Phoenix [name=" + name + ", rebirthCycle=" + rebirthCycle + ", glowsInDark=" + glowsInDark + "]";
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
            return 56457;
        }

    }

}
