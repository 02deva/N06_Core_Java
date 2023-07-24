//PROGRAM TO DEMONSTRATE ON TO CHECK THE PERSON IS ELIGEBLE TO DONATE THE BLOOD OR NOT USING IF ELSE
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int age=sc.nextInt();
			int weight=sc.nextInt();
			if(age>18 && weight>50)
			{
				System.out.println("Eligilbe for donating blood");
			}
			else
			{
				System.out.println("not Eligible");
			}
		}
		
		
	}

}
