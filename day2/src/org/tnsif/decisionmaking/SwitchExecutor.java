package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE SONG NUMBER = ");

		int songno=sc.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("waka waka");
			break;
		case 2:
			System.out.println("taki taki");
			break;
		default:
			System.out.println("enter valid option ");			
		}
		
	}

}
