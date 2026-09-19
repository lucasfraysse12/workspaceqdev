package tp_solid.document;

import java.io.IOException;

public interface OpenableDocument {
	
	/**
	 * Obtenir le nom du fichier
	 * @return le nom de fichier
	 */
	public String getFilename();	
	
	/**
	 * Obtenir le type du fichier
	 * @return Type du fichier
	 */
	public String getType();
	
	/**
	 * Modifier le type du fichier
	 * @param type Nouveau type
	 */
	public void setType(String type);	

	/**
	 * Obtenir le contenu du fichier
	 * @return Donénes brutes
	 */
	public byte[] getRawData();
	
	/**
	 * Modifier le contenu du fichier
	 * @param data Nouvelles données
	 */
	public void setRawData(byte[] data);
	
	
	/**
	 * Lire les donénes brutes depuis le fichier. Ecrase les données brutes (rawData) actuellement en mémoire.
	 * @throws IOException
	 */
	public void open() throws IOException;
	
}
