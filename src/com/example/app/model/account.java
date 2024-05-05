/**
 * 
 */

package com.example.app.model;

/**
 * 
 */

public class account {
	private String myUsername;
	private String myPassword;
	private String myFirstname;
	private String myLastname;

	/**
	 * 
	 */
	public account(String myUsername,String myPassword,String myFirstname,String myLastname) {
		// TODO Auto-generated constructor stub
		
		this.myUsername = myUsername;
		this.myPassword = myPassword;
		this.myFirstname = myFirstname;
		this.myLastname = myLastname;
	}
	
	public String getUsername() {
        return myUsername;
    }
	
	
	public String getPassword() {
        return myPassword;
    }
	
	public String getFirstname() {
        return myFirstname;
    }
	
	public String getLastname() {
        return myLastname;
    }
	
	
	

}
