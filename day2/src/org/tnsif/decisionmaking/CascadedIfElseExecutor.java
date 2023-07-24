package org.tnsif.decisionmaking;
import java.util.*;

public class CascadedIfElseExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt(); 
		int age2 = sc.nextInt(); 
		int age3 = sc.nextInt(); 

		if(age1>age2 && age1>age3)
		{
			System.out.println("AGE1 IS GREATER "+age1);
		}
		
		else if(age2>age1 && age2>age3)
		{
			System.out.println("AGE2 IS GREATER "+age2);
		}
		
		else
		{
			System.out.println("AGE3 IS GREATER "+age3);
		}
	}

}
