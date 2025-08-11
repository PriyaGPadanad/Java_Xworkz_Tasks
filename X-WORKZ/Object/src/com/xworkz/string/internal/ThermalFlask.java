package com.xworkz.string.internal;

public class ThermalFlask {
    private String brand;
    private int volume;
    private boolean retainsHeat;

    public ThermalFlask(String brand, int volume, boolean retainsHeat) {
        this.brand = brand;
        this.volume = volume;
        this.retainsHeat = retainsHeat;
    }

    @Override
    public String toString() {
        return "ThermalFlask [brand=" + brand + ", volume=" + volume + "ml, retainsHeat=" + retainsHeat + "]";
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
            return 98765412;
        }

    }

}
