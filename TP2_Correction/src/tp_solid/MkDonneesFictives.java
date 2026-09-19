/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid;

import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;

import tp_solid.document.DocumentNormal;
import tp_solid.document.DocumentSysteme;
import tp_solid.document.compterendu.CompteRendu;
import tp_solid.document.compterendu.Rapport;
import tp_solid.document.compterendu.Soutenance;
import tp_solid.formation.Formation;
import tp_solid.formation.FormationInfo;

/**
 * 
 */
public class MkDonneesFictives {

	
	/**
	 * Génère des données fictives concernant un étudiant et ses projets
	 * @return L'étudiant généré
	 */
	public static Etudiant getDonnees() {
		// Données fictives
		Formation formationInfo = new FormationInfo(2026); 
		//Ici, il a fallu modifier le code pour utiliser le nouveau constructeur.
		// En effet, l'appel à new Formation("INFO", 2025) est maintenant invalide (on ne peut pas instancier une interface !)
		Etudiant etu = new Etudiant(123456, "Alice Ébobe", formationInfo);
		Projet projet1 = new Projet("Projet Web");
		Projet projet2 = new Projet("Archical");
		etu.addProjet(projet1);
		etu.addProjet(projet2);

		// Données fictives : documents
		// Creation du dossier
		String dir = "./R304_TP_solid_files/";
		new File(dir).mkdirs();
		
		// Creation des fichiers
		String[] filenames = {
				"main.java",
				"masterclass.java",
				"diapo.md",
				"rapport.md",
				"script.txt",
				"openjdk-123-jre.exe"
		};
		DocumentNormal doc;
		for (String filename : filenames) {
			doc = new DocumentNormal(dir+"/"+filename, filename.split("\\.")[1]);
			doc.setRawData(new String("01101010 -- code source de " + filename).getBytes());
			try {
				doc.save();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		projet1.addDocument(new DocumentNormal(dir+"main.java", "java"));
		projet1.addDocument(new DocumentNormal(dir+"masterclass.java", "java"));
		projet1.addDocument(new DocumentSysteme(dir+"openjdk-123-jre.exe", "exe", "windows"));

		// Données fictives : rapport et soutenance du projet 1
		CompteRendu cptrendu1 = new Rapport(
				new DocumentNormal(dir+"rapport.md", "md")
				);
		projet1.addCompteRendu(cptrendu1);
		CompteRendu cptrendu2 = new Soutenance(
				new DocumentNormal(dir+"script.txt", "txt"),
				new DocumentNormal(dir+"diapo.md", "md")
				);
		projet1.addCompteRendu(cptrendu2);

		// Données fictives : jours consacrés au projets par l'étudiant.
		etu.addJourTravaille(new GregorianCalendar(2025,04,12).getTime(), projet1);
		etu.addJourTravaille(new GregorianCalendar(2025,04,13).getTime(), projet1);
		etu.addJourTravaille(new GregorianCalendar(2025,04,15).getTime(), projet2);
		etu.addJourTravaille(new GregorianCalendar(2025,04,19).getTime(), projet2);
		etu.addJourTravaille(new GregorianCalendar(2025,04,20).getTime(), projet1);
		etu.addJourTravaille(new GregorianCalendar(2025,04,21).getTime(), projet1);
		
		return etu;
	}
}
