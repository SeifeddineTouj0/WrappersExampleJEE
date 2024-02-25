


	
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
				response.setContentType("text/html");
		        PrintWriter out = response.getWriter();
		        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");
		        //Calling the constructor of request wrapper class 
		        RequestWrapper1 requestWrapper = new RequestWrapper1(request);
		        //This method calls the next filter in the chain
		        chain.doFilter (requestWrapper, response);
		
	}

	

}
