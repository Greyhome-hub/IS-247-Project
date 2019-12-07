package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UsersFileWriter {
	
	public void writeListToFile(Users users) {

		//CSV delimeters
		final String COMMA_DELIMETER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		final String PLUS_DELIMETER = "+";


		//CSV header
		final String FILE_HEADER = "userName, lastName, email, password, checkdBooks, AllcheckdBooks";
		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter("UsersFile.csv");

			//write file header
			fileWriter.append(FILE_HEADER.toString());

			//new line after header
			fileWriter.append(NEW_LINE_SEPARATOR);

			fileWriter.append(users.getUserName());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(users.getlastName());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(users.getEmail());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(users.getPassword());
			fileWriter.append(COMMA_DELIMETER);
			String checkd = String.join(PLUS_DELIMETER, users.getCheckdBooks().toString());
			fileWriter.append(checkd);
			fileWriter.append(COMMA_DELIMETER);
			String allCheckd = String.join(PLUS_DELIMETER, users.getAllcheckdBooks().toString());
			fileWriter.append(allCheckd);

			System.out.println("CSV file was created successfully");
			fileWriter.close();

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public void writeListToFile(ArrayList<Users> usersList) {

		//CSV delimiters
		final String COMMA_DELIMETER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		final String PLUS_DELIMETER = "+";

		//CSV header
		final String FILE_HEADER = "userName, lastName, email, password";
		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter("UsersFile.csv");

			//write file header
			fileWriter.append(FILE_HEADER.toString());

			//new line after header
			fileWriter.append(NEW_LINE_SEPARATOR);

			for(Users users : usersList) {

				fileWriter.append(users.getUserName());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(users.getlastName());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(users.getEmail());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(users.getPassword());
				fileWriter.append(COMMA_DELIMETER);
				//take array list of checked out books and convert it to string with each item
				//separated by a + delimiter
				ArrayList<Long> checkdArray = new ArrayList<>(users.getCheckdBooks());
				ArrayList<String> checkdStringArray = new ArrayList<>();
				for(Long longs : checkdArray) {checkdStringArray.add(longs.toString());}
				String checkd = String.join(PLUS_DELIMETER, checkdStringArray);
				fileWriter.append(checkd);
				fileWriter.append(COMMA_DELIMETER);
				ArrayList<Long> allCheckdArray = new ArrayList<>(users.getCheckdBooks());
				ArrayList<String> allCheckdStringArray = new ArrayList<>();
				for(Long longs : allCheckdArray) {allCheckdStringArray.add(longs.toString());}
				String allCheckd = String.join(PLUS_DELIMETER, allCheckdStringArray);
				fileWriter.append(allCheckd);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully");
			fileWriter.close();

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
