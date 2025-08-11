package com.xworkz.brinjal.servlet;

import sun.net.www.content.text.Generic;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/land",loadOnStartup =1)
public class GunServlet extends GenericServlet {

    public GunServlet(){
        System.out.println("GunServlet created by tomcat..");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
