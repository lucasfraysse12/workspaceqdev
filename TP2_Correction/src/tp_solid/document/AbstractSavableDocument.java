package tp_solid.document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AbstractSavableDocument extends AbstractOpenableDocument implements SavableDocument {

	
	
	public AbstractSavableDocument(String filename, String type) {
		super(filename, type);
	}
	
	
	public void save() throws IOException {
		Files.write(Paths.get(filename), rawData);
	}
}
