package main;
import java.util.Scanner;


public class LibraryDriver {


	public static void main(String[] args) {
		//String data;
		Scanner driverKeyboard= new Scanner(System.in);
		int menu = -1;
		BookHandler bh1 = new BookHandler();
		AdminHandler ah1 = new AdminHandler();
		UsersHandler uh1 = new UsersHandler();
		//initialize lists
		bh1.intialBookList();
		bh1.createBookListFile();
		ah1.intialAdminList();
		ah1.createAdminListFile();
		uh1.createUserArrayList();
		uh1.createUserListFile();
		
		Menu menu1 = new Menu(3, "Welcome to the Library");
		menu1.setMenuItem(1, "user registration");
		menu1.setMenuItem(2, "user login");
		menu1.setMenuItem(3, "admin login");
		

		//Menu do-while into Switch Statement
		do{
			menu1.runMenu();

			menu = driverKeyboard.nextInt();
			
			switch (menu) {
			
			case 0: 
				break;

			case 1: System.out.println("User Registration\n");
			uh1.usersRegistration();

			break;

			case 2: System.out.println("User Login\n");
			Scanner login = new Scanner(System.in);
			System.out.println("Please enter email: ");
			String email = login.nextLine();
			System.out.println("Please enter password: ");
			String password = login.nextLine();
			
			boolean loginSuccess = uh1.usersLogin(email, password);
			if(loginSuccess == true) uh1.userMenu();
			

			break;

			case 3: System.out.println("Admin Login\n");
			
			break;
			
			case 4: System.out.println("Book Search\n");
			bh1.searchBooks();

			break;
			
			default: menu = -1;

			}
			
			
		} while(menu != 0);
		
		driverKeyboard.close();

	}

}


