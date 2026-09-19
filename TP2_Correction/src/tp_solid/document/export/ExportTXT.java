/**
 * @author Pierre Pomeret-Coquot - IUT de Rodez
 - @version 2025
 */
package tp_solid.document.export;

import java.io.IOException;
import java.util.List;

import tp_solid.document.DocumentNormal;
import tp_solid.document.OpenableDocument;

/**
 * Exporation du document en mode 'txt'
 */
public class ExportTXT extends AbstractExporteurDocuments implements ExporteurDocuments {
	
	/**
	 * Exporte un ensemble de documents en mode txt
	 * @param documents documents à exporter
	 * filename Fichier d'export
	 * @throws IOException 
	 */
	public void exporter(List<OpenableDocument> documents, String filename) throws IOException {
		DocumentNormal docExport = new DocumentNormal(filename, "txt");
		String contenu = "";
		for (OpenableDocument doc : documents) {
			doc.open();
			contenu = contenu +  "--------------------\nDocument '" + doc.getFilename() + "\n--------------------\n" + new String(doc.getRawData()) + "\n--------------------\n\n\n";
		}
		docExport.setRawData(contenu.getBytes());
		docExport.save();
	}
}
