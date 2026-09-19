/**
 * @author PPC - IUT Rodez
 * @version 2025
 */

package tp_solid.document;

import java.io.IOException;

public class DocumentSysteme extends AbstractOpenableDocument {
	
	private String os;
	
	// Pour enregistrer une copie, on utilise un document annexe (DONT ON n'HÉRITE SURTOUT PAS !)
	private DocumentNormal docPourLaCopie;

	public DocumentSysteme(String filename, String type, String os) {
		super(filename, type);
		this.os = os;
		this.docPourLaCopie = new DocumentNormal(filename + ".tmp", type);
	}
	
	
	
	/**
	 * Enregistre une copie du fichier sous filename+'.tmp'
	 */
	public void saveCopy() throws IOException {
		this.docPourLaCopie.setRawData(this.rawData);
		this.docPourLaCopie.save();
		System.err.println("Warning: Les documents systèmes sont en lecture "
				+ "seule, une copie du document a été enregistrée sous '"
				+ this.docPourLaCopie.getFilename() + "'.");
	}

	/**
	 * Obtenir le système d'exploitation associé
	 * @return Système d'exploitation
	 */
	public String getOs() {
		return os;
	}

	/**
	 * Modifier le système d'exploitation associé
	 * @param os Nouveau système d'exploitation
	 */
	public void setOs(String os) {
		this.os = os;
	}
	
	
}
