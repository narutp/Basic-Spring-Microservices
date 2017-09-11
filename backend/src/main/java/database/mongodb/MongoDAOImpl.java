package database.mongodb;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

import main.model.Document;
import database.dao.DocumentDAO;
import database.dao.UserDAO;
import main.model.User;

public class MongoDAOImpl implements UserDAO, DocumentDAO {
	
	private MongoOperations mongoOps;
	private static final String COLLECTION = MongoDBMain.getCollection();
	public static final MongoClient mongo = MongoDBMain.getMongoClient();
	
	public MongoDAOImpl (MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}
	
	public MongoDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void createUser(User user) {
		System.out.println("DAO: Add new user");
		this.mongoOps.insert(user, COLLECTION);
	}

	@Override
	public List<User> getAllUsers() {
		return this.mongoOps.findAll(User.class, COLLECTION);
	}

	@Override
	public User getUserByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return this.mongoOps.findOne(query, User.class, COLLECTION);
	}

	@Override
	public void updateUserByName(String name, User user) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		Update update = new Update();
		update.set("name", user.getName());
		update.set("password", user.getPassword());
		this.mongoOps.findAndModify(query, update, User.class, COLLECTION);
	}

	@Override
	public void deleteUserByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		WriteResult result = this.mongoOps.remove(query, User.class, COLLECTION);
	}

	@Override
	public void create(Document doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Document> getAllDocuments() {
		// TODO Auto-generated method stub
		return null;
	}
}
