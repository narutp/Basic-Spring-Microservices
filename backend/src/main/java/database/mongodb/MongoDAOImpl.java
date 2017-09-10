package database.mongodb;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

import database.dao.HelloWorldDAO;
import main.model.HelloWorld;

public class MongoDAOImpl implements HelloWorldDAO {
	
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
	public void create(HelloWorld hw) {
		System.out.println("DAO: Add new user");
		this.mongoOps.insert(hw, COLLECTION);
	}

	@Override
	public List<HelloWorld> getAllHelloWorld() {
		return this.mongoOps.findAll(HelloWorld.class, COLLECTION);
	}

	@Override
	public HelloWorld getHelloWorldByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		return this.mongoOps.findOne(query, HelloWorld.class, COLLECTION);
	}

	@Override
	public void updateHelloWorldByName(String name, HelloWorld hw) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		Update update = new Update();
		update.set("name", hw.getName());
		update.set("password", hw.getPassword());
		this.mongoOps.findAndModify(query, update, HelloWorld.class, COLLECTION);
	}

	@Override
	public void deleteHelloWorldByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		WriteResult result = this.mongoOps.remove(query, HelloWorld.class, COLLECTION);
	}

}
