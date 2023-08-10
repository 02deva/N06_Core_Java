package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

// to find largest element in array
public class ArrayMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter the total number of elements :");
		int n = in.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0; i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		int max = arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("the largest number is "+max);
		Arrays.sort(arr);
		System.out.println("sorted array is  ");
		for(int i:arr) {
			System.out.println(i+" ");
		}
		
	}

}
