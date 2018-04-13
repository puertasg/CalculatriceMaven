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
    
    public int addition(int a, int b)
    {
        return a+b;
    }
    
    public int multiplication(int a, int b)
    {
        return a*b;
    }
    
    public int soustraction(int a, int b)
    {
        return a-b;
    }
    
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
