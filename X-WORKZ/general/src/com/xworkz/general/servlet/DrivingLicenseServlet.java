package com.xworkz.general.servlet;

import com.xworkz.general.dto.DrivingLicenseDTO;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/license")
public class DrivingLicenseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DrivingLicenseDTO dto = new DrivingLicenseDTO();
        dto.setName(req.getParameter("name"));
        dto.setAddress(req.getParameter("address"));
        dto.setMobile(req.getParameter("mobile"));
        dto.setAppliedDate(req.getParameter("appliedDate"));
        dto.setVehicleType(req.getParameter("vehicleType"));

        req.setAttribute("dto", dto);
        req.getRequestDispatcher("drivingLicenseResult.jsp").forward(req, resp);
    }
}
