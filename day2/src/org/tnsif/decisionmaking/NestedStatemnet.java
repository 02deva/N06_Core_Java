package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NestedStatemnet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if (age>=12) 
		{
			if(weight>=40)
			{
				System.out.println("Eligible for jump");
				if(weight>=110)
				{
					System.out.println("EXTRA ROPES REQUIRED");
				}
			}
		}
		else 
		{
			System.out.println("not eligible");
		}

	}

}
