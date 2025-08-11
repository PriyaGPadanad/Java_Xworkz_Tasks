package com.xworkz.inherit.internal.instrument;

public class Musician {
    public void perform(instrument instrument) {
        instrument.playTune();
        instrument.adjustVolume();
        instrument.maintain();
        instrument.transport();
        instrument.store();

        if (instrument instanceof Flute) {
            System.out.println("instrument is an instance of Flute");
            Flute flute = (Flute) instrument;
            flute.blow();
        }
    }
}
