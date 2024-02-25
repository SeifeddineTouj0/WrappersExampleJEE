

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
        // Configure le type de contenu de la réponse en HTML
        response.setContentType("text/html");
        // Obtient le PrintWriter pour écrire la réponse
        PrintWriter out = response.getWriter();
        // Affiche un message dans la console pour indiquer que la servlet a été appelée
        System.out.println("Servlet is called");
        // Obtient la locale de la réponse
        Locale loc = response.getLocale();
        // Écrit dans la réponse HTML la locale configurée pour cette application
        out.println("Locale set for this application is " + loc.toString());
    }

}
