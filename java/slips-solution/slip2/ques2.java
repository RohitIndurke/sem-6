import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ques2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws IOException {
        PrintWriter out=res.getWriter();
        out.println("IP: "+req.getRemoteAddr());
        out.println("Browser: "+req.getHeader("User-Agent"));
    }
}
