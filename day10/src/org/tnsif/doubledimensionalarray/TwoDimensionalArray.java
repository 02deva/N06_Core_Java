package org.tnsif.doubledimensionalarray;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//2D array declaration 
		int arr[][]= new int[3][2];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++) 
			{
				arr[i][j] = in.nextInt();
			}
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
