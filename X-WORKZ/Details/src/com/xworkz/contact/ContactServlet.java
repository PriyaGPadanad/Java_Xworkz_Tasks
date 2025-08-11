package com.xworkz.contact;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/onion",loadOnStartup=1)
public class ContactServlet extends GenericServlet {
    public ContactServlet(){
        System.out.println("ContactServlet created by tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)throws ServletException, IOException{
        System.out.println("running service in ContactServlet");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String mobile=servletRequest.getParameter("mobile");
        String comments=servletRequest.getParameter("comments");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("contactResult.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);

    }
}
