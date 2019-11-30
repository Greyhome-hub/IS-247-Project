package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UsersHandler {
	ArrayList<Users> userList = new ArrayList <Users>();
	File userListFile = new File ("UsersFile.csv");

	UsersFileWriter fw = new UsersFileWriter();
	UsersFileReader fr = new UsersFileReader();




	public void usersRegistration() {
		Scanner keyboard= new Scanner(System.in);
		Users user = new Users();

		System.out.println("To register a user, please enter the following information\n");
		System.out.println("Enter the user name :\n ");
		String userName= keyboard.next();
		user.setUserName(userName);
		String lastName=keyboard.next();
		user.setlastName(lastName);
		
		
		System.out.println("Enter the user email :\n ");
		String email= keyboard.next();
		user.setEmail(email);
		System.out.println("Enter the user password :\n ");
		String password=keyboard.next();
		user.setPassword(password);
		System.out.println("Congratulations, " + userName+" \nYou are now registered");
		userList.add(user);
		//keyboard.close();
	}
	
	public ArrayList<Users> createUserArrayList() {
		ArrayList<Users> arrayOfUsers = new ArrayList<>();
		// creating 20 users
		Users user1 = new Users();
		userList.add(user1);
		user1.setUserName("James");
		user1.setlastName("Carrew");
		user1.setEmail("jcarrew@gmail.com");
		user1.setPassword("ddgrewr.11");


		Users user2 = new Users();
		userList.add(user2);
		user2.setUserName("Janovy");
		user2.setlastName("Carey");
		user2.setEmail("jcarey@gmail.com");
		user2.setPassword("ffr.11");


		Users user3 = new Users();
		userList.add(user3);
		user3.setUserName("Luck");
		user3.setlastName("Scotty");
		user3.setEmail("ls@gmail.com");
		user3.setPassword("dmamai.11");

		Users user4 = new Users();
		userList.add(user4);
		user4.setUserName("Jimmy");
		user4.setlastName("DeuxFois");
		user4.setEmail("jd@gmail.com");
		user4.setPassword("d443");

		Users user5 = new Users();
		userList.add(user5);
		user5.setUserName("Mamaye");
		user5.setlastName("Bamba");
		user5.setEmail("mamayeb@gmail.com");
		user5.setPassword("dd22wr.11");


		Users user6 = new Users();
		userList.add(user6);
		user6.setUserName("Miji");
		user6.setlastName("Mattews");
		user6.setEmail("mm11@gmail.com");
		user6.setPassword("ddgreijfo.2");


		Users user7 = new Users();
		userList.add(user7);
		user7.setUserName("Jammal");
		user7.setlastName("Zemmour");
		user7.setEmail("jzemmour@gmail.com");
		user7.setPassword("iejej.233");

		return arrayOfUsers;
	}

	public void createUserListFile () {
		if (userListFile.exists()) {
			System.out.println("UsersFile.csv already exists");
		}
		else {
			System.out.println("UsersFile.csv does not exist. Creating now...");
			userList = createUserArrayList();
			fw.writeListToFile(userList);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("UsersFile.csv has been created");

		}
	}


	public boolean usersLogin(String email , String password)   {
		boolean stat=false;	
		ArrayList<Users> shadow=new ArrayList<Users>(userList);
		//Books book;
		for(Users user:shadow ){
			if(user.getEmail().toLowerCase().equals(email.toLowerCase()) && 
					user.getPassword().toLowerCase().equals(password.toLowerCase()))
				stat=true;

		}
		if(stat)
		{

			System.out.println("You are now logged in");
			return stat;

		}
		else {
			System.out.println("Sorry: wrong infomation");
			return stat;


		}

	}


	public void addUser(Users userObject) {
		userList.add(userObject);

	}

	public void displayUsers() {

		Iterator<Users> it = userList.iterator(); 
		System.out.println("***********START DISPLAY*************\n\n");

		while(it.hasNext()) {
			Users user = it.next();
			System.out.println(user.getUserName() + " "+ user.getlastName() + "  "+ user.getEmail()+ "  "+ user.getPassword()) ;	
		}

		System.out.println("***********END DISPLAY*************\n\n");

	}
	
	public void userMenu() {
		Scanner menuKeyboard= new Scanner(System.in);
		int menu = -1;
		Menu userMenu = new Menu(3,"Welcome User");
		userMenu.setMenuItem(1, "Search Books");
		userMenu.setMenuItem(2, "Book Details");
		userMenu.setMenuItem(3, "Book Checkout");
		
		do {
			userMenu.runMenu();
			menu = menuKeyboard.nextInt();
			
			switch (menu) {
			case 0:
				break;
			case 1:
				System.out.println("Search Books");
				break;
			case 2:
				System.out.println("Book Details");
				break;
			case 3:
				System.out.println("Book Checkout");
				break;
			}
			
		}while(menu != 0);
		//menuKeyboard.close();
		
	}

}
