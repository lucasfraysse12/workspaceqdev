/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid.formation;

import java.util.List;

/**
 * Interface spécifiant toutes les méthodes disponibles pour les formations.
 * - Si un développeur veut créer une nouvelle formation, il peut facilement créer une nouvelle classe qui réalise cette interface
 *   sans modifier le code source, ce qui permet d'être OUVERT AUX EXTENSIONS et FERMÉ AUX MODIFICATIONS (Open/close principle)
 * - La classe Etudiant dépend de cette interface et non pas d'une implémentation concrète, ce qui permet
 *   d'avoir une dépendance faible (on ne dépend pas du code mais seulement de l'interface) et de respecter le
 *   principe d'inversion des dépendances.
 * - Enfin, le fait de regrouper tout ce qui concerne les formations dans un package "formation" peut aussi être vu comme
 *   une façon de respecter le principe de responsabilité unique (une classe/package = une responsabilité)
 */
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
