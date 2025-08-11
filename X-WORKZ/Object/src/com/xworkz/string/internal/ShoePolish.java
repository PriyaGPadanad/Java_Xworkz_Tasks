package com.xworkz.string.internal;

public class ShoePolish {
    private String color;
    private String brand;
    private boolean isLiquid;

    public ShoePolish(String color, String brand, boolean isLiquid) {
        this.color = color;
        this.brand = brand;
        this.isLiquid = isLiquid;
    }

    @Override
    public String toString() {
        return "ShoePolish [color=" + color + ", brand=" + brand + ", liquid=" + isLiquid + "]";
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
            return 9609;
        }

    }

}
