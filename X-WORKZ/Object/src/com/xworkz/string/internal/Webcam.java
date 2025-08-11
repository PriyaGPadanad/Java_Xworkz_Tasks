package com.xworkz.string.internal;

public class Webcam {
    private String resolution;
    private boolean hasMicrophone;
    private String brand;

    public Webcam(String resolution, boolean hasMicrophone, String brand) {
        this.resolution = resolution;
        this.hasMicrophone = hasMicrophone;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Webcam [resolution=" + resolution + ", mic=" + hasMicrophone + ", brand=" + brand + "]";
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
            return 6571;
        }

    }

}
