package calculatricemaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Gauthier Puertas
 * Calculatrice r�alis�e pour le TP Maven, 
 * prends des inputs utilisateur et retourne le r�sultat de l'op�ration saisie
 *
 */

public class CalculatriceMaven {

	public static void main(String[] args) {
        int res = 0;
        List<String> l = new ArrayList<String>();
        
        creationListe(l);
        
        while(l.size() != 1)
        {
            res = calcul(l);
            l.subList(0, 3).clear();
            l.add(0, Integer.toString(res));
        }
        
        System.out.println("Le r�sutat est : " + l.get(0));
    }
	
	/**
	 * 
	 * @param l, ArrayList instanci�e dans le main
	 * Ajoute les donn�es saisies par l'utilisateur dans la liste l
	 */
	
	public static void creationListe(List<String> l)
	{
		Scanner keyboard = new Scanner(System.in);
        boolean stop = false;
        String inputStr=null;
        final String WORD_TO_QUIT = "quit";
        
		//Cr�ation d'un ArrayList � partir de la saisie utilisateur
        while(!stop)
        {
        	if(keyboard.hasNextLine())
        	{
        		inputStr = keyboard.nextLine();
        		l.add(inputStr);
        		
        		if(WORD_TO_QUIT.equals(inputStr))
        		{
        			stop=true;
        			//on supprime le quit
        			l.remove(l.size() - 1);
        		}
        	}
        }
        
        keyboard.close();
	}
	
	/**
	 * 
	 * @param l, ArrayListe contenant les donn�es saisies par l'utilisateur
	 * @return int, contient la valeur retourn�e par la m�thode appel�e de l'objet calc
	 */
	
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
}
