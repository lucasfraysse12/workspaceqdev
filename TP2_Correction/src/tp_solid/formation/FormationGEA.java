/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class FormationGEA extends AbstractFormation {
	
	
	public FormationGEA(String parcours, int annee) {
		super(annee, "Gestion des Entreprises et Administrations");
	}


	/**
	 * Obtenir les compétences du parcours
	 * @return Liste des compétences
	 */
	public List<String> getCompetences() {
		return new ArrayList<String>(Arrays.asList(
						"Analyser les processus de l’organisation dans son environnement",
						"Décider : aider à la prise de décision",
						"Piloter les relations avec les parties prenantes de l’organisation"
						));
	}
	

}
