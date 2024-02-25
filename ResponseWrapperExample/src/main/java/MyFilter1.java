


	
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
	    // Configure le type de contenu de la réponse en HTML
	    response.setContentType("text/html");
	    // Obtient le PrintWriter pour écrire la réponse
	    PrintWriter out = response.getWriter();
	    // Écrit un message HTML dans la réponse
	    out.println("<b> <i>Filter is filtering the response and passing it to Wrapper class</i> </b> <br/>");
	    // Instancie une classe wrapper pour la réponse (ResponseWrapper1) et la passe à la chaîne de filtres suivante
	    ResponseWrapper1 responseWrapper = new ResponseWrapper1(response);
	    // Appelle le filtre suivant dans la chaîne avec la requête d'origine et la réponse enveloppée
	    chain.doFilter(request, responseWrapper);
	}

	

}
