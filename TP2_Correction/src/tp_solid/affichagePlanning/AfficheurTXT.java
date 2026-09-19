package tp_solid.affichagePlanning;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import tp_solid.Etudiant;
import tp_solid.Projet;
import tp_solid.util.Pair;

/**
 * On peut implémenter d'autres afficheurs de planning.
 */

public class AfficheurTXT implements AfficheurPlanning {

	@Override
	public void afficher(Etudiant etu, DateFormat df) {
		
		
		String str = "<planning>";

		str = str + "\n\t<etudiant nom='" + etu.getNom() + "'/>";
		for (Pair<Date,Projet> pair : etu.getJoursTravailles()) {
			Date date = pair.getL();
			Projet projet = pair.getR();
			str = str + "\n\t<item projet='" + projet.getNom() + "' date='" + df.format(date) + "' />";
		}
		System.out.println(str);
	}
	
	public void afficher(Etudiant etu) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		this.afficher(etu, df);
	}

}
