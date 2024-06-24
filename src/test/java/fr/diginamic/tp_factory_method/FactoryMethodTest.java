package fr.diginamic.tp_factory_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.factory.Element;
import fr.diginamic.factory.ElementFactory;
import fr.diginamic.factory.Ingredient;
import fr.diginamic.factory.TypeElement;
import fr.diginamic.factory.UNITE;

public class FactoryMethodTest {
	
	/** DELTA */
	private static final double DELTA = 0.0000001;

	@Test
	public void testNomCreateElement() {
		
		String nom = "sel";
		double valeur = 12.2;
		UNITE unite = UNITE.MILLI_GRAMMES;
		
		Element elt = ElementFactory.createElement(TypeElement.INGREDIENT,nom, valeur, unite);
		
		assertEquals("sel", elt.getNom() );
		
	}
	
	@Test
	public void testValeurCreateElement() {
		
		String nom = "sel";
		double valeur = 12.2;
		UNITE unite = UNITE.MILLI_GRAMMES;
		
		Element elt = ElementFactory.createElement(TypeElement.INGREDIENT,nom, valeur, unite);
		
		assertEquals(12.2, elt.getValeur(),DELTA );
		
	}
	
	@Test
	public void testUniteCreateElement() {
		
		String nom = "sel";
		double valeur = 12.2;
		UNITE unite = UNITE.MILLI_GRAMMES;
		
		Element elt = ElementFactory.createElement(TypeElement.INGREDIENT,nom, valeur, unite);
		
		assertEquals(UNITE.MILLI_GRAMMES, elt.getUnite());
		
	}
	
	@Test
	public void testClassCreateElement() {
		
		String nom = "sel";
		double valeur = 12.2;
		UNITE unite = UNITE.MILLI_GRAMMES;
		
		Element elt = ElementFactory.createElement(TypeElement.INGREDIENT,nom, valeur, unite);
		
		assertEquals(Ingredient.class, elt.getClass());
		
	}

}
