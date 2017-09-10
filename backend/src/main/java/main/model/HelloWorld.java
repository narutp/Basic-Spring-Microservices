package main.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld {
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

//	public boolean checkLogin (String name, String password) {
//		String fileName = "user.txt";
//		String line = null;
//		try {
//            // FileReader reads text files in the default encoding.
//            FileReader fileReader = new FileReader(fileName);
//
//            // Always wrap FileReader in BufferedReader.
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            int i = 0;
//            boolean checkName = false;
//            boolean allCheck = false;
//            while((line = bufferedReader.readLine()) != null) {
//                if (checkName) {
//                	if (line.equals(password)) {
//                		allCheck = true;
//                	}
//                }
//            	if (i == 0) {
//                	if (line.equals(name)) {
//                		checkName = true;
//                	}
//                }
//                i++;
//            	System.out.println(line);
//            }   
//
//            // Always close files.
//            bufferedReader.close();
//            if (allCheck)
//            	return true;
//            return false;
//        }
//        catch(FileNotFoundException ex) {
//            System.out.println(
//                "Unable to open file '" + 
//                fileName + "'");      
//            return false;
//        }
//        catch(IOException ex) {
//            System.out.println(
//                "Error reading file '" 
//                + fileName + "'");    
//            return false;
//        }
//	}
}
