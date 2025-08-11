

package com.xworkz.login.servlet;

        import com.xworkz.login.dto.UserDTO;
        import com.xworkz.login.service.UserService;
        import com.xworkz.login.service.UserServiceImpl;

        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.*;
        import javax.servlet.*;

        import java.io.IOException;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
    private UserService service = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDTO dto = new UserDTO(email, userId, password);

        if (service.signUp(dto, confirmPassword)) {
            resp.sendRedirect("SignIn.jsp");
        } else {
            resp.getWriter().print("<h3>Sign Up Failed. Try Again.</h3>");
        }
    }
}
