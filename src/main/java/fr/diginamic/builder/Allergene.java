package fr.diginamic.builder;

public class Allergene {
	
	/** nom de l'allergene*/
	private String nom;
	
	/** quantité de l'allergene en milligramme*/
	private double qteMilligramme;

	/**
	 * @param nom
	 * @param qteMilligramme
	 */
	public Allergene(String nom, double qteMilligramme) {
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
