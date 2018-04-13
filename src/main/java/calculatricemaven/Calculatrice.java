package calculatricemaven;

/**
 * 
 * @author Gauthier Puertas
 * Classe qui poss�de une m�thode pour chaque type d'op�ration, prends en entr�e 2 int et 
 * retourne le r�sultat de l'op�ration (en int)
 *
 */

public class Calculatrice {
    
    public Calculatrice()
    {
        
    }
    
    /**
     * 
     * @param a int, nombre entier pass� en argument
     * @param b int, nombre entier pass� en argument
     * @return int, r�sultat de l'op�ration
     * 
     * Prends deux int en entr�e et retourne le r�sultat de leur addition
     */
    
    public int addition(int a, int b)
    {
        return a+b;
    }
    
    /**
     * 
     * @param a int, nombre entier pass� en argument
     * @param b int, nombre entier pass� en argument
     * @return int, r�sultat de l'op�ration
     * 
     * Prends deux int en entr�e et retourne le r�sultat de leur multiplication
     */
    
    public int multiplication(int a, int b)
    {
        return a*b;
    }
    
    /**
     * 
     * @param a int, nombre entier pass� en argument
     * @param b int, nombre entier pass� en argument
     * @return int, r�sultat de l'op�ration
     * 
     * Prends deux int en entr�e et retourne le r�sultat de leur soustraction
     */
    
    public int soustraction(int a, int b)
    {
        return a-b;
    }
    
    /**
     * 
     * @param a int, nombre entier pass� en argument
     * @param b int, nombre entier pass� en argument
     * @return int, r�sultat de l'op�ration
     * 
     * Prends deux int en entr�e et retourne le r�sultat de leur division
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
