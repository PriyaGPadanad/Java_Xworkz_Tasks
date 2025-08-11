package com.xworkz.inherit.internal.emotion;

public class Gratitude extends Emotion{
    public Gratitude() {
        super();
        System.out.println("Running non-arg constructor Gratitude");
    }

    @Override
    public void express() {
        System.out.println("Expressing gratitude through words and actions--child");
    }

    @Override
    public void affectMood() {
        System.out.println("Gratitude uplifts mood and increases positivity--child");
    }

    public void influenceBehavior() {
        System.out.println("Gratitude promotes helpful and kind behavior--child");
    }

    @Override
    public void reflectInSpeech() {
        System.out.println("Gratitude is often spoken with appreciation--child");
    }

    @Override
    public void varyInIntensity() {
        System.out.println("Gratitude may range from mild to deep emotional response--child");
    }

    public void writeThankYouNote() {
        System.out.println("New method writeThankYouNote in child class");
    }
}
