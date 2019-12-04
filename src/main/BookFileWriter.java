package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BookFileWriter {
	
	public void writeListToFile(Books book) {
		
		//CSV delimeters
		final String COMMA_DELIMETER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		
		//CSV header
		final String FILE_HEADER = "BookTitle,BookAuthor,BookGenre,BookId,BookPageCount,BookPublicationDate,ISBN,QuantityAvailable";
		FileWriter fileWriter = null;
		
		try {

			fileWriter = new FileWriter("BookFile.csv");

			//write file header
			fileWriter.append(FILE_HEADER.toString());
			
			//new line after header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			fileWriter.append(book.getBookTitle());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(book.getBookAuthor());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(book.getBookGenre());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(book.getBookIDString());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(book.getBookPageCountString());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(book.getBookPublicationDate());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(book.getISBNString());
			fileWriter.append(COMMA_DELIMETER);
			fileWriter.append(book.getQuantityAvailableString());
			
			System.out.println("CSV file was created successfully");
			fileWriter.close();

		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	public void writeListToFile(ArrayList<Books> bookList) {
		
		//CSV delimeters
		final String COMMA_DELIMETER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		
		//CSV header
		final String FILE_HEADER = "BookTitle,BookAuthor,Genre,BookId,BookPageCount,BookPublicationDate,ISBN,QuantityAvailable";
		FileWriter fileWriter = null;
		
		try {
			
			fileWriter = new FileWriter("BookFile.csv");
			
			//write file header
			fileWriter.append(FILE_HEADER.toString());
			
			//new line after header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			for(Books book : bookList) {
				
				fileWriter.append(book.getBookTitle());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(book.getBookAuthor());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(book.getBookGenre());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(book.getBookIDString());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(book.getBookPageCountString());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(book.getBookPublicationDate());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(book.getISBNString());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(book.getQuantityAvailableString());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			
			System.out.println("CSV file was created successfully");
			fileWriter.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
