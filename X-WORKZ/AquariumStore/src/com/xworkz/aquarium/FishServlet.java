package com.xworkz.aquarium;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fish")
public class FishServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String color = req.getParameter("color");
        String lifeSpan = req.getParameter("lifeSpan");
        String cost = req.getParameter("cost");
        String type = req.getParameter("type");
        String size = req.getParameter("size");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.write("<h2>Fish Data Submitted Successfully!</h2>");
        writer.write("<p>Name: " + name + "</p>");
        writer.write("<p>Color: " + color + "</p>");
        writer.write("<p>Life Span: " + lifeSpan + "</p>");
        writer.write("<p>Cost: " + cost + "</p>");
        writer.write("<p>Type: " + type + "</p>");
        writer.write("<p>Size: " + size + "</p>");
    }
}
