import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello, choose an option of action below");
		System.out.println("[1] Register");
		System.out.println("[2] Login");
		System.out.println("[3] Quit");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		switch (choice) {
		case 1: //Register
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
					validinput=true;
					System.out.println("Welcome " + account.getfirstName() + " " + account.getlastName() + ". Its great to see youyou have registered successfully. You can now login.");
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

}
