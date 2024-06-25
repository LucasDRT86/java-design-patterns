package fr.diginamic.builder;

public class ProduitBuilder {

	private Produit produit;

	/** Créer l'instance du produit
	 * @param produit
	 */
	public ProduitBuilder() {
		this.produit = new Produit();
	}
	
	/** Complète le nom du Produit puis on
        retourne l’instance courante (this) du
        builder
	 * @param nom
	 * @return
	 */
	public ProduitBuilder appendNom(String nom) {
		produit.setNom(nom);
		return this;
	}
	
	/** Complète le grade du Produit puis on
        retourne l’instance courante (this) du
        builder
	 * @param grade
	 * @return
	 */
	public ProduitBuilder appendGrade(String grade) {
		produit.setGrade(grade);
		return this;
	}
	
	/** Complète la categorie du Produit puis on
        retourne l’instance courante (this) du
        builder
	 * @param categorie
	 * @return
	 */
	public ProduitBuilder appendCategorie(Categorie categorie) {
		produit.setCategorie(categorie);
		return this;
	}
	
	/** Complète la marque du Produit puis on
        retourne l’instance courante (this) du
        builder
	 * @param marque
	 * @return
	 */
	public ProduitBuilder appendMarque(Marque marque) {
		produit.setMarque(marque);;
		return this;
	}
	
	/** Ajoute un allergene à la liste des allergène 
	 * du produit puis retourne l’instance courante 
	 * (this) du builder
	 * @param allergene
	 * @return
	 */
	public ProduitBuilder addAllergene(Allergene allergene) {
		produit.addAllergene(allergene);
		return this;
	}
	
	/**  Ajoute un ingredient à la liste des ingredients 
	 * du produit puis retourne l’instance courante 
	 * (this) du builder
	 * @param ingredient
	 * @return
	 */
	public ProduitBuilder addIngredient(Ingredient ingredient) {
		produit.addIngredient(ingredient);
		return this;
	}
	
	/** Ajoute un additif à la liste des additifs 
	 * du produit puis retourne l’instance courante 
	 * (this) du builder
	 * @param additif
	 * @return
	 */
	public ProduitBuilder addAdditif(Additif additif) {
		produit.addAdditif(additif);
		return this;
	}
	
	/** Retourne l'instance du produit
	 * @return
	 */
	public Produit get() {
		return produit;
	}
	
}
