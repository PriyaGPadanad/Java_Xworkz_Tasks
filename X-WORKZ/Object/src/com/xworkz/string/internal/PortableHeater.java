package com.xworkz.string.internal;

public class PortableHeater {
    private String type;
    private int power;
    private boolean safetySwitch;

    public PortableHeater(String type, int power, boolean safetySwitch) {
        this.type = type;
        this.power = power;
        this.safetySwitch = safetySwitch;
    }

    @Override
    public String toString() {
        return "PortableHeater [type=" + type + ", power=" + power + "W, safetySwitch=" + safetySwitch + "]";
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
            return 543243;
        }

    }

}
