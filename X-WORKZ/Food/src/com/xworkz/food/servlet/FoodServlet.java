package com.xworkz.food.servlet;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.xworkz.food.dto.FoodDTO;
import com.xworkz.food.repository.FoodRepository;
import com.xworkz.food.repository.FoodRepositoryImpl;
import com.xworkz.food.service.FoodService;
import com.xworkz.food.service.FoodServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/food",loadOnStartup = 1)
public class FoodServlet extends HttpServlet {

    public FoodServlet(){
        System.out.println("no-arg constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int foodId=Integer.parseInt(req.getParameter("foodId"));
        String name=req.getParameter("name");
        String description=req.getParameter("description");
        String category=req.getParameter("category");
        double price=Double.parseDouble(req.getParameter("price"));
        boolean availability=Boolean.parseBoolean(req.getParameter("availability"));
        boolean type= Boolean.parseBoolean(req.getParameter("type"));

        FoodDTO foodDTO=new FoodDTO(foodId,name,description,category,price,availability,type);
        System.out.println(foodDTO);

        FoodService foodService=new FoodServiceImpl();
        String result=foodService.validate(foodDTO);
        req.setAttribute("message",result);

        if(!result.equals("details saved successfully")){
            req.setAttribute("dto",foodDTO);
        }

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("food.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        FoodRepository foodRepository=new FoodRepositoryImpl();
        List<FoodDTO>foodList=foodRepository.getData();
        out.println("<html><body>");
        out.println("<h2>Food List</h2>");

        if(foodList!=null && !foodList.isEmpty()){
            out.println("<table border='1'>");
            out.println("<tr><th>FoodId</th><th>Name</th><th>Description</th><th>Category</th><th>Price</th><th>Availability</th><th>Type</th></tr>");

            for(FoodDTO food:foodList){
                out.println("<tr>");
                out.println("<td>"+food.getFoodId()+"</td>");
                out.println("<td"+food.getName()+"</td>");
                out.println("<td>"+food.getDescription()+"</td>");
                out.println("<td>"+food.getCategory()+"</td>");
                out.println("<td>"+food.getPrice()+"</td>");
                out.println("<td>"+food.isAvailability()+"</td>");
                out.println("<td>"+food.isType()+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        }else{
            out.println("<p>No Food Details found in the database</p>");
        }
        out.println("</body></html>");
        out.close();
    }
}
