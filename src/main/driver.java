package main;
import java.util.Scanner;


public class driver {


	public static void main(String[] args) {
		//String data;
		Scanner keyboard= new Scanner(System.in);
		int menu = 0;
		Users[] usersarr = new Users [20];

		BookHandler bh1 = new BookHandler();
		bh1.intialBookList();
		
		Menu menu1 = new Menu(4, "Welcome to the Library");
		menu1.setMenuItem(1, "user registration");
		menu1.setMenuItem(2, "user login");
		menu1.setMenuItem(3, "admin login");
		menu1.setMenuItem(4, "book search");


		//Menu do-while into Switch Statement
		do{
			menu1.runMenu();


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
			
			case 4: System.out.println("Book Search\n");
			bh1.searchBooks();

			break;


			}
		} while(menu != 0);
		
		keyboard.close();





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


