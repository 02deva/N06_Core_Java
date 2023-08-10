package org.tnsif.customexception;

import java.util.Scanner;

public class CusttomExceptionExceutor {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String userid = sc.nextLine();
		String password = sc.nextLine();
		
	try
	{	
		if(userid.equals("") && password.equals("Boa@123"))
		{
			System.out.println("you are a member of straw hat pirates !!!!");
		}
		else
		{
			throw new LoginCredentials("you are a government member");
		}
	}
		
	catch(LoginCredentials e)
	{
		System.out.println("Exception handled "+e);
	}
}
	
}
