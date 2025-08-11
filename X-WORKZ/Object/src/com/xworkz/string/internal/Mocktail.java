package com.xworkz.string.internal;

public class Mocktail {
    private String name;
    private String baseIngredient;
    private boolean isIced;

    public Mocktail(String name, String baseIngredient, boolean isIced) {
        this.name = name;
        this.baseIngredient = baseIngredient;
        this.isIced = isIced;
    }

    @Override
    public String toString() {
        return "Mocktail [name=" + name + ", baseIngredient=" + baseIngredient + ", isIced=" + isIced + "]";
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
            return 96234;
        }

    }

}
