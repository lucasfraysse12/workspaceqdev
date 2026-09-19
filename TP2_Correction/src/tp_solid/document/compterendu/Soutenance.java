/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.DocumentNormal;

/**
 * Les soutenances un texte et un diaporama. Les méthodes getTexte et getDiaporama sont fournies par la classe mère (abstraite), donc
 * il ne reste plus rien à faire.
 */
public class Soutenance extends AbstractCptRDiapo {
	
	public Soutenance(DocumentNormal diaporama, DocumentNormal texte) {
		super(diaporama, texte);
	}
}
