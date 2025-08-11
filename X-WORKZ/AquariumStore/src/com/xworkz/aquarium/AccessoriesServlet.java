package com.xworkz.aquarium;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/accessories")
public class AccessoriesServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String type = req.getParameter("type");
        String warranty = req.getParameter("warranty");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.write("<h2>Accessories Data Submitted Successfully!</h2>");
        writer.write("<p>Name: " + name + "</p>");
        writer.write("<p>Type: " + type + "</p>");
        writer.write("<p>Warranty: " + warranty + "</p>");
        writer.write("<p>Price: " + price + "</p>");
        writer.write("<p>Quantity: " + quantity + "</p>");
    }
}
