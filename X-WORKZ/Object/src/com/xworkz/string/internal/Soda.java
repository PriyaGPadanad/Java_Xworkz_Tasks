package com.xworkz.string.internal;

public class Soda {
    private String brand;
    private String flavor;
    private int volumeInMl;

    public Soda(String brand, String flavor, int volumeInMl) {
        this.brand = brand;
        this.flavor = flavor;
        this.volumeInMl = volumeInMl;
    }

    @Override
    public String toString() {
        return "Soda [brand=" + brand + ", flavor=" + flavor + ", volume=" + volumeInMl + "ml]";
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
            return 76546;
        }

    }

}
