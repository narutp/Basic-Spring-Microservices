package database.dao;

import java.util.List;

import main.model.HelloWorld;

public interface HelloWorldDAO {
	
	public void create (HelloWorld hw);
	
	public List<HelloWorld> getAllHelloWorld ();
	
	public HelloWorld getHelloWorldByName (String name);
	
	public void updateHelloWorldByName (String name, HelloWorld hw);
	
	public void deleteHelloWorldByName (String name);
}
