package com.xworkz.aquarium;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/plant")
public class PlantServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String cost = req.getParameter("cost");
        String type = req.getParameter("type");
        String soilType = req.getParameter("soilType");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.write("<h2>Plant Data Submitted Successfully!</h2>");
        writer.write("<p>Name: " + name + "</p>");
        writer.write("<p>Cost: " + cost + "</p>");
        writer.write("<p>Type: " + type + "</p>");
        writer.write("<p>Soil Type: " + soilType + "</p>");
    }
}

