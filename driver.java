import java.util.Scanner;

public class driver {
	
	 
	public static void main(String[] args) {
		String data;
		Scanner keyboard= new Scanner(System.in);
		Users[] usersarr = new Users [20];
		usersarr[0]= new Users("Name","Last Name", "email", "password");
		usersarr[0].usersRegistration();
		//usersarr[0].usersLogin();
/**	System.out.println("=====================================================================");
	System.out.println("                   Welcome to the Library                            ");
	System.out.println("             Choose (1) for user's registration        \n");
	System.out.println("             Choose (2) for user login                 \n");
	System.out.println("             Choose (3) for admin login                \n");
	
	//CREATE A SWITCH STATEMENT FOR THIS.
	//switch(3) {
	//case 1: 
	usersarr[0].usersRegistration();
	//break;
		
//	case 2:
		//usersarr[0].usersLogin();
	//case 3:
		
		
	}
	
	
	//	
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**	System.out.println("Enter the user name");
			data= keyboard.nextLine();
			usersarr[0].setUserName(data);
			System.out.println(usersarr[0].userName);
			System.out.println("Enter the user's email");
			data=keyboard.nextLine();
			
			/**
			
			System.out.println("Enter the user email");
			//usersarr[0].email=keyboard.next();
			
			
			System.out.println("Enter the user password");
			password=keyboard.next();
			usersarr[0].setPassword(password);*/

	    //		usersarr[0]= new Users(userName, email, password);
		
	}

}
