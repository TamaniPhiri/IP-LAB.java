package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");

        // Get the PrintWriter
        PrintWriter out = response.getWriter();

        // Write HTML content
        out.println("<html><body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("<p>This is a simple servlet example.</p>");
        out.println("</body></html>");

        // Close the PrintWriter
        out.close();
    }
}
