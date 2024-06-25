package fr.diginamic.composite;

public class Employe implements IElement {
	
	/** nom de l'employe */
	private String nom;
	
	/** prenom de l'employe*/
	private String prenom;
	
	/** salaire employe */
	private double salaire;	
	
	/** constructeur de la classe employe
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Employe(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}



	@Override
	/**
	 * @return salaire
	 */
	public double calculerSalaire() {
		return salaire;
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
