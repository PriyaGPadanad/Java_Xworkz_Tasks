@WebServlet("/xworkz")
public class XworkzServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("----- Xworkz Servlet -----");
        Enumeration<String> params = req.getParameterNames();
        while (params.hasMoreElements()) {
            String name = params.nextElement();
            System.out.println(name + " : " + req.getParameter(name));
        }
    }
}
