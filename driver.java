import java.util.ArrayList;
import java.util.Scanner;

public class driver {


	public static void main(String[] args) {
		//String data;
		Scanner keyboard= new Scanner(System.in);
		int menu = 0;
		Users[] usersarr = new Users [20];

		// ArrayList Of Books
		ArrayList<Books> bookList = new ArrayList <Books>();
		// Creation of first book
		Books book1= new Books();
		bookList.add(book1);
		
		book1.setBookTitle("To Kill a Mockingbird");
		book1.setBookAuthor("Harper Lee");
		book1.setBookGenre("Drama");
		book1.setBookID(19873);
		book1.setBookPageCount(254);
		book1.setPublicationDate("12/23/2006");
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
		book2.setPublicationDate("12/23/2002");
		book2.setISBN(1213);
		book2.setQuantityAvailable(12);
		
		
		Books book3= new Books();
		bookList.add(book3);
		
		book3.setBookTitle("Our Stories Remember");
		book3.setBookAuthor("Aya Kitamora");
		book3.setBookGenre("Poems");
		book3.setBookID(9873);
		book3.setBookPageCount(253);
		book3.setPublicationDate("12/22/1999");
		book3.setISBN(1233);
		book3.setQuantityAvailable(23);
		
		Books book4= new Books();
		bookList.add(book4);
		
		book4.setBookTitle("Mary Creek's Blood");
		book4.setBookAuthor("John Kulala");
		book4.setBookGenre("Crime");
		book4.setBookID(23872);
		book4.setBookPageCount(465);
		book4.setPublicationDate("01/10/2003");
		book4.setISBN(8934);
		book4.setQuantityAvailable(33);
		
		Books book5= new Books();
		bookList.add(book5);
		
		book5.setBookTitle("Another Morning in Hell");
		book5.setBookAuthor("Van Leatherback");
		book5.setBookGenre("History");
		book5.setBookID(3784);
		book5.setBookPageCount(300);
		book5.setPublicationDate("01/02/1998");
		book5.setISBN(2345);
		book5.setQuantityAvailable(21);


		//Menu do-while into Switch Statement
		do{
			System.out.println("=====================================================================");
			System.out.println("                   Welcome to the Library                            \n");
			System.out.println("             Enter (1) for user registration          				 ");
			System.out.println("             Enter (2) for user login                 				 ");
			System.out.println("             Enter (3) for admin login                				 ");
			System.out.println("             Enter (0) to exit                			  			 ");

			menu = keyboard.nextInt();

			switch (menu) {

			case 1: System.out.println("User Registration\n");

			usersarr[0]= new Users("Name","Last Name", "email", "password");
			usersarr[0].usersRegistration();

			break;

			case 2: System.out.println("User Login\n");

			usersarr[0].usersLogin();
			break;

			case 3: System.out.println("Admin Login\n");
			break;


			}
		} while(menu != 0);





	}

	/**	System.out.println("Enter the user name");
			data= keyboard.nextLine();
			usersarr[0].setUserName(data);
			System.out.println(usersarr[0].userName);
			System.out.println("Enter the user's email");
			data=keyboard.nextLine();


			System.out.println("Enter the user email");
			usersarr[0].email=keyboard.next();


			System.out.println("Enter the user password");
			password=keyboard.next();
			usersarr[0].setPassword(password);

			usersarr[0]= new Users(userName, email, password); */
}


