package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Produit {
	
	/** nom du produit*/
	private String nom;
	
	/** nom du grade du produit*/
	private String grade;
	
	/** mArque du produit*/
	private Marque marque;
	
	/** Categorie du produit*/
	private Categorie categorie;
	
	/** Liste des additif dans le produit*/
	private List<Additif> additif = new ArrayList<>();

	/** Liste des allergene dans le produit*/
	private List<Allergene> allergene = new ArrayList<>();
	
	/** Liste des ingredient dans le produit*/
	private List<Ingredient> ingredient = new ArrayList<>();
	
	/** Constructeur de la classe produit
	 * @param nom
	 * @param grade
	 * @param marque
	 * @param categorie
	 */
	public Produit(String nom, String grade, Marque marque, Categorie categorie) {
		this.nom = nom;
		this.grade = grade;
		this.marque = marque;
		this.categorie = categorie;
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
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
}
