@WebServlet("/hotel")
public class HotelServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----- Hotel Servlet -----");
        Enumeration<String> paramNames = req.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String name = paramNames.nextElement();
            System.out.println(name + " : " + req.getParameter(name));
        }
    }
}
