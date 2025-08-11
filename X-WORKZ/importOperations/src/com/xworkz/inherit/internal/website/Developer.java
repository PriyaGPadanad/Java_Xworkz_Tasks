package com.xworkz.inherit.internal.website;

public class Developer {
    public void debug(Website website) {
        website.loadContent();
        website.navigate();
        website.displayAds();
        website.updateContent();
        website.userAccess();

        if (website instanceof EcommerceSite) {
            System.out.println("website is an instance of EcommerceSite");
            EcommerceSite ecommerce = (EcommerceSite) website;
            ecommerce.checkout();
        }
    }
}
