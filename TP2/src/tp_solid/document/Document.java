/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid.document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Document extends AbstractDoc{

	public Document(String filename, String type) {
		super(filename, type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Enregistrer le fichier (remplace le fichier acctuel avec les données brutes (rawData) en mémoire)
	 * @throws IOException
	 */
	public void save() throws IOException {
		Files.write(Paths.get(filename), rawData);
	}

}
