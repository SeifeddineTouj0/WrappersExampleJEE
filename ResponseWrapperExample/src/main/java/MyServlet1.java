

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        System.out.println ("Servlet is called");
        Locale loc = response.getLocale ();
        out.println ("Locale set for this application is " + loc.toString ());
		
	}

}
