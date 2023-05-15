import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/servlet"}, initParams = {
        @WebInitParam(name="color", value="blue"),
        @WebInitParam(name="team", value="csk")
})
public class InitParamAnnotationServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        System.out.println(getServletConfig().getInitParameter("color"));

        System.out.println("Author : "+ getServletContext().getInitParameter("author"));
        System.out.println("Country : "+ getServletContext().getInitParameter("country"));

        out.println("</body></html>");
    }
}
