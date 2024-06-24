package fr.diginamic.builder;

public class Ingredient {
	
	/** nom de l'ingredient */
	private String nom;
	
	/** quantité de l'ingredient en milligramme*/
	private double qteMilligramme;

	/** Constructeur de la classe ingredient
	 * @param nom
	 * @param qteMilligramme
	 */
	public Ingredient(String nom, double qteMilligramme) {
		this.nom = nom;
		this.qteMilligramme = qteMilligramme;
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

	/**
	 * @return the qteMilligramme
	 */
	public double getQteMilligramme() {
		return qteMilligramme;
	}

	/**
	 * @param qteMilligramme the qteMilligramme to set
	 */
	public void setQteMilligramme(double qteMilligramme) {
		this.qteMilligramme = qteMilligramme;
	}
	
	
}
