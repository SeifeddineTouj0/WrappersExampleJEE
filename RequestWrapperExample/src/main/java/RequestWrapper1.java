import jakarta.servlet.*;
public class RequestWrapper1 extends ServletRequestWrapper
{
    public RequestWrapper1 (ServletRequest request)
    {
        //calls the ServletRequestWrapper superclass's constructor i.e. ServletRequest.
        super (request);
        System.out.println("test");
    }

    public String getParameter (String str)
    {
        //Calling the superclass method i.e. ServletRequest's getParameter(String) method.
        String name = super.getParameter (str);
        if (name == null || name.isEmpty()) {
            name = "Please, enter your name in the form";
        }
        return name;
    }
}