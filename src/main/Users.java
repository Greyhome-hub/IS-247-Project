package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Users {
	Scanner keyboard= new Scanner(System.in);
	private String userName;
	private String lastName;
	private String email;
	private String password;
	private ArrayList<Long> checkdBooks;
	private ArrayList<Long> AllcheckdBooks;

	
	
	public Users() {	
		
	}

	public Users(String userName,String lastName, String email, String password, ArrayList<Long> checkdBooks, ArrayList<Long>  AllcheckdBooks) {
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
	public ArrayList<Long> getCheckdBooks() {
		return checkdBooks;
	}
	public void setCheckdBooks(ArrayList<Long> checkdBooks) {
		this.checkdBooks = checkdBooks;
	}
	public ArrayList<Long> getAllcheckdBooks() {
		return AllcheckdBooks;
	}
	public void setAllcheckdBooks(ArrayList<Long> allcheckdBooks) {
		AllcheckdBooks = allcheckdBooks;
	}
}
