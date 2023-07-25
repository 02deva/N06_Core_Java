// THIS IS THE DRIVER CLASS
//program for class and object

package org.tnsif.classandobject;
public class EmployeeExecute {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId=123981; 
		e.empName = " Dev";
		e.salary = 78000;
		e.department = "COMP";
		e.display();
	}

}
