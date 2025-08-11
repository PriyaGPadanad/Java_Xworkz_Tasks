package com.xworkz.inherit.internal.media;

public class Newspaper extends Media{
    public Newspaper(){
        super();
        System.out.println("Running non-arg constructor Newspaper");
    }
    @Override
    public void publish(){
        System.out.println("publishing daily newspaper");
    }
    @Override
    public void distribute(){
        System.out.println("Delivering newspapers early morning");
    }
    @Override
    public void display() {
        System.out.println("Printing news articles and headlines--child");
    }

    @Override
    public void update() {
        System.out.println("News updated daily--child");
    }

    @Override
    public void archive() {
        System.out.println("Newspapers archived physically/digitally--child");
    }

    public void printHeadlines() {
        System.out.println("New method printHeadlines in child class");
    }
}
