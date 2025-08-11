package com.xworkz.string.internal;

public class USBDrive {
    private String brand;
    private int storageGB;
    private boolean isUSB3;

    public USBDrive(String brand, int storageGB, boolean isUSB3) {
        this.brand = brand;
        this.storageGB = storageGB;
        this.isUSB3 = isUSB3;
    }

    @Override
    public String toString() {
        return "USBDrive [brand=" + brand + ", storage=" + storageGB + "GB, USB3=" + isUSB3 + "]";
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
            return 246;
        }

    }

}
