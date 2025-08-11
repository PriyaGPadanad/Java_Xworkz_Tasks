package com.xworkz.string.internal;

public class Unicorn {
    private String name;
    private String color;
    private boolean hasMagicHorn;

    public Unicorn(String name, String color, boolean hasMagicHorn) {
        this.name = name;
        this.color = color;
        this.hasMagicHorn = hasMagicHorn;
    }

    @Override
    public String toString() {
        return "Unicorn [name=" + name + ", color=" + color + ", magicHorn=" + hasMagicHorn + "]";
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
            return 4547;
        }

    }

}
