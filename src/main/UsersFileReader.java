package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersFileReader {

	//CSV delimiters
	final String COMMA_DELIMETER = ",";
	final String PLUS_DELIMETER = "\\+";

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
					String[] str1 = tokens[CHECKDBOOKS].split(PLUS_DELIMETER);
					Long[] long1 = new Long[str1.length];
					for(int i = 0; i < str1.length; i++) {long1[i] = Long.parseLong(str1[i]);}
					ArrayList<Long> al1 = new ArrayList<Long>(Arrays.asList(long1));
					
					String[] str2 = tokens[ALLCHECKDBOOKS].split(PLUS_DELIMETER);
					Long[] long2 = new Long[str2.length];
					for(int i = 0; i < str2.length; i++) {long2[i] = Long.parseLong(str2[i]);}
					ArrayList<Long> al2 = new ArrayList<Long>(Arrays.asList(long2));
					
					user.setCheckdBooks(al1);
					user.setAllcheckdBooks(al2);
					usersList.add(user);
				}

			}

		}catch(Exception e) {
			System.out.println("Error in User list CSV file reader!");
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			}catch (IOException e) {
				System.out.println("Error while closing user file reader!");
				e.printStackTrace();
			}
		}
		return usersList;

	}

}
