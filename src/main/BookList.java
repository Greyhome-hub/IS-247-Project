package main;
import java.util.ArrayList;
import java.util.Scanner;

public class BookList extends Books{
	ArrayList<Books> bookList = new ArrayList<Books>();	
	public Books searchBooks() {
	Scanner keyboard= new Scanner(System.in);
    System.out.println("Which book are you searching for today?");
    String booksearch = keyboard.nextLine();

	for (Books book : bookList)
    {
        if (book.getBookTitle().contains(booksearch) || book.getBookAuthor().contains(booksearch))
        {
             return book; 
        }
    }
	
	keyboard.close();
    return null;   
}
	
	public void addBookToList() {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		keyboard.close();
		
		
	}
	
	
	

}
