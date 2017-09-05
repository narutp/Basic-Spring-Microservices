package main.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import main.model.HelloWorld;

@Named
@Path("/")
public class HelloWorldRest {
	
	private HelloWorld hello;
	public HelloWorldRest() {
		if(hello==null)
		this.hello = new HelloWorld();
	}
	
	@GET
	@Path("hello")
	public String greeting(@QueryParam("name") String name ){
		hello.setHello(name);
		return hello.getHello();
	}
	
	@GET
	@Path("login/{name}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean loginAPI(@PathParam("name") String name, @PathParam("password") String password ){
		System.out.println("GET: /name/"+name+password);
		boolean check = hello.checkLogin(name, password);
		return check;
	}
	
	@GET
	@Path("register/{name}/{password}")
	@Produces(MediaType.TEXT_PLAIN)
	public boolean registerAPI(@PathParam("name") String name, @PathParam("password") String password ){
		hello.setNamePass(name, password);
		return true;
	}
}