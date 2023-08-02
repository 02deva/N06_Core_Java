package org.tnsif.saticdemo;
public class StaticBlockExecutor {
	
	String str = "bkc";
	static float Salary;
	
	static
	{
		Salary = 696582.325f;
		 // str = "bkc";
		System.out.println(Salary);
	}
	public static void main(String[] args) {
	}

}
