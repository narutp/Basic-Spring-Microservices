package main.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.web.client.RestTemplate;

import main.Application;
import main.model.Document;
import main.model.User;
import database.dao.*;
import database.filewriter.*;
import database.mongodb.MongoDAOImpl;

@Named
@Path("/")
public class DocumentRest {
	
	private User user;
	private Document doc;
	private ApplicationContext ctx = Application.database.getContext();
	private UserDAO userDAO = ctx.getBean("userDAO", UserDAO.class);
	private DocumentDAO documentDAO = ctx.getBean("documentDAO", DocumentDAO.class);
	
	@Inject
	private RestTemplate restemplate; 
	
	public DocumentRest() {
		this.user = new User();
		this.doc = new Document();
	}
	
	@GET
	@Path("login/{name}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean loginAPI(@PathParam("name") String name, @PathParam("password") String password ){
		System.out.println("GET: /name/"+name+password);
		boolean check = checkLogin(name, password);
		return check;
	}
	
	@GET
	@Path("register/{name}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean registerAPI(@PathParam("name") String name, @PathParam("password") String password ){
		user.setName(name);
		user.setPassword(password);
		userDAO.createUser(user);
		System.out.println("Set Name: " + user.getName());
		System.out.println("Set Pass: " + user.getPassword());
		return true;
	}
	
	@GET
	@Path("get/user/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserAPI(@PathParam("name") String name) {
		User user = userDAO.getUserByName(name);
		return user;
	}
	
	public boolean checkLogin(String name, String password) {
		List<User> userList = userDAO.getAllUsers();
		for(User user : userList) {
			if(name.equals(user.getName()) && password.equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}
}