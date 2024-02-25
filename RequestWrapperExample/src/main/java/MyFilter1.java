


	
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;  


/**
 * Servlet Filter implementation class MyFilter1
 */
public class MyFilter1 implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilter1() {
        super();

        // TODO Auto-generated constructor stub
    }
    /**
	 * @see Filter#(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// Méthode principale du filtre qui sera exécutée à chaque requête.
				// Configure le type de contenu de la réponse en HTML
				response.setContentType("text/html");
				// Obtient le PrintWriter pour écrire la réponse
				PrintWriter out = response.getWriter();
				// Écrit un message HTML dans la réponse
				out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");
				// Instancie une classe wrapper pour la requête (RequestWrapper1) et la passe à la chaîne de filtres suivante
				RequestWrapper1 requestWrapper = new RequestWrapper1(request);
				chain.doFilter(requestWrapper, response); // Appelle le filtre suivant dans la chaîne
		
	}

	

}
