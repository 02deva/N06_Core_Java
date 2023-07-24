package org.tnsif.looping;
import java.util.Scanner;
public class ForLoopExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the number = "+n);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<1;j++)
			{
				System.out.println("*");
			}
		}
	}

}
