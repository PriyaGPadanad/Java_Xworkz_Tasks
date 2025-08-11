package com.xworkz.priya.servlet;

import com.xworkz.priya.dto.PriyaDTO;
import com.xworkz.priya.service.PriyaService;
import com.xworkz.priya.service.PriyaServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/priyas",loadOnStartup = 2)
public class PriyaServlet extends HttpServlet {
    public PriyaServlet(){
        System.out.println("no-arg constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        String phoneNumber=req.getParameter("phoneNumber");
        String email=req.getParameter("email");
        String address=req.getParameter("address");


        PriyaDTO priyaDTO=new PriyaDTO(name,age,phoneNumber,email,address);
        System.out.println("name="+name+"age="+age+"phoneNumber="+phoneNumber+"email="+email+"address="+address);
        System.out.println(priyaDTO);
        PriyaService priyaService=new PriyaServiceImpl();
      String Result=  priyaService.Validate(priyaDTO);
        System.out.println(Result);
//    req.setAttribute("dto",priyaDTO);
//
//        RequestDispatcher requestDispatcher= req.getRequestDispatcher("priyaResult.jsp");
//        requestDispatcher.forward(req,resp);




    }
}
