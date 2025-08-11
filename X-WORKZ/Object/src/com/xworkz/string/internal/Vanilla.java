package com.xworkz.string.internal;

public class Vanilla {
    private String origin;
    private String form; // like extract, bean, powder
    private boolean isSweetened;

    public Vanilla(String origin, String form, boolean isSweetened) {
        this.origin = origin;
        this.form = form;
        this.isSweetened = isSweetened;
    }

    @Override
    public String toString() {
        return "Vanilla [origin=" + origin + ", form=" + form + ", isSweetened=" + isSweetened + "]";
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
            return 2344;
        }

    }

}
