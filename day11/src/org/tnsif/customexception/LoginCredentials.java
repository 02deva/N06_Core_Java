package org.tnsif.customexception;

public class LoginCredentials  extends Exception{

	private String str;
	
	// getters and setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//private constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}	
	
}
