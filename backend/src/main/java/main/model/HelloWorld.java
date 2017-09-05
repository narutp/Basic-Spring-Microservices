package main.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld {
	private String hello;
	private String name, password;
	
	public String getHello () {
		return hello;
	}

	public void setHello (String name) {
		hello = "Hello " + name;
	}

	public String getName () {
		return this.name;
	}
	
	public String getPassword () {
		return this.password;
	}
	
	public void setNamePass (String name, String password) {
		this.name = name;
		this.password = password;
		String fileName = "user.txt";

		try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(this.name);
            bufferedWriter.newLine();
            bufferedWriter.write(this.password);

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '" + fileName + "'");
        }
		System.out.println("Set complete!" + this.name + ", " + this.password);
	}

	public boolean checkLogin (String name, String password) {
		String fileName = "user.txt";
		String line = null;
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int i = 0;
            boolean checkName = false;
            boolean allCheck = false;
            while((line = bufferedReader.readLine()) != null) {
                if (checkName) {
                	if (line.equals(password)) {
                		allCheck = true;
                	}
                }
            	if (i == 0) {
                	if (line.equals(name)) {
                		checkName = true;
                	}
                }
                i++;
            	System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();
            if (allCheck)
            	return true;
            return false;
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");      
            return false;
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");    
            return false;
        }
	}
}
