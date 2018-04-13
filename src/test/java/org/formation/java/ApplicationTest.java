package org.formation.java;

import calculatricemaven.Calculatrice;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ApplicationTest extends TestCase{
	public static Test suite()
	{
		return new TestSuite(ApplicationTest.class);
	}
	
	public void testAddition()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.addition(1, 2) == 3);
	}
	
	public void testSoustraction()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.soustraction(4, 1) == 3);
	}
	
	public void testMultiplication()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.multiplication(5, 2) == 10);
	}
	
	public void testDivision()
	{
		Calculatrice c = new Calculatrice();
		assertTrue(c.division(8, 2) == 4);
	}
}
