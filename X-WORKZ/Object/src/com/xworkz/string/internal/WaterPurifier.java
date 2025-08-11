package com.xworkz.string.internal;

public class WaterPurifier {
    private String model;
    private boolean uvTechnology;
    private int filterLife;

    public WaterPurifier(String model, boolean uvTechnology, int filterLife) {
        this.model = model;
        this.uvTechnology = uvTechnology;
        this.filterLife = filterLife;
    }

    @Override
    public String toString() {
        return "WaterPurifier [model=" + model + ", UV=" + uvTechnology + ", filterLife=" + filterLife + " months]";
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
            return 787653;
        }

    }

}
