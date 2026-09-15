/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document.compterendu;

import tp_solid.document.Document;

public interface CptRDiapo extends CompteRendu {
	
	
	/**
	 * Obtenir le diaporama associé au compte-rendu
	 * @return Le diaporama
	 */
	Document getDiaporama();

}
