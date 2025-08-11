package com.xworkz.string.internal;

public class RoomHeater {
    private String type;
    private int power;
    private boolean remote;

    public RoomHeater(String type, int power, boolean remote) {
        this.type = type;
        this.power = power;
        this.remote = remote;
    }

    @Override
    public String toString() {
        return "RoomHeater [type=" + type + ", power=" + power + "W, remote=" + remote + "]";
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
            return 245;
        }

    }

}
