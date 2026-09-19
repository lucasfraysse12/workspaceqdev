/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.DocumentNormal;

/**
 * Les différents comptes-rendus ont tous une méthode getTexte, mais pas tous une méthode getDiaporama. 
 * Il faut donc découper l'interface en deux interfaces séparées, afin que seules les classes concernées
 * aient "getDiaporama" dans leur spécification.
 * 
 * L'interface que seules les classes Soutenance et RevueDeSprint réalisent spécifie la méthode getDiaporama.
 * Puisque l'interface hérite de CompteRendu, elle spécifie aussi getTexte
 */
public interface CptRDiapo extends CompteRendu {
	
	
	/**
	 * Obtenir le diaporama associé au compte-rendu
	 * @return Le diaporama
	 */
	DocumentNormal getDiaporama();

}
