package fr.diginamic.factory;

public class Element {

	/** nom de l'élément */
	private String nom;
	
	/** quantité de l'élément */
	private double valeur;

	private UNITE unite;

	/**
	 * @param nom
	 * @param valeur
	 * @param unite
	 */
	public Element(String nom, double valeur, UNITE unite) {
		this.nom = nom;
		this.valeur = valeur;
		this.unite = unite;
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
	 * @return the valeur
	 */
	public double getValeur() {
		return valeur;
	}

	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	/**
	 * @return the unite
	 */
	public UNITE getUnite() {
		return unite;
	}

	/**
	 * @param unite the unite to set
	 */
	public void setUnite(UNITE unite) {
		this.unite = unite;
	}

}
