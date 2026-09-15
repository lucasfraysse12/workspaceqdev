/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.Document;

public class RevueDeSprint extends AbstractCptRDiapo implements CptRDiapo, CompteRendu {
	

	public RevueDeSprint(Document diaporama, Document texte) {
		super(diaporama, texte);
	}

}
