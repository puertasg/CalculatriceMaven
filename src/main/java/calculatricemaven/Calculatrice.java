package calculatricemaven;

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
        try
        {
            return a/b;
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Division par 0!");
            return 0;
        }
    }
}
