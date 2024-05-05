import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class CurrentTimeServlet extends HttpServlet {

    /** Called by the servlet container to initialize servlet */
    public void init() throws ServletException {
        // Initialization code, if any
    }

    /** Process the HTTP Get request */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type to HTML
        response.setContentType("text/html");

        // Get PrintWriter object
        PrintWriter out = response.getWriter();

        // Generate HTML content with current time
        out.println("<html>");
        out.println("<head><title>Current Time Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Current Time</h1>");
        out.println("<p>The current time is: " + new Date() + "</p>");
        out.println("</body></html>");

        // Close PrintWriter
        out.close();
    }

    /** Called by the servlet container to release resources */
    public void destroy() {
        // Cleanup code, if any
    }

    // Other methods if necessary
}
