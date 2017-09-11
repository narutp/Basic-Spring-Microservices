package database.filewriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import database.dao.UserDAO;
import main.model.User;

public class FilewriterDAOimpl implements UserDAO {

	@Override
	public void createUser (User user) {
		String fileName = "user.txt";

		try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(user.getName());
            bufferedWriter.newLine();
            bufferedWriter.write(user.getPassword());

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '" + fileName + "'");
        }
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserByName(String name, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserByName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
