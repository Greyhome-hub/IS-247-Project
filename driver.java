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


