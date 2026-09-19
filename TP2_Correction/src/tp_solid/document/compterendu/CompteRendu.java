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
 * L'interface que tous les comptes-rendus réalisent spécifie la méthode getTexte.
 */
public interface CompteRendu {
	
	/**
	 * obtenir le texte associé au compte-rendu
	 * @return Le texte
	 */
	DocumentNormal getTexte();
	

}
