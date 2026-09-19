/**
 * @author Pierre Pomeret-Coquot - IUT de Rodez
 - @version 2025
 */
package tp_solid.document.export;

/**
 * Exporation du document en mode 'txt'
 */
public abstract class AbstractExporteurDocuments implements ExporteurDocuments {
	
	private String encoding = "UTF-8";
	
	
	/**
	 * Obtenir l'encodage de caractères
	 * @return L'encodage
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * Modifier l'encodage de caractères
	 * @param encoding Le nouvel encodage
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

}
