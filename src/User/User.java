package User;

import java.util.HashMap;
import java.util.Scanner;

public class User {
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	
	static HashMap<String, String> users = new HashMap<String, String>();
	
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);	
	 int userChoice = 0;
	 
	 while(userChoice !=3) {
		 System.out.println("Hello. What would you like to to do?");
		 System.out.println("[1] Register");
		 System.out.println("[2] Login");
		 System.out.println("[3] Quit");
		 
		 userChoice=scanner.nextInt();
		 scanner.nextLine();
		 
		 switch(userChoice) {
		 case 1:
			 registerUser(scanner);
			 break;
		 case 2:
			 loginuser(scanner);
			 break;
		 case 3:
			 break;
         default:
             System.out.println("Invalid choice");
		 }
	 }
	 scanner.close();
}
	
	private static void registerUser(Scanner scanner) {
		System.out.println("Welcome. To register, please enter the following: ");
        
		System.out.println("Enter your Firstname:");
        String firstname = scanner.nextLine();
		
        System.out.println("Enter your Lastname:");
        String lastname = scanner.nextLine();
        
		System.out.println("Enter your username:");
        String username = scanner.nextLine();
        checkUseName(username);
        if(!User.checkUseName(username)) {
        	 System.out.println("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length");
        	 scanner.close();
        	 return;
         } 
        
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        checkPasswordcomplexity(password);
        if(!User.checkPasswordcomplexity(password)) {
        	 System.out.println("Password is not correctly formatted,please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
        	 scanner.close();
        	 return;
         }         
		
		
	}
	
	///-------------------My methods:
	public static boolean checkUseName(String username) {
		return username.length() >=1 && username.length() <=5 && username.contains("-");
	}
	
	public static boolean checkPasswordcomplexity(String password) {
		return false;
		//return password.length() >=1 && password.length() <=8 && password.contains();
	}

	private static void loginuser(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	static void registerUser() {
		
	}
	
	static void loginUser() {
		
	}

}
