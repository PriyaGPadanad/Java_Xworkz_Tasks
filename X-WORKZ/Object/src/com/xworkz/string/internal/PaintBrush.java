package com.xworkz.string.internal;

public class PaintBrush {
    private String size;
    private String material;
    private boolean isSynthetic;

    public PaintBrush(String size, String material, boolean isSynthetic) {
        this.size = size;
        this.material = material;
        this.isSynthetic = isSynthetic;
    }

    @Override
    public String toString() {
        return "PaintBrush [size=" + size + ", material=" + material + ", synthetic=" + isSynthetic + "]";
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
            return 4564;
        }

    }

}
