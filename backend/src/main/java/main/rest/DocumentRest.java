package main.rest;

import java.util.Date;
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
	public boolean loginAPI(
			@PathParam("name") String name, 
			@PathParam("password") String password ){
		System.out.println("GET: /name/"+name+password);
		boolean check = userDAO.checkLogin(name, password);
		System.out.println(check);
		return check;
	}
	
	@GET
	@Path("register/{name}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean registerAPI(
			@PathParam("name") String name, 
			@PathParam("password") String password ){
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
	
	@GET
	@Path("get/all-doc/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Document> getAllDocumentAPI() {
		List<Document> docList = documentDAO.getAllDocuments();
		return docList;
	}
	
	@GET
	@Path("create/{title}/{writer}/{contents}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean createDocumentAPI(
			@PathParam("title") String title, 
			@PathParam("writer") String writer, 
			@PathParam("contents") String contents, 
			@PathParam("password") String password){
		int numId = documentDAO.getCountDocument()+1;
		String id = String.format("%04d", numId);
		doc.setId(id);
		if(title.equals(""))
			doc.setTitle("-");
		else
			doc.setTitle(title);
		if(writer.equals(""))
			doc.setWriter("-");
		else
			doc.setWriter(writer);
		if(contents.equals(""))
			doc.setContents("-");
		else
			doc.setContents(contents);
		doc.setPassword(password);
		Date date = new Date();
		doc.setCreatedDate(date);
		doc.setLastEditedDate(date);
		documentDAO.createDocument(doc);
		System.out.println("Set ID: " + doc.getId());
		System.out.println("Set Title: " + doc.getTitle());
		System.out.println("Set Writer: " + doc.getWriter());
		System.out.println("Set Contents: " + doc.getContents());
		System.out.println("Set Password: " + doc.getPassword());
		System.out.println("Set Created Date: " + doc.getCreatedDate());
		System.out.println("Set Last Edited Date: " + doc.getLastEditedDate());
		return true;
	}
}