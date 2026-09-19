/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid.formation;

/**
 * La classe abstraite permet de mutualiser le code commun à toutes les formations. Ici, la gestion de l'année et du nom.
 */
public abstract class AbstractFormation implements Formation {
	
	private int annee;
	private String nom;
	
	public AbstractFormation(int annee, String nom) {
		this.annee = annee;
		this.nom = nom;
	}

	/**
	 * Obtenir l'année de la formation
	 * @return l'année
	 */
	public int getAnnee() {
		return annee;
	}
	
	/**
	 * Modifier l'année
	 * @param annee la nouvelle annee
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public String getNom() {
		return this.nom;
	}
	
}
