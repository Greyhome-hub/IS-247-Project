package main;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookHandler {

	ArrayList<Books> bookList = new ArrayList<Books>();	
	File bookListFile = new File("BookFile.csv");
	BookFileWriter fw = new BookFileWriter();
	BookFileReader fr = new BookFileReader();
	
	Scanner keyboard = new Scanner(System.in);

	//getter/setter
	public ArrayList<Books> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Books> bookList) {
		this.bookList = bookList;
	}

	//book search
	public void searchBooks() {
		int menu = -1;
		Scanner keyboard = new Scanner(System.in);
		Menu searchMenu = new Menu(3, "Please choose search method:");
		searchMenu.setMenuItem(1, "Search by Title");
		searchMenu.setMenuItem(2, "Search by Author");
		searchMenu.setMenuItem(3, "Search by ID");
		
		do {
			boolean stat = false;
			searchMenu.runMenu();
			menu = keyboard.nextInt();
			Scanner search = new Scanner(System.in);
			switch (menu) {
			case 0:
				break;
			case 1: System.out.println("Enter Title");
			stat=false;
			String titleSearch = search.nextLine();
			
			for (Books book : bookList){
				if (book.getBookTitle().toLowerCase().contains(titleSearch.toLowerCase())){
					System.out.println(book.getBookTitle());
					System.out.println(book.getBookID());
					stat =true;
				}
			}
			
			if(stat == false)System.out.println("No results found");

			break;
			case 2: System.out.println("Enter Author");
			stat=false;
			
			String authorSearch = search.nextLine();
			
			for (Books book : bookList){
				if (book.getBookAuthor().toLowerCase().contains(authorSearch.toLowerCase())){
					System.out.println(book.getBookTitle());
					System.out.println(book.getBookID());
					stat =true;
				}
			}
			if(stat == false)System.out.println("No results found");
			
			break;
			case 3: System.out.println("Enter ID");
			stat=false;
			
			int idSearch = search.nextInt();
			
			for (Books book : bookList){
				if (book.getBookID() == idSearch){
					System.out.println(book.getBookTitle());
					System.out.println(book.getBookID());
					stat =true;
				}

			}
			if(stat == false)System.out.println("No results found");
			
			break;
			
			default: menu = -1;
			}

		}while(menu != 0);
	}

	public void addBook(Books book) {

		fr.readCsvFile("BookFile.csv");
		bookList.add(book);
		fw.writeListToFile(bookList);

	}

	//create book
	public Books createBook() {
		
		Books book = new Books();

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
		long bookID = keyboard.nextLong();
		book.setBookID(bookID);

		System.out.println("Enter page count: ");
		long bookPageCount = keyboard.nextLong();
		book.setBookPageCount(bookPageCount);

		System.out.println("Enter publication date: ");
		Scanner keyboard2 = new Scanner(System.in);
		String bookPublicationDate = keyboard2.nextLine();
		book.setBookPublicationDate(bookPublicationDate);

		System.out.println("Enter ISBN: ");
		long isbn = keyboard.nextLong();
		book.setISBN(isbn);

		System.out.println("Enter quantity available: ");
		long quantityAvailable = keyboard.nextLong();
		book.setQuantityAvailable(quantityAvailable);

		//keyboard.close();
		return book;
	}


	public void removeBook () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter book ID for removal:");
		long bookToremove = keyboard.nextLong();

		for (Books book : bookList)
		{
			if (book.getBookID() == bookToremove)
			{
				int bookIndex = bookList.indexOf(book);
				System.out.println("You are removing: " + book.getBookTitle() + "\nPress 1 to continue or 0 to cancel.");
				int i = keyboard.nextInt();
				if(i == 1) {
					bookList.remove(bookIndex);
					System.out.println("Book Removed");
					fw.writeListToFile(bookList);
				}
				else {System.out.println("Canceled");
				}
				break;
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
			fr.readCsvFile("BookFile.csv");

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

	public void displayBooks() {

		Iterator<Books> it = bookList.iterator(); 
		System.out.println("***********START DISPLAY*************\n\n");

		while(it.hasNext()) {
			Books book = it.next();
			System.out.println(book.getBookTitle() + " "+ book.getBookAuthor() + "  "+ book.getBookGenre() );	
		}

		System.out.println("***********END DISPLAY*************\n\n");

	}

	public void searchByTitle(String title) 
	{

		boolean stat=false;


		ArrayList<Books> shadow=new ArrayList<Books>(bookList);

		for(Books book:shadow ){
			if(book.getBookTitle().toLowerCase().contains(title.toLowerCase()))
				stat=true;		       
		}
		if(stat)
		{

			System.out.println("Book was found");
		}
		else {
			System.out.println("Sorry: book couldn't be found");


		}

	}

	public void searchByID(long ID) {
		boolean stat=false;	
		ArrayList<Books> shadow=new ArrayList<Books>(bookList);
		for(Books book:shadow ){
			if(book.getBookID() == ID )
			stat=true;
		}
		
		if(stat)
		{

			System.out.println("Book was found");

		}
		else {
			System.out.println("Sorry: book couldn't be found");


		}

	}
	
	public void bookDetails() {
		System.out.println("Enter Book ID:");
		long bookID = keyboard.nextLong();
		for (Books book : bookList){
			if (book.getBookID() == bookID){
				System.out.println("Title: "+book.getBookTitle());
				System.out.println("Author: "+book.getBookAuthor());
				System.out.println("Genre: "+book.getBookGenre());
				System.out.println("ID number: "+book.getBookID());
				System.out.println("Publication Date: "+book.getBookPublicationDate());
				System.out.println("Page Count: "+book.getBookPageCount());
				System.out.println("Copies Available: "+book.getQuantityAvailable());
				break;
			}
		}
		
	}
	
	public void bookCheckout(UsersHandler uh, String email) {
		Scanner checkoutKeyboard= new Scanner(System.in);
		System.out.println("Enter Book ID");
		long bookID = checkoutKeyboard.nextLong();
		for (Books book : bookList){
			if (book.getBookID() == bookID){
				long copies = book.getQuantityAvailable();
				if(copies > 0) {
					System.out.println("Title: "+book.getBookTitle());
					System.out.println("Author: "+book.getBookAuthor());
					System.out.println("Checkout? \n1: Yes \n2: No");
					int i = keyboard.nextInt();
					if(i == 1) {
						copies--;
						book.setQuantityAvailable(copies);
						uh.addCheckedBook(email, bookID);
						fw.writeListToFile(bookList);
						System.out.println("Successfully checked out" + book.getBookTitle());
						break;
					}
				}else {System.out.println("No copies available.");}
			}
		}
	}
	
	public void bookCheckIn(long bookID) {
		for(Books book: bookList) {
			if(book.getBookID() == bookID) {
				long copies = book.getQuantityAvailable();
				copies++;
				book.setQuantityAvailable(copies);
			}
		}
		
	}
		

}
