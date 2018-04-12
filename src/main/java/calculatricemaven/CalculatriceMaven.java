package calculatricemaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatriceMaven {

	public static void main(String[] args) {
        int res = 0;
        List<String> l = new ArrayList<String>();
        
        Scanner keyboard = new Scanner(System.in);
        boolean stop = false;
        String inputStr=null;
        final String WORD_TO_QUIT = "quit";
        //Création d'un ArrayList à partir des arguments de la console
        while(!stop)
        {
        	if(keyboard.hasNextLine())
        	{
        		inputStr = keyboard.nextLine();
        		l.add(inputStr);
        		
        		//System.out.println(l.size());
        		
        		if(WORD_TO_QUIT.equals(inputStr))
        		{
        			stop=true;
        			//on supprime le quit
        			l.remove(l.size() - 1);
        		}
        	}
        }
        
        //afficherliste(l);
        
        while(l.size() != 1)
        {
            res = calcul(l);
            l.subList(0, 3).clear();
            l.add(0, Integer.toString(res));
        }
        
        System.out.println("Le résutat est : " + l.get(0));
    }
	
	public static int calcul(List<String> l)
    {
        Calculatrice calc = new Calculatrice();
        
        int a;
        int b;
        int res = 0;
        String operande = (String) l.get(1);
        
        a = Integer.parseInt(l.get(0));
        b = Integer.parseInt(l.get(2));
        
        switch(operande)
        {
            case"+":
                res = calc.addition(a, b);
                break;
            case"-":
                res = calc.soustraction(a, b);
                break;
            case"*":
                res = calc.multiplication(a, b);
                break;
            case"/":
                res = calc.division(a,b);
                break;
        }
        
        return res;
    }
	
	public static void afficherliste(List<String> l)
    {
        for(int i = 0; i < l.size(); i++)
        {
            System.out.println(l.get(i));
        }
    }

}
