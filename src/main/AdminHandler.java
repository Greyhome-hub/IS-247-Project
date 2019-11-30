package main;

import java.io.File;
import java.util.ArrayList;

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
	}
	
	public void createAdminListFile() {
		if(adminListFile.exists()) {
			System.out.println("AdminFile.csv already exists");

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
	
	public void adminLogin(String email , String password)   {
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

	}
	
	

}
