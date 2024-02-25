import java.util.Locale;

import jakarta.servlet.*;
public class ResponseWrapper1 extends ServletResponseWrapper
{
	public ResponseWrapper1 (ServletResponse res)
    {
        //Calling the ServletResponseWrapper superclass constructor i.e. ServletResponse interface.
        super (res);
    }
	public Locale getLocale() {
	    // Affiche un message dans la console pour indiquer que la classe enveloppante est appelée par le filtre
	    System.out.println("Wrapper class called by Filter");
	    // Appelle la méthode getLocale() de la superclasse ServletResponseWrapper pour obtenir la locale de la réponse d'origine
	    Locale loc = super.getLocale();
	    // Récupère le pays et la langue de la locale
	    String country = loc.getCountry();
	    String language = loc.getLanguage();
	    // Vérifie si le pays n'est pas les États-Unis
	    if (!country.equals("US")) {
	        // Si le pays n'est pas les États-Unis, crée une nouvelle locale anglaise pour les États-Unis
	        Locale loc1 = new Locale("en", "US");
	        loc = loc1;
	    }
	    // Affiche le pays et la langue dans la console
	    System.out.println(country);
	    System.out.println(language);
	    // Retourne la locale mise à jour
	    return loc;
	}
}