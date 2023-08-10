package org.tnsif.singledimensionalarray;

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		Employee arr[]= new Employee[3];
		arr[0] = new Employee(101 , "d",25573.96);
		arr[1] = new Employee(102 , "o",25583.96);
		arr[2] = new Employee(103 , "s",257893.96);
		
		for (int i=0; i<3;i++)
		{
			System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
	}

}
