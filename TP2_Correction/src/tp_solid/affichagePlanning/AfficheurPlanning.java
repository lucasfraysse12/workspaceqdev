package tp_solid.affichagePlanning;

import java.text.DateFormat;

import tp_solid.Etudiant;

/**
 * L'affichage du planning n'a rien à faire dans la classe Etudiant, dont la responsabilité est de gérer les données de l'étudiant
 * (stockage, modification, etc.).
 * On sort donc le code et on le place dans une nouvelle classe, ce qui permet de respecter le principe de responsabilité unique.
 * 
 * On en profite pour faire une interface (donc, très abstraite), ce qui permet d'être ouvert aux extensions en restant fermé aux modifications
 * et aussi d'avoir une dépendance faible (uniquement vers l'interface).
 * 
 * Ici, on a la surcharge de la méthode "afficher" afin de pouvoir choisir un format de date particulier, et par défaut le format dd/MM/yyyy
 */

public interface AfficheurPlanning {

	public void afficher(Etudiant etu);
	public void afficher(Etudiant etu, DateFormat df);
	
}
