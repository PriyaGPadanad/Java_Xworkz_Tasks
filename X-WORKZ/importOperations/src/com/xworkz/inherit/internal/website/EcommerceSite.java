package com.xworkz.inherit.internal.website;

public class EcommerceSite extends Website{
    public EcommerceSite() {
        super();
        System.out.println("Running non-arg constructor EcommerceSite");
    }

    @Override
    public void loadContent() {
        System.out.println("Loading products and deals--child");
    }

    @Override
    public void navigate() {
        System.out.println("Users can browse categories--child");
    }

    @Override
    public void displayAds() {
        System.out.println("Showing recommended items and offers--child");
    }

    @Override
    public void updateContent() {
        System.out.println("Stock and prices updated regularly--child");
    }

    @Override
    public void userAccess() {
        System.out.println("User logs in to place orders--child");
    }

    public void checkout() {
        System.out.println("New method checkout in child class");
    }
}
