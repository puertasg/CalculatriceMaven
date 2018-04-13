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
