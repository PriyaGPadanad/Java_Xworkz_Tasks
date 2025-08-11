package com.xworkz.inherit.internal.emotion;

public class Therapist {
    public void analyze(Emotion emotion) {
        emotion.express();
        emotion.affectMood();
        emotion.reflectInSpeech();
        emotion.varyInIntensity();

        if (emotion instanceof Gratitude) {
            System.out.println("emotion is an instance of Gratitude");
            Gratitude gratitude = (Gratitude) emotion;
            gratitude.writeThankYouNote();
        }
    }
}
