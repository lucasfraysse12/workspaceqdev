/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.DocumentNormal;

/**
 * Les rapports n'ont pas de diaporama. La méthode getTexte est fournie par la classe mère (abstraite), donc
 * il ne reste plus rien à faire.
 */
public class Rapport extends AbstractCompteRendu implements CompteRendu {

	public Rapport(DocumentNormal texte) {
		super(texte);
	}
}
