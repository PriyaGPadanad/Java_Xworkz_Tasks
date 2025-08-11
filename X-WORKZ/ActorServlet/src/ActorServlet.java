
package com.xworkz.actor;

        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.*;
        import java.io.IOException;
        import java.io.PrintWriter;

@WebServlet(urlPatterns = "/actor")
public class ActorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String name = req.getParameter("name");
        String lang = req.getParameter("lang");
        String salary = req.getParameter("salary");
        String blockBusters = req.getParameter("blockBusters");
        String flops = req.getParameter("flops");
        String upcomingMovie = req.getParameter("upcomingMovie");
        String producer = req.getParameter("producer");
        String director = req.getParameter("director");
        String budget = req.getParameter("budget");

        writer.println("<h2>Actor Data Submitted Successfully!</h2>");
        writer.println("<p><strong>Name:</strong> " + name + "</p>");
        writer.println("<p><strong>Language:</strong> " + lang + "</p>");
        writer.println("<p><strong>Salary:</strong> " + salary + "</p>");
        writer.println("<p><strong>Block Busters:</strong> " + blockBusters + "</p>");
        writer.println("<p><strong>Flops:</strong> " + flops + "</p>");
        writer.println("<h3>Upcoming Movie Info</h3>");
        writer.println("<p><strong>Movie:</strong> " + upcomingMovie + "</p>");
        writer.println("<p><strong>Producer:</strong> " + producer + "</p>");
        writer.println("<p><strong>Director:</strong> " + director + "</p>");
        writer.println("<p><strong>Budget:</strong> " + budget + "</p>");
    }
}
