package main;
import java.util.ArrayList;
import java.util.Scanner;

public class BookList extends Books{
	ArrayList<Books> bookList = new ArrayList<Books>();	
	
	public Books searchBooks() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which book are you searching for today?");
		String booksearch = keyboard.nextLine();
		keyboard.close();

		for (Books book : bookList)
		{
			if (book.getBookTitle().contains(booksearch) || book.getBookAuthor().contains(booksearch))
			{
				return book; 
			}
		}

		return null;   
	}
	
	public void addBookToList() {
		
		Scanner keyboard = new Scanner(System.in);
		
		Books book= new Books();
		bookList.add(book);
		
		System.out.println("Enter book title: ");
		book.setBookTitle(bookTitle = keyboard.nextLine());
		
		System.out.println("Enter author: ");
		book.setBookAuthor(bookAuthor = keyboard.nextLine());
		
		System.out.println("Enter genre: ");
		book.setBookGenre(bookGenre = keyboard.nextLine());
		
		System.out.println("Enter book ID number: ");
		book.setBookID(bookID = keyboard.nextInt());
		
		System.out.println("Enter page count: ");
		book.setBookPageCount(bookPageCount = keyboard.nextInt());
		
		System.out.println("Enter publication date: ");
		book.setBookPublicationDate(bookPublicationDate = keyboard.nextLine());
		
		System.out.println("Enter ISBN: ");
		book.setISBN(isbn = keyboard.nextInt());
		
		System.out.println("Enter quantity available: ");
		book.setQuantityAvailable(quantityAvailable = keyboard.nextInt());
		
		keyboard.close();
		
		
	}
	
	
	

}
