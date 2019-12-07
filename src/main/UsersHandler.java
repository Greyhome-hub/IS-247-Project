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
		ArrayList<Long> longList = new ArrayList<>();
		longList.add((long) 0);
		System.out.println("To register a user, please enter the following information\n");
		System.out.println("Enter the user name, first and last:\n ");
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
		user.setCheckdBooks(longList);
		user.setAllcheckdBooks(longList);
		System.out.println("Congratulations, " + userName+" \nYou are now registered");
		userList.add(user);
		fw.writeListToFile(userList);
		//keyboard.close();
	}
	
	public ArrayList<Users> createUserArrayList() {
		ArrayList<Users> arrayOfUsers = new ArrayList<>();
		ArrayList<Long> longList = new ArrayList<>();
		longList.add((long) 0);
		// creating 20 users
		Users user1 = new Users();
		arrayOfUsers.add(user1);
		user1.setUserName("James");
		user1.setlastName("Carrew");
		user1.setEmail("jcarrew@gmail.com");
		user1.setPassword("ddgrewr.11");
		user1.setCheckdBooks(longList);
		user1.setAllcheckdBooks(longList);
		



		Users user2 = new Users();
		arrayOfUsers.add(user2);
		user2.setUserName("Janovy");
		user2.setlastName("Carey");
		user2.setEmail("jcarey@gmail.com");
		user2.setPassword("ffr.11");
		user2.setCheckdBooks(longList);
		user2.setAllcheckdBooks(longList);


		Users user3 = new Users();
		arrayOfUsers.add(user3);
		user3.setUserName("Luck");
		user3.setlastName("Scotty");
		user3.setEmail("ls@gmail.com");
		user3.setPassword("dmamai.11");
		user3.setCheckdBooks(longList);
		user3.setAllcheckdBooks(longList);

		Users user4 = new Users();
		arrayOfUsers.add(user4);
		user4.setUserName("Jimmy");
		user4.setlastName("DeuxFois");
		user4.setEmail("jd@gmail.com");
		user4.setPassword("d443");
		user4.setCheckdBooks(longList);
		user4.setAllcheckdBooks(longList);

		Users user5 = new Users();
		arrayOfUsers.add(user5);
		user5.setUserName("Mamaye");
		user5.setlastName("Bamba");
		user5.setEmail("mamayeb@gmail.com");
		user5.setPassword("dd22wr.11");
		user5.setCheckdBooks(longList);
		user5.setAllcheckdBooks(longList);


		Users user6 = new Users();
		arrayOfUsers.add(user6);
		user6.setUserName("Miji");
		user6.setlastName("Mattews");
		user6.setEmail("mm11@gmail.com");
		user6.setPassword("ddgreijfo.2");
		user6.setCheckdBooks(longList);
		user6.setAllcheckdBooks(longList);


		Users user7 = new Users();
		arrayOfUsers.add(user7);
		user7.setUserName("Jammal");
		user7.setlastName("Zemmour");
		user7.setEmail("jzemmour@gmail.com");
		user7.setPassword("iejej.233");
		user7.setCheckdBooks(longList);
		user7.setAllcheckdBooks(longList);

		return arrayOfUsers;
	}
	
	public void writeUserListFile() {
		fw.writeListToFile(userList);
	}
	
	public void createUserListFile () {
		if (userListFile.exists()) {
			System.out.println("UsersFile.csv already exists");
			fr.readCsvFile("UsersFile.csv");

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
	
	public void addCheckedBook(String userEmail, long bookID) {
		//ArrayList<Users> ul1 = new ArrayList <Users>(userList);

		for(Users users : userList){
			if(userEmail.toLowerCase().equals(users.getEmail().toLowerCase())) {
				ArrayList<Long> checkedBooks = new ArrayList<Long>(1);
				checkedBooks = users.getCheckdBooks();
				ArrayList<Long> allCheckedBooks = new ArrayList<Long>(1);
				allCheckedBooks = users.getAllcheckdBooks();
				checkedBooks.add(bookID);
				allCheckedBooks.add(bookID);
				users.setCheckdBooks(checkedBooks);
				users.setAllcheckdBooks(allCheckedBooks);
				fw.writeListToFile(userList);
			}
		}
	}

	public boolean usersLogin(String email , String password)   {
		boolean stat=false;	
		fr.readCsvFile("UsersFile.csv");
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


	public void addUser() {
		Scanner keyboard= new Scanner(System.in);
		Users user = new Users();
		ArrayList<Long> longList = new ArrayList<>();
		longList.add((long) 0);
		System.out.println("To register a user, please enter the following information\n");
		System.out.println("Enter the user name, first and last:\n ");
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
		user.setCheckdBooks(longList);
		user.setAllcheckdBooks(longList);
		System.out.println("Congratulations, " + userName+" \nYou are now registered");
		userList.add(user);
		fw.writeListToFile(userList);
	}
	
	public void removeUser () {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter user email to remove:");
		String userToRemove = keyboard.nextLine();

		for (Users user: userList)
		{
			if (user.getEmail().toLowerCase().contains(userToRemove.toLowerCase()))
			{
				int userIndex = userList.indexOf(user);
				System.out.println("You are removing: " + user.getUserName() + " " + user.getlastName()+ "\nPress 1 to continue or 0 to cancel.");
				int i = keyboard.nextInt();
				if(i == 1) {
					userList.remove(userIndex);
					System.out.println("User Removed");
					fw.writeListToFile(userList);
				}
				else {System.out.println("Canceled");
				}
				break;
			}
		}
	}
	
	public void modifyUser (String userEmail) {

		// first look for the user to modify using the search method

		System.out.println("Modifying " +userEmail);

		boolean stat=false;

		Scanner key=new Scanner(System.in);

		int choice;

		String temp;

		//ArrayList<Users> shadow=new ArrayList<Users>(userList);

		for(Users user: userList){

			if(user.getEmail().toLowerCase().equals(userEmail.toLowerCase()))

			{

				stat=true;

				System.out.println("What do you want to modify?\n Choose: 1) for name\n"

	                                         + "2)for last name \n3)for Email");

				choice=key.nextInt();

				switch(choice)

				{

				case 1:System.out.println("Enter first name:");

				temp=key.next();

				user.setUserName(temp);

				break;

				case 2: System.out.println("Enter last name");

				temp=key.nextLine();

				user.setlastName(temp);

				break;

				case 3:System.out.println("Enter Email");

				temp=key.nextLine();

				user.setEmail(temp);

				break;

				default:

				}

			}

			//if(stat){}
		}
		fw.writeListToFile(userList);

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
	
	public void searchUsers() {
		int menu = -1;
		Scanner keyboard = new Scanner(System.in);
		
		Menu searchMenu = new Menu(2, "Please choose search method:");
		searchMenu.setMenuItem(1, "Search by Name");
		searchMenu.setMenuItem(2, "Search by Email");
		
		do {
			searchMenu.runMenu();
			menu = keyboard.nextInt();
			Scanner search = new Scanner(System.in);
			switch (menu) {
			case 0:
				break;
			case 1: System.out.println("Enter Name");
			
			String nameSearch = search.nextLine();
			
			for (Users user : userList){
				if (user.getUserName().toLowerCase().contains(nameSearch.toLowerCase()) || user.getlastName().toLowerCase().contains(nameSearch.toLowerCase()) ){
					System.out.println(user.getUserName()+ " " + user.getlastName());
					System.out.println(user.getEmail());
				}
			}

			break;
			case 2: System.out.println("Enter email");
			
			String emailSearch = search.nextLine();
			
			for (Users user : userList){
				if (user.getEmail().toLowerCase().contains(emailSearch.toLowerCase())){
					System.out.println(user.getUserName()+ " " + user.getlastName());
					System.out.println(user.getEmail());

				}
			}
			
			break;
			
			default: menu = -1;
			}

		}while(menu != 0);
	}
	
	public void userMenu(UsersHandler uh, BookHandler bh, String user) {
		ArrayList<Users> usersList =new ArrayList<Users>(userList);
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
				System.out.println("Exiting");
				//fw.writeListToFile(usersList);
				break;
			case 1:
				System.out.println("Search Books");
				bh.searchBooks();
				break;
			case 2:
				System.out.println("Book Details");
				bh.bookDetails();
				break;
			case 3:
				System.out.println("Book Checkout");
				
				bh.bookCheckout(uh, user);
				fw.writeListToFile(usersList);
				break;
			}
			
		}while(menu != 0);
		
	}
	
	public void checkInBook(long bookID, String user) {
		for(Users users : userList){
			if(user.toLowerCase().equals(users.getEmail().toLowerCase())) {
				ArrayList<Long> checkd = new ArrayList<>(users.getCheckdBooks());
			}
		}
	}

}
