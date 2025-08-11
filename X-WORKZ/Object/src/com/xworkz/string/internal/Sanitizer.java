package com.xworkz.string.internal;

public class Sanitizer {
    private String brand;
    private int volumeML;
    private boolean alcoholBased;

    public Sanitizer(String brand, int volumeML, boolean alcoholBased) {
        this.brand = brand;
        this.volumeML = volumeML;
        this.alcoholBased = alcoholBased;
    }



    @Override
    public String toString() {
        return "HandSanitizer [brand=" + brand + ", volume=" + volumeML + "ml, alcoholBased=" + alcoholBased + "]";
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
            return 9854;
        }

    }


}
