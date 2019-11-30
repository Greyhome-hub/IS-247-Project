package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UsersFileReader {

	//CSV delimiters
	final String COMMA_DELIMETER = ",";
	final String PLUS_DELIMETER = "+";

	//Attribute index
	private static final int USER_NAME = 0;
	private static final int LAST_NAME = 1;
	private static final int EMAIL = 2;
	private static final int PASSWORD = 3;
	private static final int CHECKDBOOKS = 4;
	private static final int ALLCHECKDBOOKS = 5;


	public ArrayList<Users> readCsvFile(String filename) {

		ArrayList<Users> usersList = new ArrayList<>();
		BufferedReader fileReader = null;

		try {

			String line = "";
			//create file reader
			fileReader = new BufferedReader(new FileReader(filename));

			//read file header
			fileReader.readLine();

			//read file line starting after header

			while((line = fileReader.readLine()) != null) {
				//get all tokens available in line
				String[] tokens = line.split(COMMA_DELIMETER);
				if (tokens.length > 0) {

					Users user = new Users();
					user.setUserName(tokens[USER_NAME]);
					user.setlastName(tokens[LAST_NAME]);
					user.setEmail(tokens[EMAIL]);
					user.setPassword(tokens[PASSWORD]);
					user.setCheckdBooks(tokens[CHECKDBOOKS].split(PLUS_DELIMETER));
					user.setAllcheckdBooks(tokens[ALLCHECKDBOOKS].split(PLUS_DELIMETER));


				}

			}

		}catch(Exception e) {
			System.out.println("Error in Book list CSV file reader!");
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			}catch (IOException e) {
				System.out.println("Error while closing book file reader!");
				e.printStackTrace();
			}
		}
		return usersList;

	}

}
