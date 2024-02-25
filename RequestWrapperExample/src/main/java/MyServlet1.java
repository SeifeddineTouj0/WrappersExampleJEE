

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
        
        // Récupère le paramètre "username" de la requête
        String name = request.getParameter("username");
        
        // Affiche le nom récupéré dans la console
        System.out.println(name);
        
        // Obtient un PrintWriter pour écrire la réponse
        PrintWriter out = response.getWriter();
        
        // Écrit le nom récupéré dans la réponse
        out.println(name);
    }

}
