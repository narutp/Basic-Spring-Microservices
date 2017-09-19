package database.dao;

import java.util.List;
import main.model.Document;

public interface DocumentDAO {
	
	public List<Document> getAllDocuments ();

	public void createDocument (Document doc);
	
	public void editDocument (Document doc, String id);
	
	public Document getDocumentById (String id);
	
	public void deleteDocumentById (String id);

}