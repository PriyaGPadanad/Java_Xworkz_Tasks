package com.xworkz.string.internal;

public class Cartoon {
    private String name;
    private String channel;
    private boolean isForKids;

    public Cartoon(String name, String channel, boolean isForKids) {
        this.name = name;
        this.channel = channel;
        this.isForKids = isForKids;
    }

    @Override
    public String toString() {
        return "Cartoon [name=" + name + ", channel=" + channel + ", isForKids=" + isForKids + "]";
    }

        @Override
        public int hashCode(){
            return 8765;
        }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cartoon) {
            Cartoon other = (Cartoon) obj;
            return this.channel.equals(other.channel);
        }
        return false;
    }

    }


