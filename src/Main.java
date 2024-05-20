import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Account> accounts = new HashMap<>();
		
		boolean exit = false; //program exit set to "not yet"
		
		while (!exit){ //while the user hasnt exited program
		 //1. Prompt user to start; either register; login or quit
			System.out.println("Hello, choose an option of action below");
			System.out.println("[1] Register");
			System.out.println("[2] Login");
			System.out.println("[3] Quit");			
			
			int choice = scanner.nextInt(); //store users choice into variable
			scanner.nextLine();
			
			switch (choice) { //switch between users choice
			case 1: // ------user chose to Register
				boolean validinput = false;
				System.out.println("REGISTER. Please enter the below details");
				
				while (!validinput){
					System.out.println("Enter your firstname:");
					String firstName = scanner.nextLine();
					
					System.out.println("Enter your lastname:");
					String lastName = scanner.nextLine();
					
					System.out.println("Enter a userName:");
					String userName = scanner.nextLine();
					
					System.out.println("Enter a Password:");
					String passWord = scanner.nextLine();
					
					
					Account account = new Account(firstName,lastName,userName,passWord);
					String registrationMessage = account.registerUser(userName, passWord, firstName, lastName);
					
					if (registrationMessage.equals("User registration sucessful.")) {
						validinput = true;
				        // Create and store the account in the accounts map
				        accounts.put(userName, account);
						
						// Prompt user to login immediately after successful registration
						boolean loggedIn = false; //set logged in status to no until its true
						
						while (!loggedIn){ //while user hasnt logged in, prompt them for login details
							System.out.println("Please login:");
							System.out.println("Enter a userName:");
							String loginUsername = scanner.nextLine();
							
							System.out.println("Enter a Password:");
							String loginPassword = scanner.nextLine();
							
							Account loginAccount = accounts.get(loginUsername);
							if (loginAccount != null && loginAccount.loginUser(loginUsername, loginPassword)) {
								System.out.println("Welcome " + loginAccount.getfirstName() + " " + loginAccount.getlastName() + ". Its great to see you. ");
								loggedIn = true;							
							} else {
								System.out.println("Login failed/ Check username and password.");					
							}			
						} //while user hasnt logged in, prompt them for login details
					
					} else {
						System.out.println(registrationMessage);
					}
				}

				break;
			
			case 2: //Login
				System.out.println("LOGIN. Please enter the below details");
				System.out.println("Enter a userName:");
				String loginUsername = scanner.nextLine();
				
				System.out.println("Enter a Password:");
				String loginPassword = scanner.nextLine();
				
				Account loginAccount = new Account(loginUsername, loginPassword, "", "");
				
				System.out.println("Welcome back" + loginAccount.getuserName() + " it is great to see you again.");
				
				break;
				
			case 3: //Quit
				System.out.println("Exiting program");
				break;
				
			default:
				System.out.println("Invalid choice, Exiting program");
				break;
			}			
			
		}
		
		scanner.close();		

	}

}
