package tp_solid.affichagePlanning;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import tp_solid.Etudiant;
import tp_solid.Projet;
import tp_solid.util.Pair;

/**
 * Le code de "afficherPlanning" est dans une classe dédiée à cela, qui implémente l'interface des Afficheurs de planning.
 * 
 * Il s'agit ici d'un copié-collé du code existant, où il a fallu tout de même modifier les "this" (qui faisait référence à l'étudiant)
 * et les remplacer par l'étudiant qui est maintenant passé en argument de la fonction.
 */

public class AfficheurXML implements AfficheurPlanning {

	@Override
	public void afficher(Etudiant etu, DateFormat df) {
		
		String nomFormation = etu.getFormation().getNom();

		System.out.println("Planning de " + etu.getNom() + " (" + nomFormation + ")");
		System.out.println("--------");
		for (Pair<Date,Projet> pair : etu.getJoursTravailles()) {
			Date date = pair.getL();
			Projet projet = pair.getR();
			System.out.println("+ " + projet.getNom() + " (le " + df.format(date) + ")");
		}
	}

	public void afficher(Etudiant etu) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		this.afficher(etu, df);
	}

}
