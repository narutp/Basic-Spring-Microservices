package main.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class User {
	private String name, password;
	
	public String getName () {
		return this.name;
	}
	
	public String getPassword () {
		return this.password;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setPassword (String pass) {
		this.password = pass;
	}
}
