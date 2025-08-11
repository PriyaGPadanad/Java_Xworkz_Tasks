package com.xworkz.inherit.internal.website;

public class WebsiteRunner {
    public static void main(String[] args) {
        Website web1 = new Website();
        web1.loadContent();
        web1.navigate();
        web1.displayAds();
        web1.updateContent();
        web1.userAccess();

        System.out.println("-------------------");
        Website web = new EcommerceSite();
        web.loadContent();
        web.navigate();
        web.displayAds();
        web.updateContent();
        web.userAccess();

        System.out.println("-----------------");
        EcommerceSite ecommerce = new EcommerceSite();
        ecommerce.loadContent();
        ecommerce.navigate();
        ecommerce.displayAds();
        ecommerce.updateContent();
        ecommerce.userAccess();

        System.out.println("-------casting example------------");
        Developer dev = new Developer();
        dev.debug(web1);
        dev.debug(web);
        dev.debug(ecommerce);
    }
}
