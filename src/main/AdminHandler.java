package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminHandler {
	
	ArrayList<Admin> adminList = new ArrayList<>();
	File adminListFile = new File("AdminFile.csv");
	AdminFileWriter fw = new AdminFileWriter();
	AdminFileReader fr = new AdminFileReader ();
	
	
	public ArrayList<Admin> intialAdminList() {
		Admin admin1 = new Admin();
		
		admin1.setUserName("Dewey");
		admin1.setlastName("Decimal");
		admin1.setEmail("ddecimal@gmail.com");
		admin1.setPassword("melvil1876");
		adminList.add(admin1);
		
		return adminList;
	}
	
	public void addAdmin(Admin admin) {
		adminList.add(admin);
		fw.writeListToFile(adminList);
	}
	
	public void createAdminListFile() {
		if(adminListFile.exists()) {
			System.out.println("AdminFile.csv already exists");
			fr.readCsvFile("AdminFile.csv");
		}else {
			System.out.println("AdminFile.csv does not exist. Creating now...");
			adminList = intialAdminList();
			fw.writeListToFile(adminList);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("AdminFile.csv has been created");

		}

	}
	
	public boolean adminLogin(String email , String password)   {
		boolean stat=false;	
		ArrayList<Users> shadow=new ArrayList<Users>(adminList);
		for(Users user:shadow ){
			if(user.getEmail().toLowerCase().equals(email.toLowerCase()) || 
					user.getPassword().toLowerCase().equals(password.toLowerCase()))
				stat=true;

		}
		if(stat)
		{

			System.out.println("You are now logged in");

		}
		else {
			System.out.println("Sorry: wrong infomation");


		}
		return stat;


	}
	
	public void adminMenu(BookHandler bookHandler, UsersHandler usersHandler ) {
		Scanner menuKeyboard= new Scanner(System.in);
		int menu = -1;
		Menu userMenu = new Menu(7,"Welcome Admin User");
		userMenu.setMenuItem(1, "Search Books");
		userMenu.setMenuItem(2, "Add Book");
		userMenu.setMenuItem(3, "Remove Book");
		userMenu.setMenuItem(4, "User Search");
		userMenu.setMenuItem(5, "Modify User");
		userMenu.setMenuItem(6, "Add User");
		userMenu.setMenuItem(7, "Remove User");
		
		do {
			userMenu.runMenu();
			menu = menuKeyboard.nextInt();
			
			switch (menu) {
			case 0:
				break;
			case 1:
				System.out.println("Search Books");
				bookHandler.searchBooks();
				break;
			case 2:
				System.out.println("Add Book");
				Books book = bookHandler.createBook();
				bookHandler.addBook(book);
				break;
			case 3:
				System.out.println("Remove Book");
				bookHandler.removeBook();
				break;
			case 4:
				System.out.println("User Search");
				usersHandler.searchUsers();
				break;
			case 5:
				System.out.println("Modify User");
				Scanner modifyScan = new Scanner(System.in);
				System.out.println("Enter User Email");
				String userEmail = modifyScan.nextLine();
				usersHandler.modifyUser(userEmail);
				break;
			case 6:
				System.out.println("Add User");
				usersHandler.addUser();
				break;
			case 7:
				System.out.println("Remove User");
				usersHandler.removeUser();
				break;
			}
			
		}while(menu != 0);
		//menuKeyboard.close();
		
	}
	

}
