package main;

public class Books {

	protected	long bookID;
	protected	String bookTitle;
	protected	String bookAuthor;
	protected	String bookGenre;
	protected	long bookPageCount;
	protected	String bookPublicationDate;
	protected	long isbn;
	protected	String BookSummary;
	protected	long quantityAvailable;
	
	public Books() {
	}
	
	public Books(long bookID,String bookTitle,String bookAuthor,String bookGenre,long bookPageCount,String bookPublicationDate,long isbn,String BookSummary, long quantityAvailable ){
		this.bookID=bookID;
		this.bookTitle= bookTitle;
		this.bookAuthor= bookAuthor;
		this.bookGenre= bookGenre;
		this.bookPageCount=bookPageCount;
		this.bookPublicationDate= bookPublicationDate;
		this.isbn= isbn;
		this.BookSummary=BookSummary;
		this.quantityAvailable= quantityAvailable;
		
	}
	
	public String getBookID() {
		return Long.toString(bookID);
	}
	public void setBookID(long bookID) {
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
	public String getBookPageCount() {
		return Long.toString(bookPageCount);
	}
	public void setBookPageCount(long bookPageCount) {
		this.bookPageCount = bookPageCount;
	}
	public String getBookPublicationDate() {
		return bookPublicationDate;
	}
	public void setBookPublicationDate(String bookPublicationDate) {
		this.bookPublicationDate = bookPublicationDate;
	}
	public String getISBN() {
		return Long.toString(isbn);
	}
	public void setISBN(long isbn) {
		this.isbn = isbn;
	}
	public String getBookSummary() {
		return BookSummary;
	}
	public void setBookSummary(String bookSummary) {
		BookSummary = bookSummary;
	}
	public String getQuantityAvailable() {
		return Long.toString(quantityAvailable);
	}
	public void setQuantityAvailable(long quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	
}
