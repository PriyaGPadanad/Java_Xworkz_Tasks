package com.xworkz.inherit.internal.instrument;

public class InstrumentRunner {
    public static void main(String[] args) {
        instrument instrument1 = new instrument();
        instrument1.playTune();
        instrument1.adjustVolume();
        instrument1.maintain();
        instrument1.transport();
        instrument1.store();

        System.out.println("-------------------");
        instrument instrument2 = new Flute();
        instrument2.playTune();
        instrument2.adjustVolume();
        instrument2.maintain();
        instrument2.transport();
        instrument2.store();

        System.out.println("-----------------");
        Flute flute = new Flute();
        flute.playTune();
        flute.adjustVolume();
        flute.maintain();
        flute.transport();
        flute.store();

        System.out.println("-------casting example------------");
        Musician musician = new Musician();
        musician.perform(instrument1);
        musician.perform(instrument2);
        musician.perform(flute);
    }
}
