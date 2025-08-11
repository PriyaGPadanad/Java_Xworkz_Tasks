package com.xworkz.medical.servlet;

import com.xworkz.medical.dto.MedicalDTO;
import com.xworkz.medical.repository.MedicalRepository;
import com.xworkz.medical.repository.MedicalRepositoryImpl;
import com.xworkz.medical.service.MedicalService;
import com.xworkz.medical.service.MedicalServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/medical",loadOnStartup = 1)
public class MedicalServlet extends HttpServlet {
    public MedicalServlet(){
        System.out.println("no-arg constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        int age = Integer.parseInt(req.getParameter("age"));
        String gender=req.getParameter("gender");
        String contactNumber=req.getParameter("contactNumber");
        String consultationMode=req.getParameter("consultationMode");


        MedicalDTO medicalDTO=new MedicalDTO(name,email,age,gender,contactNumber,consultationMode);
        System.out.println(medicalDTO);

        MedicalService medicalService=new MedicalServiceImpl();
        String result=medicalService.validate(medicalDTO);
        req.setAttribute("message",result);

        if(!result.equals("details saved successfully")){
            req.setAttribute("dto " , medicalDTO);
        }

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("consultation.jsp");
        requestDispatcher.forward(req,resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        MedicalRepository repository = new MedicalRepositoryImpl();
        MedicalDTO dto = repository.getdata();
        

        if (dto != null) {
            out.println("<p><b>Name:</b> " + dto.getName() + "</p>");
            out.println("<p><b>Email:</b> " + dto.getEmail() + "</p>");
            out.println("<p><b>Age:</b> " + dto.getAge() + "</p>");
            out.println("<p><b>Gender:</b> " + dto.getGender() + "</p>");
            out.println("<p><b>Contact Number:</b> " + dto.getContactNumber() + "</p>");
            out.println("<p><b>Consultation Mode:</b> " + dto.getConsultationMode() + "</p>");
        } else {
            out.println("<p>No consultation details found in the database.</p>");
        }
    }


}

