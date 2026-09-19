/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormationInfo extends AbstractFormation {
	
	public FormationInfo(int annee) {
		super(annee, "Informatique");
	}

	/**
	 * Obtenir les compétences du parcours
	 * @return Liste des compétences
	 */
	public List<String> getCompetences(){
		return new ArrayList<String>(Arrays.asList(
						"Réaliser un développement d’application",
						"Optimiser des applications informatiques",
						"Administrer des systèmes informatiques communicants complexes",
						"Gérer des données de l’information",
						"Conduire un projet",
						"Travailler dans une équipe informatique"
						));
	}
}
