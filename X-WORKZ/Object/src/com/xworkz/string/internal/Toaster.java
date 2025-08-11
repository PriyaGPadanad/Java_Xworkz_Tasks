package com.xworkz.string.internal;

public abstract class Toaster {
    private String brand;
    private int sliceCapacity;
    private boolean defrostMode;

    public Toaster(String brand, int sliceCapacity, boolean defrostMode) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.defrostMode = defrostMode;
    }

    @Override
    public String toString() {
        return "Toaster [brand=" + brand + ", sliceCapacity=" + sliceCapacity + ", defrostMode=" + defrostMode + "]";
    }

    public abstract void toast();
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
            return 76543;
        }

    }

}
