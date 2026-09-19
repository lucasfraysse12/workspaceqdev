/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.DocumentNormal;

/**
 * Les revues de sprint ont un texte et un diaporama. Les méthodes getTexte et getDiaporama sont fournies par la classe mère (abstraite), donc
 * il ne reste plus rien à faire.
 */
public class RevueDeSprint extends AbstractCptRDiapo implements CptRDiapo, CompteRendu {
	

	public RevueDeSprint(DocumentNormal diaporama, DocumentNormal texte) {
		super(diaporama, texte);
	}

}
