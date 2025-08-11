package com.xworkz.airlines.servlet;

import com.xworkz.airlines.dto.AirlinesDTO;
import com.xworkz.airlines.service.AirlinesService;
import com.xworkz.airlines.service.AirlinesServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/airlines",loadOnStartup = 1)
public class AirlinesServlet extends HttpServlet {

  public  AirlinesServlet(){
      System.out.println("no-arg constructor");
  }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      String airlinesName= req.getParameter("name");
      String source= req.getParameter("source");
      String destination= req.getParameter("destination");
      String flightCode= req.getParameter("flightCode");
      String classType= req.getParameter("classType");
      String mealType= req.getParameter("mealType");
      String international= req.getParameter("radioDefault");
      Boolean international1 = Boolean.parseBoolean("internatinal");

      AirlinesDTO airlinesDTO=new AirlinesDTO(airlinesName,source,destination,flightCode,classType,mealType,international);
      System.out.println(airlinesDTO);

      AirlinesService airlinesService=new AirlinesServiceImp();
      String result=  airlinesService.validate(airlinesDTO);
      req.setAttribute("message",result);



      if(!result.equals("details saved successfully")){
        req.setAttribute("dto " , airlinesDTO);
      }

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("airlines.jsp");
        requestDispatcher.forward(req,resp);
    }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String id=req.getParameter("id");
    int id1=Integer.parseInt(id);

    System.out.println("airlineId="+id1);

    AirlinesService airlinesService=new AirlinesServiceImp();
    AirlinesDTO airlinesDTO=airlinesService.findById(id1);

    if(airlinesDTO==null){
      System.out.println("dats is not found");
    }
    else{
      System.out.println("data is found");
    }
  }
}
