package com.xworkz.student.servlet;

import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.repository.StudentRepository;
import com.xworkz.student.repository.StudentRepositoryImpl;
import com.xworkz.student.service.StudentService;
import com.xworkz.student.service.StudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class StudentServlet extends HttpServlet {
public StudentServlet(){
    System.out.println("no-arg constructor");
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int studentId=Integer.parseInt(req.getParameter("studentId"));
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String phoneNumber=req.getParameter("phoneNumber");
        String gender=req.getParameter("gender");
        String course=req.getParameter("course");
        String department=req.getParameter("department");
        int year=Integer.parseInt(req.getParameter("year"));

        StudentDTO studentDTO=new StudentDTO(studentId,name,email,phoneNumber,gender,course,department,year);
        System.out.println(studentDTO);

        StudentService studentService=new StudentServiceImpl();
        String result=studentService.validate(studentDTO);
        req.setAttribute("message",result);

        if(!result.equals("details saved successfully")){
            req.setAttribute("dto",studentDTO);
        }
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("student.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        StudentRepository studentRepository=new StudentRepositoryImpl();
        List<StudentDTO> studentList= studentRepository.getData();
        out.println("<html><body>");
        out.println("<h2>Student List</h2>");

        if(studentList!=null && !studentList.isEmpty()){
            out.println("<table border='1'>");
            out.println("<tr><th>StudentId</th><th>Name</th><th>Email</th><th>Phone Number</th><th>Gender</th><th>Course</th><th>Department</th><th>Year</th></tr>");

            for(StudentDTO student:studentList){
                out.println("<tr>");
                out.println("<td>"+student.getStudentId()+"</td>");
                out.println("<td>"+student.getName()+"</td>");
                out.println("<td>"+student.getEmail()+"</td>");
                out.println("<td>"+student.getPhoneNumber()+"</td>");
                out.println("<td>"+student.getGender()+"</td>");
                out.println("<td"+student.getCourse()+"</td>");
                out.println("<td>"+student.getDepartment()+"</td>");
                out.println("<td>"+student.getCourse()+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        }else{
            out.println("<p>No Student details found in the database.</p>");
        }
        out.println("</body></html>");
        out.close();
    }
}
