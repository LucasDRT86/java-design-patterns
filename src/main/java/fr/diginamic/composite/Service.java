package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service implements IElement {

	/** nom du service*/
	private String nom;
	
	/** Liste de IElement*/
	private List<IElement> employes = new ArrayList<>();
		
	/**
	 * @param nom
	 */
	public Service(String nom, IElement... newElements) {
		this.nom = nom;
		Collections.addAll(this.employes, newElements);
	}

	@Override
	public double calculerSalaire() {
		double res = 0;
		for(IElement elt : employes) {
			res += elt.calculerSalaire();			
		}
		return res;
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
