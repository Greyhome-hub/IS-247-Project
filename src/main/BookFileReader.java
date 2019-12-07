package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookFileReader {

	//CSV delimeters
	final String COMMA_DELIMETER = ",";
	
	//Attribute index
	private static final int BOOK_NAME = 0;
	private static final int BOOK_AUTHOR = 1;
	private static final int BOOK_GENRE = 2;
	private static final int BOOK_ID = 3;
	private static final int BOOK_PAGE_COUNT = 4;
	private static final int BOOK_PUBLICATION_DATE = 5;
	private static final int ISBN = 6;
	private static final int QUANTITY_AVAILABLE = 7;
	
	public ArrayList<Books> readCsvFile(String filename) {
		
		ArrayList<Books> bookList = new ArrayList<>();
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
					
					Books book = new Books();
					book.setBookTitle(tokens[BOOK_NAME]);
					book.setBookAuthor(tokens[BOOK_AUTHOR]);
					book.setBookGenre(tokens[BOOK_GENRE]);
					book.setBookID(Long.valueOf(tokens[BOOK_ID]));
					book.setBookPageCount(Long.valueOf(tokens[BOOK_PAGE_COUNT]));
					book.setBookPublicationDate(tokens[BOOK_PUBLICATION_DATE]);
					book.setISBN(Long.valueOf(tokens[ISBN]));
					book.setQuantityAvailable(Long.valueOf(tokens[QUANTITY_AVAILABLE]));
					bookList.add(book);

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
		return bookList;
		
	}

}
