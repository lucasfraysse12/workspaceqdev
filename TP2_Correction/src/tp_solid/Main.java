/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid;

import java.io.IOException;

import tp_solid.affichagePlanning.AfficheurPlanning;
import tp_solid.affichagePlanning.AfficheurXML;
import tp_solid.document.compterendu.CompteRendu;
import tp_solid.document.compterendu.CptRDiapo;
import tp_solid.formation.Formation;

/**
 * Démonstration de l'application actuelle
 */
public class Main {

	public static void main(String[] args) {
		
		
		// Chargement des données fictives
		Etudiant etu = MkDonneesFictives.getDonnees();
		
		
		// Afficher le nom et le numero étudiant
		System.out.println(etu.getNom() + " (numéro étudiant = " + etu.getNumeroEtu() + ")");
		System.out.println();
		
		
		// Affichage de la formation de l'étudiant
		Formation formation = etu.getFormation();
		System.out.println("Formation : " + formation.getNom() + " (" + formation.getAnnee() + ")");
		for (String comp : formation.getCompetences()) {
			System.out.println("+ " + comp);
		}
		System.out.println();
		
		
		// Affichage du planing de l'étudiant
		// Ici, on a deux solutions.
		// 1. Soit on laisse le programmeur gérer ses affichages à la main
		AfficheurPlanning aff = new AfficheurXML();
		aff.afficher(etu);
		// 2. Soit on attache un afficheur de planning à chaque instance d'étudiant, et on laisse
		// le programmeur le modifier avec un setter
		etu.setAfficheurPlanning(aff);
		etu.afficherPlanning();
		System.out.println();
		
		
		// Affichage les projets de l'étudiant
		System.out.println("Projets :");
		for (Projet projet : etu.getProjets()) {
			System.out.println("+ " + projet.getNom());
		}
		System.out.println();
		
		
		// Ouverture et affichage des documents du projet 1
		Projet projet1 = etu.getProjets().get(0);
		try {
			projet1.openAllDocs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		
		// Enregistrement des documents du projet 1
		try {
			projet1.saveAllDocs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		
		
		// Ouverture et affichage des textes et diaporamas des comptes rendus
		for (CompteRendu cptRendu : projet1.getCompteRendus()) {
			try {
				cptRendu.getTexte().open();
				System.out.println("Compte-rendu '" + cptRendu.getTexte().getFilename() + "' (type = " + cptRendu.getTexte().getType() + ")");
				System.out.println("\t" + new String(cptRendu.getTexte().getRawData()));
				if (cptRendu instanceof CptRDiapo) {
					// Ici, il a fallu modifier le code. En effet, l'objet cptRendu étant typé CompteRendu, il n'est pas possible
					// d'appeler la méthode getDiaporama car elle n'est pas définie dans cette interface.
					// La solution retenue est un peu bancale : on crée un nouvel objet cptCast de type CptRDiapo (donc, disposant
					// de la méthode getDiaporama) dont la valeur est celle de cptRendu (ce qu'on peut faire en castant l'objet cptRendu,
					// c'est la syntaxe avec les parenthèses).
					// Cette pratique est possiblement source de problèmes (et la condition (cptRendu instanceof CptRDiapo) est là pour vérifier
					// que l'on peut effectivement faire le cast, et donc réduire le risque de bugs.
					// Cela montre que la conception en amont est un peu bancale.
					CptRDiapo cptCast = (CptRDiapo) cptRendu;
					cptCast.getDiaporama().open();
					System.out.println("Compte-rendu '" + cptCast.getDiaporama().getFilename() + "' (type = " + cptCast.getDiaporama().getType() + ")");
					System.out.println("\t" + new String(cptCast.getDiaporama().getRawData()));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println();
		
		
		// Export en mode XML des documents
		System.out.println("Export en XML (encoding=" + projet1.getExportEncoding() + ")");
		try {
			projet1.exporterDocuments("documents.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		System.out.println("Démo terminée");
	}

}
