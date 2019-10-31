package main;

public class Books {

	protected	double bookID;
	protected	String bookTitle;
	protected	String bookAuthor;
	protected	String bookGenre;
	protected	double bookPageCount;
	protected	String bookPublicationDate;
	protected	double isbn;
	protected	String BookSummary;
	protected	int quantityAvailable;
	
	public Books() {
	}
	
	public Books(double bookID,String bookTitle,String bookAuthor,String bookGenre,double bookPageCount,String bookPublicationDate,double isbn,String BookSummary, int quantityAvailable ){
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
	public String getBookPublicationDate() {
		return bookPublicationDate;
	}
	public void setBookPublicationDate(String bookPublicationDate) {
		this.bookPublicationDate = bookPublicationDate;
	}
	public double getISBN() {
		return isbn;
	}
	public void setISBN(double isbn) {
		this.isbn = isbn;
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
