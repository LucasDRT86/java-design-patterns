package fr.diginamic.factory;

public class ElementFactory {
	public static Element createElement(TypeElement type, String nom, double valeur, UNITE unite) {
		switch (type) {
		case INGREDIENT:
			return new Ingredient(nom, valeur, unite);
		case ALLERGENE:
			return new Allergene(nom, valeur, unite);
		case ADDITIF:
			return new Ingredient(nom, valeur, unite);

		default:
			break;
		}
		
		return null;
	}
}
