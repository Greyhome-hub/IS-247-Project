package main;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookHandler {

	ArrayList<Books> bookList = new ArrayList<Books>();	
	File bookListFile = new File("BookFile.csv");
	BookFileWriter fw = new BookFileWriter();
	BookFileReader fr = new BookFileReader();

	//getter/setter
	public ArrayList<Books> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Books> bookList) {
		this.bookList = bookList;
	}

	//book search
	public Books searchBooks() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which book are you searching for today?");
		String booksearch = keyboard.nextLine();
		//keyboard.close();

		for (Books book : bookList)
		{
			if (book.getBookTitle().contains(booksearch) || book.getBookAuthor().contains(booksearch))
			{
				System.out.println(book.getBookTitle());
				return book;
			}
			else
			{return null;}
		}
		return null;
	}
	
	public void addBook(Books book) {
		
		bookList.add(book);
		
	}

	//create book
	public Books createBook(Books book) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter book title: ");
		String bookTitle = keyboard.nextLine();
		book.setBookTitle(bookTitle);

		System.out.println("Enter author: ");
		String bookAuthor = keyboard.nextLine();
		book.setBookAuthor(bookAuthor);

		System.out.println("Enter genre: ");
		String bookGenre = keyboard.nextLine();
		book.setBookGenre(bookGenre);

		System.out.println("Enter book ID number: ");
		int bookID = keyboard.nextInt();
		book.setBookID(bookID);

		System.out.println("Enter page count: ");
		int bookPageCount = keyboard.nextInt();
		book.setBookPageCount(bookPageCount);

		System.out.println("Enter publication date: ");
		String bookPublicationDate = keyboard.nextLine();
		book.setBookPublicationDate(bookPublicationDate);

		System.out.println("Enter ISBN: ");
		int isbn = keyboard.nextInt();
		book.setISBN(isbn);

		System.out.println("Enter quantity available: ");
		int quantityAvailable = keyboard.nextInt();
		book.setQuantityAvailable(quantityAvailable);

		keyboard.close();
		return book;
	}
	

	public void removeBook () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which book are you removing today?");
		String bookToremove = keyboard.nextLine();

		for (Books book : bookList)
		{
			if (book.getBookTitle().contains(bookToremove) || book.getBookAuthor().contains(bookToremove))
			{
				int bookIndex = bookList.indexOf(book);
				bookList.remove(bookIndex);
				System.out.println("Book Removed");
				break;
			} else 
			{ System.out.println("That book is not in the library");
			}
			}
	}

	//initial book list
	public ArrayList<Books> intialBookList() {
		// Creation of first book
		Books book1= new Books();
		bookList.add(book1);

		book1.setBookTitle("To Kill a Mockingbird");
		book1.setBookAuthor("Harper Lee");
		book1.setBookGenre("Drama");
		book1.setBookID(19873);
		book1.setBookPageCount(254);
		book1.setBookPublicationDate("12/23/2006");
		book1.setISBN(12345);
		book1.setQuantityAvailable(12);



		//Creation of second book
		Books book2= new Books();
		bookList.add(book2);

		book2.setBookTitle("Never Again");
		book2.setBookAuthor("Ashish Shah");
		book2.setBookGenre("Poems");
		book2.setBookID(9873);
		book2.setBookPageCount(254);
		book2.setBookPublicationDate("12/23/2002");
		book2.setISBN(1213);
		book2.setQuantityAvailable(12);


		Books book3= new Books();
		bookList.add(book3);

		book3.setBookTitle("Our Stories Remember");
		book3.setBookAuthor("Aya Kitamora");
		book3.setBookGenre("Poems");
		book3.setBookID(9873);
		book3.setBookPageCount(253);
		book3.setBookPublicationDate("12/22/1999");
		book3.setISBN(1233);
		book3.setQuantityAvailable(23);

		Books book4= new Books();
		bookList.add(book4);

		book4.setBookTitle("Mary Creek's Blood");
		book4.setBookAuthor("John Kulala");
		book4.setBookGenre("Crime");
		book4.setBookID(23872);
		book4.setBookPageCount(465);
		book4.setBookPublicationDate("01/10/2003");
		book4.setISBN(8934);
		book4.setQuantityAvailable(33);

		Books book5= new Books();
		bookList.add(book5);

		book5.setBookTitle("Another Morning in Hell");
		book5.setBookAuthor("Van Leatherback");
		book5.setBookGenre("History");
		book5.setBookID(3784);
		book5.setBookPageCount(300);
		book5.setBookPublicationDate("01/02/1998");
		book5.setISBN(2345);
		book5.setQuantityAvailable(21);
		return bookList;
	}
	
	public void createBookListFile() {
		if(bookListFile.exists()) {
			System.out.println("BookFile.csv already exists");

		}else {
			System.out.println("BookFile.csv does not exist. Creating now...");
			bookList = intialBookList();
			fw.writeListToFile(bookList);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("BookFile.csv has been created");
			
		}
		
	}

}
