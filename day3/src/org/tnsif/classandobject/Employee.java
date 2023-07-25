//program for class and object
package org.tnsif.classandobject;
//class declaration
public class Employee {
	
	String empName,department;
	int empId;
	float salary;
	
	// method declaration and definition
	void display()
	{
		System.out.println("EMP ID:"+empId+ "\nEMP NAME:" +empName+ "\nSalary :"+salary+ "\nDepartment :"+department);
	}
}
