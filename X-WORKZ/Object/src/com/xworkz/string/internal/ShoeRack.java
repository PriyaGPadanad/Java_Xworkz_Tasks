package com.xworkz.string.internal;

public class ShoeRack {
    private int shelves;
    private String material;
    private boolean hasCover;

    public ShoeRack(int shelves, String material, boolean hasCover) {
        this.shelves = shelves;
        this.material = material;
        this.hasCover = hasCover;
    }

    @Override
    public String toString() {
        return "ShoeRack [shelves=" + shelves + ", material=" + material + ", cover=" + hasCover + "]";
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
            return 9546;
        }

    }

}
