import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class InitParamServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        out.println(getServletConfig().getInitParameter("title"));

        System.out.println(getServletConfig().getInitParameter("title"));
        System.out.println(getServletConfig().getInitParameter("configStyle"));

        System.out.println("Author : "+ getServletContext().getInitParameter("author"));
        System.out.println("Country : "+ getServletContext().getInitParameter("country"));

        out.println("</body></html>");
    }
}
