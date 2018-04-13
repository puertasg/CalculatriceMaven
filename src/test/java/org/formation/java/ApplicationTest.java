package org.formation.java;

import calculatricemaven.Calculatrice;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * @author Gauthier Puertas
 * Classe exécutant les test unitaires pour la classe Calculatrice
 *
 */

public class ApplicationTest extends TestCase{
	public static Test suite()
	{
		return new TestSuite(ApplicationTest.class);
	}
	
	/**
	 * Vérifie le comportement de la méthode addition, si elle additionne bien a et b
	 */
	
	public void testAddition()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.addition(1, 2) == 3);
	}
	
	/**
	 * Vérifie le comportement de la méthode soustraction, si elle soustrait bien a et b
	 */
	
	public void testSoustraction()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.soustraction(4, 1) == 3);
	}
	
	/**
	 * Vérifie le comportement de la méthode multiplication, si elle multiplie bien a et b
	 */
	
	public void testMultiplication()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.multiplication(5, 2) == 10);
	}
	
	/**
	 * Vérifie le comportement de la méthode division, si elle divise bien a et b
	 */
	
	public void testDivision()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.division(8, 2) == 4);
	}
	
	/**
	 * Vérifie le comportement de la méthode division en cas de division par zéro, 
	 * si on catch ArithmeticException correctement
	 */
	
	public void testDivisionParZero()
	{
		Calculatrice c = new Calculatrice();
		
		try
		{
			c.division(1, 0);
			assertTrue(false);
		}
		catch(ArithmeticException e)
		{
			assertTrue(true);
		}
	}
}
