package tp_solid.document;

import java.io.IOException;

public interface SavableDocument extends OpenableDocument {

	/**
	 * Enregistrer le fichier (remplace le fichier acctuel avec les données brutes (rawData) en mémoire)
	 * @throws IOException
	 */
	public void save() throws IOException;
	
}
