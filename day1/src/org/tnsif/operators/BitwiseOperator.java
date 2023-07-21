package org.tnsif.operators;
import java.util.*;
public class BitwiseOperator {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st integer = ");
		int n1 = sc.nextInt();
		System.out.println("enter the 2nd integer = ");
		int n2 = sc.nextInt();
		
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(n1^n2);
		System.out.println(n1>>n2);
		System.out.println(n1<<n2);
	}
}
