package org.tnsif.jaggedarray;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [3][];
		// declaration of jagged array
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();		
			}
		}
		
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("the number stored in arr["+i+"]["+j+"]= "+arr[i][j]+" ");
			}
			
			System.out.print("\n");
		}
	
	}

}
