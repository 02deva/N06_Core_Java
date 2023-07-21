// TO DEMONSTRATE ASSIGNMENT OPERATIONS
package org.tnsif.operators;
import java.util.*;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st integer = ");
		int n1 = sc.nextInt();
		System.out.println("enter the 2nd integer = ");
		int n2 = sc.nextInt();
		
		n1+=n2; // it assigns new n1 value after the operation
		System.out.println(n1);
		

	}

}
