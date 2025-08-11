package com.xworkz.string.internal;

public class AlarmClocks {
    private String type;
    private boolean snooze;
    private boolean batteryBackup;

    public AlarmClocks(String type, boolean snooze, boolean batteryBackup) {
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
        return 966;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlarmClocks) {
            AlarmClocks other = (AlarmClocks) obj;
            return this.type.equals(other.type);
        }
        return false;
    }
}


