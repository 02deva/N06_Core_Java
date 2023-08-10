package org.tnsif.singledimensionalarray;
// program to demonstrate on 1D array using compile-time Array
public class ArrayExample {

	public static void main(String[] args) {
		int arr1[]= new int[] {66,25,14,78,96,36,75};
		System.out.println(arr1[2]);
		System.out.println("array elements are : ");
		for(int i:arr1)
		{
			System.out.println(i+" ");
		}
		
		int arr[]= {58,36,26,89,};
		System.out.println("array with value less than 50");
		for(int i:arr)
		{
			System.out.println(i>50);
		}

   }
}
