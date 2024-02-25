


	
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
		response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        out.println("<b> <i>Filter is filtering the response and passing it to Wrapper class</i> </b> <br/>");
        //Calling the constructor of response wrapper class 
        ResponseWrapper1 responseWrapper = new ResponseWrapper1 (response);
        //This method calls the next filter in the chain
        chain.doFilter (request, responseWrapper);
		
	}

	

}
