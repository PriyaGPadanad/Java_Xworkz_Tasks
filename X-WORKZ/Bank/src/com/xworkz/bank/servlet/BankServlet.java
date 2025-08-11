package com.xworkz.bank.servlet;

import com.xworkz.bank.dto.BankDTO;
import com.xworkz.bank.service.BankService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/bank")
public class BankServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
       String accno= req.getParameter("accno");


        System.out.println("bankDTO"+name);
        System.out.println("accno"+accno);


    }

}
