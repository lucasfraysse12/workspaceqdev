/**
 * @author PPC - IUT Rodez
 * @version 2025
 */
package tp_solid.document;

public class DocumentNormal extends AbstractSavableDocument {
	
	public DocumentNormal(String filename, String type) {
		super(filename, type);
		this.type = type;
	}

}
