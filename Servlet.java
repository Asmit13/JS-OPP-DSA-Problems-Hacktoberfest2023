import javax.servlet.*;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().write("Hello, Servlet!");
    }
}
