package com.xworkz.inherit.internal.art;

public class StreetArt extends Art {
    public StreetArt() {
        super();
        System.out.println("Running non-arg constructor StreetArt");
    }

    @Override
    public void create() {
        System.out.println("Street art is created on public walls--child");
    }

    @Override
    public void expressEmotion() {
        System.out.println("Street art boldly expresses social emotion--child");
    }

    @Override
    public void useMedium() {
        System.out.println("Street art uses spray paints and stencils--child");
    }

    @Override
    public void gainAudience() {
        System.out.println("Street art catches attention from the public--child");
    }

    @Override
    public void conveyMessage() {
        System.out.println("Street art conveys social and political messages--child");
    }

    public void collaborateWithCommunity() {
        System.out.println("new method collaborateWithCommunity in child class");
    }
}
