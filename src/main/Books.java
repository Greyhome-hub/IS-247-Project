package main;
import java.util.Scanner;

public class Books {

	private	double bookID;
	private	String bookTitle;
	private	String bookAuthor;
	private	String bookGenre;
	private	double bookPageCount;
	private	String publicationDate;
	private	double ISBN;
	private	String BookSummary;
	private	int quantityAvailable;
	
	public Books() {
	}
	
	public Books(double bookID,String bookTitle,String bookAuthor,String bookGenre,double bookPageCount,String publicationDate,double ISBN,String BookSummary, int quantityAvailable ){
		this.bookID=bookID;
		this.bookTitle= bookTitle;
		this.bookAuthor= bookAuthor;
		this.bookGenre= bookGenre;
		this.bookPageCount=bookPageCount;
		this.publicationDate= publicationDate;
		this.ISBN= ISBN;
		this.BookSummary=BookSummary;
		this.quantityAvailable= quantityAvailable;
		
	}
	
	
//	public Books searchBooks() {
//		Scanner keyboard= new Scanner(System.in);
//	    System.out.println("Which book are you searching for today?");
//	    String booksearch = keyboard.nextLine();
//	    for (Books book : bookList)
//	    {
//	        if (book.getBookTitle().contains(booksearch) || book.getBookAuthor().contains(booksearch))
//	        {
//	             return book; 
//	        }
//	    }
//	    return null;
//	}
	public double getBookID() {
		return bookID;
	}
	public void setBookID(double bookID) {
		this.bookID = bookID;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public double getBookPageCount() {
		return bookPageCount;
	}
	public void setBookPageCount(double bookPageCount) {
		this.bookPageCount = bookPageCount;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public double getISBN() {
		return ISBN;
	}
	public void setISBN(double iSBN) {
		ISBN = iSBN;
	}
	public String getBookSummary() {
		return BookSummary;
	}
	public void setBookSummary(String bookSummary) {
		BookSummary = bookSummary;
	}
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	
}
