package org.tnsif.checkedexception;
import java.io.FileInputStream;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try 
		{
			FileInputStream f = new FileInputStream("C:\\Users\\Dev\\eclipse-workspace\\day11");
			System.out.println("file is exits");
		}
		catch(Exception e)
		{
			System.out.println("exception handled : "+e);
		}
	}

}
