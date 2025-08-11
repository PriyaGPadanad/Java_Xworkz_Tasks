package com.xworkz.inherit.internal.emotion;

public class EmotionRunner {
    public static void main(String[] args) {
        Emotion e1 = new Emotion();
        e1.express();
        e1.affectMood();
        e1.reflectInSpeech();
        e1.varyInIntensity();

        System.out.println("-------------------");
        Emotion e = new Gratitude();
        e.express();
        e.affectMood();
        e.reflectInSpeech();
        e.varyInIntensity();

        System.out.println("-----------------");
        Gratitude gratitude = new Gratitude();
        gratitude.express();
        gratitude.affectMood();
        gratitude.influenceBehavior();
        gratitude.reflectInSpeech();
        gratitude.varyInIntensity();

        System.out.println("-------casting example------------");
        Therapist therapist = new Therapist();
        therapist.analyze(e1);
        therapist.analyze(e);
        therapist.analyze(gratitude);
    }
}
