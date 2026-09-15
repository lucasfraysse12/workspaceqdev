/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid.formation;

import java.util.List;

public interface Formation {
	
	/**
	 * Obtenir l'année de la formation
	 * @return l'année
	 */
	public int getAnnee();

	/**
	 * Modifier l'année
	 * @param annee la nouvelle annee
	 */
	public void setAnnee(int annee);

	/**
	 * Obtenir le nom de la formation
	 * @return Nom de la formation
	 */
	public String getNom();	
	
	/**
	 * Obtenir les compétences de la formation
	 * @return Liste des compétences
	 * @throws IllegalArgumentException
	 */
	public List<String> getCompetences();

}
