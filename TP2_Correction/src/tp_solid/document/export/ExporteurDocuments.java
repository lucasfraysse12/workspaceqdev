/**
 * @author Pierre Pomeret-Coquot - IUT de Rodez
 - @version 2025
 */
package tp_solid.document.export;

import java.io.IOException;
import java.util.List;

import tp_solid.document.OpenableDocument;

/**
 * Exporation du document en mode 'txt'
 */
public interface ExporteurDocuments {
	
	
	/**
	 * Obtenir l'encodage de caractères
	 * @return L'encodage
	 */
	public String getEncoding();

	/**
	 * Modifier l'encodage de caractères
	 * @param encoding Le nouvel encodage
	 */
	public void setEncoding(String encoding);

	/**
	 * Exporte un ensemble de documents en mode txt
	 * @param documents documents à exporter
	 * filename Fichier d'export
	 * @throws IOException 
	 */
	public void exporter(List<OpenableDocument> documents, String filename) throws IOException;
}
