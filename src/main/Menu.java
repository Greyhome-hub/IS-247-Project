package main;

public class Menu {
	
	int items;
	int menu;
	String menuTitle = "";
	private String[] menuItems;

	
	public Menu() {
	}

	public Menu(int items, String menuTitle) {
		this.items = items;
		this.menuTitle = menuTitle;
		menuItems = new String[items];
		 
	}
	
	String setMenuTitle(String menuTitle) {
		
		return menuTitle;
		
	}
	

	
	void setMenuItem(int itemNumber, String itemLabel ) {
		
		menuItems[(itemNumber - 1)] = "             Enter (" + itemNumber + ") for " + itemLabel;
		
	}
	

	
	void runMenu() {

		System.out.println("=====================================================================");
		System.out.println("                   " + menuTitle + "\n");
		for (int i = 0; i < items; i++) {

			System.out.println(menuItems[i]);

		}
		System.out.println("             Enter (0) to exit                			  			 ");

	}



}
