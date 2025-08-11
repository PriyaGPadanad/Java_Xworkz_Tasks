package com.xworkz.general.servlet;

        import com.xworkz.general.dto.JobApplicationDTO;

        import javax.servlet.*;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.*;
        import java.io.IOException;

@WebServlet("/job")
public class JobApplicationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JobApplicationDTO dto = new JobApplicationDTO();
        dto.setName(req.getParameter("name"));
        dto.setEmail(req.getParameter("email"));
        dto.setEducation(req.getParameter("education"));
        dto.setSkills(req.getParameter("skills"));
        dto.setSalary(req.getParameter("salary"));
        dto.setExperience(req.getParameter("experience"));

        req.setAttribute("dto", dto);
        req.getRequestDispatcher("jobApplicationResult.jsp").forward(req, resp);


    }
}

