package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Singleton {

	/** instance de la classe Singleton */
	private static Singleton instance = new Singleton();
	
	
	/** configuration */
	private ResourceBundle properties;
	
	/**
	 *  Constructeur de la classe Singleeton, properties 
	 *  est instancié avec le dossier de configuration
	 */
	private Singleton() {
		properties = ResourceBundle.getBundle("configuration");
	}
	
	/** retourne l'instance de la classe singleton
	 * @return instance
	 */
	public static Singleton getInstance() {
		return instance;
	}

	
	/** Methode utiliser pour récupérer l'url
	 *  du fichier de configuration
	 * @return String
	 */
	public String getUrl() {
		return properties.getString("db.url");
	}
	
	/** Methode utiliser pour récupérer le nom user
	 *  du fichier de configuration
	 * @return String
	 */
	public String getUser() {
		return properties.getString("db.user");
	}
	
	/** Methode utiliser pour récupérer 
	 *  le mot de passe (seulement un exemple pour le tp)
	 *  du fichier de configuration
	 * @return String
	 */
	public String getpassword() {
		return properties.getString("db.password");
	}
}
