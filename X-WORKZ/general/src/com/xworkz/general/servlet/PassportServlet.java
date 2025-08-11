package com.xworkz.general.servlet;

import com.xworkz.general.dto.PassportDTO;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/passport")
public class PassportServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PassportDTO dto = new PassportDTO();
        dto.setApplicantName(req.getParameter("applicantName"));
        dto.setAadharNo(req.getParameter("aadharNo"));
        dto.setAddress(req.getParameter("address"));
        dto.setPanNo(req.getParameter("panNo"));
        dto.setCountry(req.getParameter("country"));
        dto.setState(req.getParameter("state"));
        dto.setCity(req.getParameter("city"));
        dto.setPinCode(req.getParameter("pinCode"));
        dto.setPassportType(req.getParameter("passportType"));
        dto.setPaymentRefNo(req.getParameter("paymentRefNo"));

        req.setAttribute("dto", dto);
        req.getRequestDispatcher("passportResult.jsp").forward(req, resp);
    }
}

