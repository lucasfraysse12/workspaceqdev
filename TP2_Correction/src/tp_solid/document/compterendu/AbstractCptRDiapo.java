/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.DocumentNormal;

/**
 * Pour factoriser le code, on peut introduire une classe abstraite qui fournit une implémentation par défaut de la méthode getDiaporama.
 * Ici, elle hérite de AbstractCompteRendu et fournit donc aussi l'implémentation par défaut de la méthode getTexte qui y est définie.
 */
public class AbstractCptRDiapo extends AbstractCompteRendu implements CptRDiapo {
	
	private DocumentNormal diaporama;
	
	public AbstractCptRDiapo(DocumentNormal diaporama, DocumentNormal texte) {
		super(texte);
		this.diaporama = diaporama;
	}

	public void setDiaporama(DocumentNormal diaporama) {
		this.diaporama = diaporama;
	}

	@Override
	public DocumentNormal getDiaporama() {
		return diaporama;
	}



}
