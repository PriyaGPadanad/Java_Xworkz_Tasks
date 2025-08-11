package com.xworkz.aquarium;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/aquarium")
public class AquariumServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String model = req.getParameter("model");
        String cost = req.getParameter("cost");
        String size = req.getParameter("size");
        String company = req.getParameter("company");
        String capacity = req.getParameter("capacity");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.write("<h2>Aquarium Data Submitted Successfully!</h2>");
        writer.write("<p>Model: " + model + "</p>");
        writer.write("<p>Cost: " + cost + "</p>");
        writer.write("<p>Size: " + size + "</p>");
        writer.write("<p>Company: " + company + "</p>");
        writer.write("<p>Capacity: " + capacity + "</p>");
    }
}
