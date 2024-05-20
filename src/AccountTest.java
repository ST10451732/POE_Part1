import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

	
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
	//@Test
	//void testCheckPasswordComplexity() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void testRegisterUser() {
	//	fail("Not yet implemented");
	//}
	
	//@Test
	//public void testRegisterUser_ValidRegistration() {
	//	Account account = new Account("Tiny_","P@ssw0rd!23","Tiny","User");
	//	Assertions.assertEquals("User registration sucessful.", account.registerUser("kyl_","P@ssword","Tiny", "User"));
	//	Assertions.assertEquals("kyl_", account.getuserName());
	//	Assertions.assertEquals("P@ssw0rd!23", account.getpassWord());
	//	Assertions.assertEquals("Tiny", account.getfirstName());
	//	Assertions.assertEquals("User", account.getlastName());
		
	//}

}
