package database.filewriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import database.dao.HelloWorldDAO;
import main.model.HelloWorld;

public class FilewriterDAOimpl implements HelloWorldDAO {

	@Override
	public void create(HelloWorld hw) {
		String fileName = "user.txt";

		try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(hw.getName());
            bufferedWriter.newLine();
            bufferedWriter.write(hw.getPassword());

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '" + fileName + "'");
        }
	}

	@Override
	public List<HelloWorld> getAllHelloWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HelloWorld getHelloWorldByName(String name) {
		return null;
	}

	@Override
	public void updateHelloWorldByName(String name, HelloWorld hw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteHelloWorldByName(String name) {
		// TODO Auto-generated method stub
		
	}
	
}
