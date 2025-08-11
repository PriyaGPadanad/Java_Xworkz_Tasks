package com.xworkz.mobile.servlet;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.repository.MobileRepository;
import com.xworkz.mobile.repository.MobileRepositoryImpl;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/mobile",loadOnStartup=1)
public class MobileServlet extends HttpServlet {
public MobileServlet(){
    System.out.println("no-arg constructor");
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int mobileId=Integer.parseInt(req.getParameter("mobileId"));
       String brand=req.getParameter("brand");
       String model=req.getParameter("model");
       String operatingSystem=req.getParameter("operatingSystem");
       int ramSize= Integer.parseInt(req.getParameter("ramSize"));
       int storageCapacity=Integer.parseInt(req.getParameter("storageCapacity"));
       double price= Double.parseDouble(req.getParameter("price"));
       float rating=Float.parseFloat(req.getParameter("rating"));

        MobileDTO mobileDTO=new MobileDTO(mobileId,brand,model,operatingSystem,ramSize,storageCapacity,price,rating);
        System.out.println(mobileDTO);

        MobileService mobileService=new MobileServiceImpl();
        String result=mobileService.validate(mobileDTO);
        req.setAttribute("message",result);

        if(!result.equals("details saved successfully")){
            req.setAttribute("dto",mobileDTO);
        }

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("mobile.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        MobileRepository mobileRepository = new MobileRepositoryImpl();
   List <MobileDTO> mobileList = mobileRepository.getData();
        out.println("<html><body>");
        out.println("<h2>Mobile List</h2>");

        if (mobileList != null && !mobileList.isEmpty()) {
            out.println("<table border='1'>");
            out.println("<tr><th>MobileId</th><th>Brand</th><th>Model</th><th>Operating System</th><th>Ram Size</th><th>Storage Capacity</th><th>Price</th><th>Rating</th></tr>");

            for (MobileDTO mobile : mobileList) {
                out.println("<tr>");
                out.println("<td>" + mobile.getMobileId() + "</td>");
                out.println("<td>" + mobile.getBrand() + "</td>");
                out.println("<td>" + mobile.getModel() + "</td>");
                out.println("<td>" + mobile.getOperatingSystem() + "</td>");
                out.println("<td>" + mobile.getRamSize() + "</td>");
                out.println("<td>" + mobile.getStorageCapacity() + "</td>");
                out.println("<td>" + mobile.getPrice() + "</td>");
                out.println("<td>" + mobile.getRating() + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
        } else {
            out.println("<p>No Mobile details found in the database.</p>");
        }

        out.println("</body></html>");
        out.close();
    }


}
