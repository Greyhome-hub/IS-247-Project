package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdminFileWriter {

	public void writeListToFile(Admin admin) {

		//CSV delimeters
		final String COMMA_DELIMETER = ",";
		final String NEW_LINE_SEPARATOR = "\n";

		//CSV header
		final String FILE_HEADER = "userName, lastName, email, password";
		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter("AdminFile.csv");

			//write file header
			fileWriter.append(FILE_HEADER.toString());

			//new line after header
			fileWriter.append(NEW_LINE_SEPARATOR);

			fileWriter.append(admin.getUserName());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(admin.getlastName());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(admin.getEmail());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(admin.getPassword());
			fileWriter.append(COMMA_DELIMETER);

			System.out.println("CSV file was created successfully");
			fileWriter.close();

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

	public void writeListToFile(ArrayList<Admin> adminList) {

		//CSV delimeters
		final String COMMA_DELIMETER = ",";
		final String NEW_LINE_SEPARATOR = "\n";

		//CSV header
		final String FILE_HEADER = "userName, lastName, email, password";
		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter("AdminFile.csv");

			//write file header
			fileWriter.append(FILE_HEADER.toString());

			//new line after header
			fileWriter.append(NEW_LINE_SEPARATOR);

			for(Admin admin : adminList) {

				fileWriter.append(admin.getUserName());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(admin.getlastName());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(admin.getEmail());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(admin.getPassword());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully");
			fileWriter.close();

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}


