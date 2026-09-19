/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.DocumentNormal;

/**
 * Pour factoriser le code, on peut introduire une classe abstraite qui fournit une implémentation par défaut de la méthode getTexte
 */
public class AbstractCompteRendu implements CompteRendu {
	
	private DocumentNormal texte;

	public AbstractCompteRendu(DocumentNormal texte) {
		this.texte = texte;
	}
	

	@Override
	public DocumentNormal getTexte() {
		return texte;
	}
	
	public void setTexte(DocumentNormal texte) {
		this.texte = texte;
	}

}
