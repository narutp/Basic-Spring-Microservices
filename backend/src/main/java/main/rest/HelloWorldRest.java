package main.rest;

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
import main.model.HelloWorld;
import database.dao.*;
import database.filewriter.*;
import database.mongodb.MongoDAOImpl;

@Named
@Path("/")
public class HelloWorldRest {
	
	private HelloWorld hello;
	private ApplicationContext ctx = Application.database.getContext();
	private HelloWorldDAO helloWorldDAO = ctx.getBean("helloWorldDAO", HelloWorldDAO.class);
	
	@Inject
	private RestTemplate restemplate; 
	
	public HelloWorldRest() {
		this.hello = new HelloWorld();
	}
	
	@GET
	@Path("login/{name}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean loginAPI(@PathParam("name") String name, @PathParam("password") String password ){
		System.out.println("GET: /name/"+name+password);
//		boolean check = hello.checkLogin(name, password);
		return true;
	}
	
	@GET
	@Path("register/{name}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean registerAPI(@PathParam("name") String name, @PathParam("password") String password ){
//		hello.setNamePass(name, password);
		hello.setName(name);
		hello.setPassword(password);
		helloWorldDAO.create(hello);
		return true;
	}
	
	@GET
	@Path("get/user/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public HelloWorld getUserAPI(@PathParam("name") String name) {
		HelloWorld hw = helloWorldDAO.getHelloWorldByName(name);
		return hw;
	}
}