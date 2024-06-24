package fr.diginamic.builder;

public class Categorie {
	
	/** nom de la categorie*/
	private String nom;

	/** Constructeur de la Classe categorie
	 * @param nom
	 */
	public Categorie(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
