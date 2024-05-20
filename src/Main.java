import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Map<String, Account> accounts = new HashMap<>();
	
	
	public static void main(String[] args) {
		//Application "Home page"
		
		boolean exit = false; //program exit set to "not yet"
		
		while (!exit){ //while the user hasnt exited program
		 //1. Prompt user to start, either register; login or quit
			System.out.println("Hello, choose an option of action below");
			System.out.println("[1] Register");
			System.out.println("[2] Login");
			System.out.println("[3] Quit");			
			
			int choice = scanner.nextInt(); //store users choice into variable
			scanner.nextLine();
			
			switch (choice) { //switch between users choice
			case 1: // ------user chose to Register =call register function
				registerUser();
				break;
			case 2: 
				loginUser();
				break;
			case 3: 
				System.out.println("Exit. Good bye.");
				exit = true;
				break;
			default:
				System.out.println("Invalid choice, Exit. Good bye.");
			}
		}
		scanner.close();
	}		
	
	
	//=================Register. 
	private static void registerUser() {
		//Application Register page
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
				validinput = true; //Username met criteria
				accounts.put(userName, account);// Create and store the account in the accounts map
				System.out.println("Registration successful. Please login to continue.");	
			} else {
				System.out.println(registrationMessage);	        
			}	        									
		  }
	}

	
	//=================Login Prompts. 	
	private static void loginUser() {
		//Application Login page
		System.out.println("LOGIN. Please enter the below details");
		System.out.println("Enter a userName:");
		String loginUsername = scanner.nextLine();
		
		
		System.out.println("Enter a Password:");
		String loginPassword = scanner.nextLine();
		
		Account loginAccount = accounts.get(loginUsername);
		
		// Login process
		if (loginAccount != null && loginAccount.loginUser(loginUsername, loginPassword)) {
            System.out.println("Login successful.");
            loggedInMenu(loginAccount);
        } else {
            System.out.println("Login failed. Check username and password.");
        }
	 }

	
	//=================Dashboard Menu 	
    private static void loggedInMenu(Account account) {
    	//Admin Dashboard page
        boolean loggedIn = true; //user login status = LOGGED IN

        while (loggedIn) { //while user hasnt quite the app
        	System.out.println("Welcome to EasyKanBan");
            System.out.println("Choose an option:");
            System.out.println("[1] Create Task");
            System.out.println("[2] Show report");
            System.out.println("[3] Logout");

            int choice = scanner.nextInt(); //stored menu option
            scanner.nextLine();

            switch (choice) { //switch between menu choices
                case 1:
                    createTask(account); //call function that creates tasks
                    break;
                case 2:
                	System.out.println("Coming Soon.");
                    break;
                case 3:
                    loggedIn = false;
                    System.out.println("Logged out successfully.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }	
	
  //=================Create Task
    private static void createTask(Account account) {
    	//Admin CREATE Interface
        System.out.println("How many tasks do you want to create?");
        int numberOfTasks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfTasks; i++) { //Run this loop for the number of tasks created
            System.out.println("Enter task description:"); 
            String description = scanner.nextLine();
            Task task = new Task(description);
            account.addTask(task);
            System.out.println("Task added successfully.");

            if (i < numberOfTasks - 1) { //take away 1 from number of tasks wanted to create
                System.out.println("Do you want to continue creating tasks? (yes/no)"); //does user want to continue?
                String continueResponse = scanner.nextLine();
                if (!continueResponse.equalsIgnoreCase("yes")) { // no, user still doesnt want to conitnue for those numnber of tasks
                    break;
                }
            }
        }
    }
	
}	
	
