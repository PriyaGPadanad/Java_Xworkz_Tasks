package com.xworkz.aquarium;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fishfood")
public class FishFoodServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String brand = req.getParameter("brand");
        String quantity = req.getParameter("quantity");
        String cost = req.getParameter("cost");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.write("<h2>Fish Food Data Submitted Successfully!</h2>");
        writer.write("<p>Name: " + name + "</p>");
        writer.write("<p>Brand: " + brand + "</p>");
        writer.write("<p>Quantity: " + quantity + "</p>");
        writer.write("<p>Cost: " + cost + "</p>");
    }
}

