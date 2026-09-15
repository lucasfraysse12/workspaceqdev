/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.Document;

public class AbstractCptRDiapo extends AbstractCompteRendu implements CptRDiapo {
	
	private Document diaporama;
	
	public AbstractCptRDiapo(Document diaporama, Document texte) {
		super(texte);
		this.diaporama = diaporama;
	}

	public void setDiaporama(Document diaporama) {
		this.diaporama = diaporama;
	}

	@Override
	public Document getDiaporama() {
		return diaporama;
	}



}
