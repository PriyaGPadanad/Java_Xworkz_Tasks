package com.xworkz.rain.internal;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@Component

public class Parota {
    public Parota() {

        System.out.println("Running Parota in Spring ");
    }
}
