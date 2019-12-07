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
		//bh1.intialBookList();
		//ah1.intialAdminList();
		//uh1.createUserArrayList();
		bh1.createBookListFile();
		ah1.createAdminListFile();
		uh1.createUserListFile();
		

		Menu menu1 = new Menu(3, "Welcome to the Library");
		menu1.setMenuItem(1, "User Registration");
		menu1.setMenuItem(2, "User Login");
		menu1.setMenuItem(3, "Admin Login");
		

		//Menu do-while into Switch Statement
		do{
			menu1.runMenu();
			uh1.userList = uh1.fr.readCsvFile("UsersFile.csv");
			bh1.bookList = bh1.fr.readCsvFile("BookFile.csv");
			ah1.adminList = ah1.fr.readCsvFile("AdminFile.csv");

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
				password = null;
				uh1.userMenu(uh1, bh1, activeUser);
				}
			uh1.fw.writeListToFile(uh1.userList);
			bh1.fw.writeListToFile(bh1.bookList);
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
			bh1.fw.writeListToFile(bh1.bookList);
			activeUser = null;
			break;

			default: menu = -1;
			activeUser = null;

			}
			
			
		} while(menu != 0);
		
		driverKeyboard.close();

	}

}


