package com.xworkz.string.internal;

public class MixerGrinder {
    private String brand;
    private int jars;
    private boolean hasJuicer;

    public MixerGrinder(String brand, int jars, boolean hasJuicer) {
        this.brand = brand;
        this.jars = jars;
        this.hasJuicer = hasJuicer;
    }

    @Override
    public String toString() {
        return "MixerGrinder [brand=" + brand + ", jars=" + jars + ", hasJuicer=" + hasJuicer + "]";
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
            return 2454;
        }

    }

}
