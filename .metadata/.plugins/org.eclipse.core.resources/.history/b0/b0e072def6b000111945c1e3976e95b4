package tp_solid;

import java.text.SimpleDateFormat;
import java.util.Date;

import tp_solid.formation.FormationInfo;
import tp_solid.util.Pair;

public class AfficherTXT implements AfficherPlanning {

	public void afficherPL(Etudiant e) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String nomFormation = new FormationInfo(2025).getNom();
		
		

		System.out.println("Planning de " + nomFormation + " (" + nomFormation + ")");
		System.out.println("--------");
		for (Pair<Date,Projet> pair : joursTravailles) {
			Date date = pair.getL();
			Projet projet = pair.getR();
			System.out.println("+ " + projet.getNom() + " (le " + df.format(date) + ")");
		}

	}

}
