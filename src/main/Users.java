package main;
import java.util.Scanner;

public class Users {
	Scanner keyboard= new Scanner(System.in);
	private String userName;
	private String lastName;
	private String email;
	private String password;
	private String [] checkdBooks;
	private String [] AllcheckdBooks;
	private double usersID;
	private double usersPin;
	
	public Users(String userName,String lastName, String email, String password, String[] checkdBooks, String[] AllcheckdBooks) {
		this.userName= userName;
		this.lastName=lastName;
		this.email=email;
		this.password= password;
		this.checkdBooks= checkdBooks;
		this.AllcheckdBooks= AllcheckdBooks;
		
	}
	
	public Users(String userName,String lastName, String email, String password) {
		
		this.userName=userName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
	}
	public Users(double usersID, double usersPin) {
		this.usersID=usersID;
		this.usersPin=usersPin;
	}
	public void usersRegistration() {
		System.out.println("To register a user, please enter the following information\n");
		System.out.println("Enter the user name :\n ");
		userName= keyboard.next();
		lastName=keyboard.next();
		
		System.out.println("Enter the user email :\n ");
		email= keyboard.next();
		System.out.println("Enter the user password :\n ");
		password=keyboard.next();
		System.out.println("Congratulations, " + userName+" \nYou are now registered");
	}
	public void usersLogin() {
		System.out.println("To login to library system to access, provide the following information\n");
		System.out.println("Enter the user's ID number : \n");
		usersID=keyboard.nextDouble();
		System.out.println("Enter the user's PIN number : \n");
		usersPin=keyboard.nextDouble();
		System.out.println("You have now access to the library system : \n");
	}
		
		
		public double getUsersID() {
			return usersID;
			
		}
		public void setUserID(double usersID) {
			this.usersID=usersID;
		}
	public double getUsersPin() {
		return usersPin;
		
	}
	public void setUsersPin(double usersPin) {
		this.usersPin= usersPin;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getCheckdBooks() {
		return checkdBooks;
	}
	public void setCheckdBooks(String[] checkdBooks) {
		this.checkdBooks = checkdBooks;
	}
	public String[] getAllcheckdBooks() {
		return AllcheckdBooks;
	}
	public void setAllcheckdBooks(String[] allcheckdBooks) {
		AllcheckdBooks = allcheckdBooks;
	}
}
