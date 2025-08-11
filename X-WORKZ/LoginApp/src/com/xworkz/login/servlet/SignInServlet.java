
package com.xworkz.login.servlet;

        import com.xworkz.login.dto.UserDTO;
        import com.xworkz.login.service.UserService;
        import com.xworkz.login.service.UserServiceImpl;

        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.*;
        import java.io.IOException;

@WebServlet(urlPatterns = "/signIn",loadOnStartup = 1)
public class SignInServlet extends HttpServlet {
 public SignInServlet(){
     System.out.println("Running SignInServlet");
 }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        String userId=req.getParameter("userId");
        String password=req.getParameter("password");

        UserDTO userDTO=new UserDTO(email,userId,password);
        System.out.println("Email:"+email+"User Id:"+userId+"Password:"+password);

        UserService userService=new UserServiceImpl();
        String result=userService.validate(userDTO);

        if (!result.equals("Sign-Up Successfully")){
            req.setAttribute("dto",userDTO);
            req.setAttribute("errorMessage",result);
        }else{
            req.setAttribute("message",result);
        }

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignIn.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        int convertedId=Integer.parseInt(id);

        System.out.println("Converted"+convertedId);

        UserService userService=new UserServiceImpl();

        req.setAttribute("Email","email");
        req.setAttribute("UserId","userId");
        req.setAttribute("Password","password");
        req.setAttribute("Created_at","created_at");

        req.setAttribute("result","Result");

        if(UserDTO==null) {
            String message = "data not found";
            req.setAttribute("failMessage", message);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignIn.jsp");
            requestDispatcher.forward(req, resp);
        }else{
            String message="data found";
            req.setAttribute("message",message);
            req.setAttribute("dto",UserDTO);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("result.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}
