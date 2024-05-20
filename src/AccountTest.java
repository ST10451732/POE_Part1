import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	
    private Account account; // Declare an Account instance

    //------the perfect user account...
    @BeforeEach
    public void setUp() {
        // Initialize the Account with valid credentials
        account = new Account("kyl_1", "P@ssw0rd!23", "Kyle", "Smith");
    }
    
    public AccountTest() {
        // Initialize the Account with valid credentials
        account = new Account("kyl_1", "P@ssw0rd!23", "Kyle", "Smith");
    }
	
	//---------------------Username Test
	@Test
	public void testCheckUsername_CorrectlyFormatted() {
		String validUsername = "kyl_1"; //expected valid username
		
		assertTrue(checkUsername(validUsername));
		
	}
	
	@Test
	public void testCheckUsername_IncorrectlyFormatted() {
		String InvalidUsername = "kyle!!!!!!!"; //expected valid username
		
		assertTrue(checkUsername(InvalidUsername));
		
	}	

	public boolean checkUsername(String userName) {
		return userName.length() >= 1 && userName.length() <= 5 && userName.contains("_");
	}
	

	//---------------------Password Test
	@Test
	public void testCheckPassword_CorrectlyFormatted() {
		String validPassword = "Ch&&sec@99!"; //expected valid password
		
		assertTrue(checkPasswordComplexity(validPassword));
		
	}	
	
	@Test
	public void testCheckPassword_IncorrectlyFormatted() {
		String InvalidPassword = "password"; //expected invalid password
		
		assertTrue(checkPasswordComplexity(InvalidPassword));
		
	}	
	
	public boolean checkPasswordComplexity(String passWord) {
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%?&])[A-Za-z\\d@$!%?&]{8,}$";
	    return passWord.matches(regex);
	}
	
    //---------------------Successful login Test
    @Test
    public void testSuccessfulLogin() {
        String validUsername = "kyl_1"; // expected valid username
        String validPassword = "P@ssw0rd!23"; // expected valid password
        assertTrue(account.loginUser(validUsername, validPassword));
    }
	
    
    //---------------------Failed login Test
    @Test
    public void testFaillLogin() {
        String validUsername = "kyl_12"; // expected valid username
        String validPassword = "Password"; // expected valid password
        assertTrue(account.loginUser(validUsername, validPassword));
    }
}
