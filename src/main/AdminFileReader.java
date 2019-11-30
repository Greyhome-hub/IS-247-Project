package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AdminFileReader {

	//CSV delimeters
	final String COMMA_DELIMETER = ",";

	//Attribute index
	private static final int USER_NAME = 0;
	private static final int LAST_NAME = 1;
	private static final int EMAIL = 2;
	private static final int PASSWORD = 3;

	public ArrayList<Admin> readCsvFile(String filename) {

		ArrayList<Admin> adminList = new ArrayList<>();
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

					Admin admin = new Admin();
					admin.setUserName(tokens[USER_NAME]);
					admin.setlastName(tokens[LAST_NAME]);
					admin.setEmail(tokens[EMAIL]);
					admin.setPassword(tokens[PASSWORD]);
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
		return adminList;

	}
}
