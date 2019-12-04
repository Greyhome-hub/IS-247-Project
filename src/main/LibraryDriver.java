package main;
import java.util.Scanner;


public class LibraryDriver {


	public static void main(String[] args) {
		//String data;
		Scanner driverKeyboard= new Scanner(System.in);
		int menu = -1;
		String activeUser = null;
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
		menu1.setMenuItem(1, "User Registration");
		menu1.setMenuItem(2, "User Login");
		menu1.setMenuItem(3, "Admin Login");
		

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
			if(loginSuccess == true) {
				activeUser = email;
				uh1.userMenu(bh1);
				}
			activeUser = null;

			break;

			case 3: System.out.println("Admin Login\n");
			Scanner adminLogin = new Scanner(System.in);
			System.out.println("Please enter email: ");
			String adminEmail = adminLogin.nextLine();
			System.out.println("Please enter password: ");
			String adminPassword = adminLogin.nextLine();
			
			boolean adminLoginSuccess = ah1.adminLogin(adminEmail, adminPassword);
			if(adminLoginSuccess == true) {
				activeUser = adminEmail;
				ah1.adminMenu(bh1, uh1);
				}
			activeUser = null;
			break;
			//ddecimal@gmail.com
			//melvil1876
			default: menu = -1;
			activeUser = null;

			}
			
			
		} while(menu != 0);
		
		driverKeyboard.close();

	}

}


