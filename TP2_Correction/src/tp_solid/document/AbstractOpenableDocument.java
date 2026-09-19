package tp_solid.document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AbstractOpenableDocument implements OpenableDocument {

	String filename;
	byte[] rawData;
	String type;
	
	
	public AbstractOpenableDocument(String filename, String type) {
		this.filename = filename;
		this.type = type;
	}
	
	/**
	 * Obtenir le nom du fichier
	 * @return le nom de fichier
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * Modifier le nom du fichier
	 * @param filename Nouveau nom de fichier
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * Obtenir le contenu du fichier
	 * @return Donénes brutes
	 */
	public byte[] getRawData() {
		return rawData;
	}
	
	/**
	 * Modifier le contenu du fichier
	 * @param data Nouvelles données
	 */
	public void setRawData(byte[] data) {
		this.rawData = data;
	}	
	
	/**
	 * Obtenir le type du fichier
	 * @return Type du fichier
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Modifier le type du fichier
	 * @param type Nouveau type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	/**
	 * Lire les donénes brutes depuis le fichier. Ecrase les données brutes (rawData) actuellement en mémoire.
	 * @throws IOException
	 */
	public void open() throws IOException {
		rawData = Files.readAllBytes(Paths.get(filename));
	}

}
