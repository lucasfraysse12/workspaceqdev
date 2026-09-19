/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tp_solid.affichagePlanning.AfficheurPlanning;
import tp_solid.formation.Formation;
import tp_solid.util.Pair;




public class Etudiant {

	private String nom;
	private int numeroEtu;
	private Formation formation;
	private List<Projet> projets;
	private List<Pair<Date,Projet>> joursTravailles;
	private AfficheurPlanning afficheur;


	
	/*
	 * On a ajouté un attribut de type AfficheurPlanning.
	 * Pour éviter une dépendance vers une implémentation concrète, on a décidé
	 * de demander au développeur de le donner en argument au constructeur.
	 * On a aussi permis de ne pas le donner, alors ce sera la valeur null qui sera utilisé.
	 * Cela permet de maintenir la compatibilité avec le constructeur de la version précédente, 
	 * mais crée un risque de NullPointerException. On aurait pu décider de supprimer l'ancien constructeur
	 * (alors, on casse la compatibilité avec la version précédente) ou d'avoir par défaut un AfficheurTXT
	 * (alors, on introduit une dépendance). Il n'y a pas de solution miracle. 
	 * Enfin, on peut aussi décider de supprimer la méthode afficherPlanning et de laisser le développeur 
	 * gérer ses affichages dans le main, ce qui semble raisonnable aussi (mais encore, cela casse la
	 * compatibilité avec la version précédente).
	 */
	public Etudiant(int numeroEtu, String nom, Formation formation) {
		this(numeroEtu, nom, formation, null);
	}
	public Etudiant(int numeroEtu, String nom, Formation formation, AfficheurPlanning afficheur) {
		super();
		this.numeroEtu = numeroEtu;
		this.nom = nom;
		this.formation = formation;
		this.projets = new ArrayList<Projet>();
		this.joursTravailles = new ArrayList<Pair<Date,Projet>>();
		this.afficheur = afficheur;
	}




	/**
	 * Obtenir le nom
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}




	/**
	 * Modifier le nom
	 * @param nom le nouveau nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}




	/**
	 * Obtenir le numeroEtu
	 * @return le numeroEtu
	 */
	public int getNumeroEtu() {
		return numeroEtu;
	}




	/**
	 * Modifier le numeroEtu
	 * @param numeroEtu le nouveau numeroEtu
	 */
	public void setNumeroEtu(int numeroEtu) {
		this.numeroEtu = numeroEtu;
	}




	/**
	 * Obtenir la formation
	 * @return la formation
	 */
	public Formation getFormation() {
		return formation;
	}




	/**
	 * Modifier la formation
	 * @param formation la nouvelle formation
	 */
	public void setFormation(Formation formation) {
		this.formation = formation;
	}




	/**
	 * Obtenir la liste des projets
	 * @return la liste des projets
	 */
	public List<Projet> getProjets() {
		return projets;
	}




	/**
	 * Obtenir le planning de l'étudiant
	 * @return le planning
	 */
	public List<Pair<Date, Projet>> getJoursTravailles() {
		return joursTravailles;
	}




	/**
	 * Ajouter un nouveau projet
	 * @param projet nouveau projet
	 */
	protected void addProjet(Projet projet) {
		this.projets.add(projet);
	}

	/**
	 * Supprimer un projet
	 * @param projet Projet à supprimer
	 * @return Vrai ssi le projet était présent avant suppression
	 */
	protected boolean removeProjet(Projet projet) {
		return this.projets.remove(projet);
	}





	/**
	 * Ajouter un jour travaillé
	 * @param jour Jour à ajouter
	 * @param projet Le projet travaillé ce jour
	 */
	public void addJourTravaille(Date jour, Projet projet) {
		this.joursTravailles.add(new Pair<Date, Projet>(jour, projet));
	}




	/**
	 * Affiche le planning de l'étudiant dans la console
	 */
	/*
	 * Ici, on a choisi de conserver la méthode afficherPlanning.
	 * Cependant, le code concernant l'affichage à été déféré vers une autre classe,
	 * donc cela ne viole pas le principe de responsabilité unique.
	 */
	public void afficherPlanning() {
		this.afficheur.afficher(this);
	}
	
	// On ajoute alors un setter pour que le développeur puisse utiliser l'afficheur de son choix
	// ce qui permet d'être ouvert aux extensions en restant fermé aux modifications
	public void setAfficheurPlanning(AfficheurPlanning aff) {
		this.afficheur = aff;
	}

}
