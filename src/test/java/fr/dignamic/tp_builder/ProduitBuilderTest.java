package fr.dignamic.tp_builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import fr.diginamic.builder.Additif;
import fr.diginamic.builder.Allergene;
import fr.diginamic.builder.Categorie;
import fr.diginamic.builder.Ingredient;
import fr.diginamic.builder.Marque;
import fr.diginamic.builder.ProduitBuilder;
import fr.diginamic.builder.Produit;

public class ProduitBuilderTest {

	@Test
	public void testCreerInstanceProduit() {

		ProduitBuilder builder = new ProduitBuilder();
		
		Additif additif = new Additif("E430",25);
		Allergene allergene = new Allergene("gluten",20);
		Ingredient ingredient = new Ingredient("oeuf",3);
		
		Produit produit = builder
				.appendNom("Pâtes")
				.appendGrade("A")
				.appendMarque(new Marque("Panzani"))
				.appendCategorie(new Categorie("Féculent"))
				.addAdditif(additif)
				.addAllergene(allergene)
				.addIngredient(ingredient)
				.get();
		assertEquals("Pâtes", produit.getNom());
		assertEquals("A", produit.getGrade());
		assertEquals("Panzani",produit.getMarque().getNom());
		assertEquals("Féculent", produit.getCategorie().getNom());
		assertFalse(!produit.getAdditif().contains(additif));
		assertFalse(!produit.getAllergene().contains(allergene));
		assertFalse(!produit.getIngredient().contains(ingredient));
	}
}
