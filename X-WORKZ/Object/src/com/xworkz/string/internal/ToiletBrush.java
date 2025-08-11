package com.xworkz.string.internal;

public class ToiletBrush {
    private String bristleType;
    private String holderColor;
    private boolean hasStand;

    public ToiletBrush(String bristleType, String holderColor, boolean hasStand) {
        this.bristleType = bristleType;
        this.holderColor = holderColor;
        this.hasStand = hasStand;
    }

    @Override
    public String toString() {
        return "ToiletBrush [bristle=" + bristleType + ", holderColor=" + holderColor + ", stand=" + hasStand + "]";
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
            return 26;
        }

    }

}
