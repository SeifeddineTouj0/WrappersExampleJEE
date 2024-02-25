import jakarta.servlet.*;
public class RequestWrapper1 extends ServletRequestWrapper
{
    public RequestWrapper1 (ServletRequest request)
    {
        //calls the ServletRequestWrapper superclass's constructor i.e. ServletRequest.
        super (request);
        System.out.println("test");
    }

    public String getParameter(String str) {
        // Appelle la méthode getParameter(String) de la superclasse ServletRequestWrapper
        String name = super.getParameter(str);
        // Vérifie si le paramètre récupéré est null ou vide
        if (name == null || name.isEmpty()) {
            // Si le paramètre est null ou vide, définir une valeur par défaut
            name = "Please, enter your name in the form";
        }
        // Retourne la valeur du paramètre, soit la valeur par défaut si elle est vide ou null
        return name;
    }
}