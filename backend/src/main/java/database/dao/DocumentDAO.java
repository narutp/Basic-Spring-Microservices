package database.dao;

import java.util.List;

import main.model.Document;
import main.model.User;

public interface DocumentDAO {
	
	public void create (Document doc);
	
	public List<Document> getAllDocuments ();

}