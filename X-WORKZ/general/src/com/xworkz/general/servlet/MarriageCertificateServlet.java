package com.xworkz.general.servlet;

import com.xworkz.general.dto.MarriageCertificateDTO;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/marriage")
public class MarriageCertificateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MarriageCertificateDTO dto = new MarriageCertificateDTO();
        dto.setGroomName(req.getParameter("groomName"));
        dto.setBrideName(req.getParameter("brideName"));
        dto.setLocation(req.getParameter("location"));
        dto.setAddress(req.getParameter("address"));
        dto.setReligion(req.getParameter("religion"));
        dto.setDate(req.getParameter("date"));
        dto.setWitness1(req.getParameter("witness1"));
        dto.setWitness2(req.getParameter("witness2"));
        dto.setOfficerPresent(req.getParameter("officerPresent"));

        req.setAttribute("dto", dto);
        req.getRequestDispatcher("marriageCertificateResult.jsp").forward(req, resp);
    }
}

