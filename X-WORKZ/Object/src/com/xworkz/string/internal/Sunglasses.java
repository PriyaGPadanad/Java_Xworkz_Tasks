package com.xworkz.string.internal;

public class Sunglasses {
    private String frameColor;
    private boolean isPolarized;
    private String lensType;

    public Sunglasses(String frameColor, boolean isPolarized, String lensType) {
        this.frameColor = frameColor;
        this.isPolarized = isPolarized;
        this.lensType = lensType;
    }

    @Override
    public String toString() {
        return "Sunglasses [frameColor=" + frameColor + ", polarized=" + isPolarized + ", lensType=" + lensType + "]";
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
            return 324567;
        }

    }

}
