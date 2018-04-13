package calculatricemaven;

/**
 * 
 * @author Gauthier Puertas
 * Classe qui possède une méthode pour chaque type d'opération, prends en entrée 2 int et 
 * retourne le résultat de l'opération (en int)
 *
 */

public class Calculatrice {
    
    public Calculatrice()
    {
        
    }
    
    /**
     * 
     * @param a int, nombre entier passé en argument
     * @param b int, nombre entier passé en argument
     * @return int, résultat de l'opération
     * 
     * Prends deux int en entrée et retourne le résultat de leur addition
     */
    
    public int addition(int a, int b)
    {
        return a+b;
    }
    
    /**
     * 
     * @param a int, nombre entier passé en argument
     * @param b int, nombre entier passé en argument
     * @return int, résultat de l'opération
     * 
     * Prends deux int en entrée et retourne le résultat de leur multiplication
     */
    
    public int multiplication(int a, int b)
    {
        return a*b;
    }
    
    /**
     * 
     * @param a int, nombre entier passé en argument
     * @param b int, nombre entier passé en argument
     * @return int, résultat de l'opération
     * 
     * Prends deux int en entrée et retourne le résultat de leur soustraction
     */
    
    public int soustraction(int a, int b)
    {
        return a-b;
    }
    
    /**
     * 
     * @param a int, nombre entier passé en argument
     * @param b int, nombre entier passé en argument
     * @return int, résultat de l'opération
     * 
     * Prends deux int en entrée et retourne le résultat de leur division
     */
    
    public int division(int a, int b)
    {
    	return a/b;
        /*try
        {
            return a/b;
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Division par 0!");
        	System.exit(0);
        	return 0;
        }*/
    }
}
