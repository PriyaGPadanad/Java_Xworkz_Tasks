package com.xworkz.string.internal;

public class WirelessCharger {
    private String brand;
    private int wattage;
    private boolean isFastCharge;

    public WirelessCharger(String brand, int wattage, boolean isFastCharge) {
        this.brand = brand;
        this.wattage = wattage;
        this.isFastCharge = isFastCharge;
    }

    @Override
    public String toString() {
        return "WirelessCharger [brand=" + brand + ", wattage=" + wattage + "W, fastCharge=" + isFastCharge + "]";
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
            return 9845;
        }

    }

}
