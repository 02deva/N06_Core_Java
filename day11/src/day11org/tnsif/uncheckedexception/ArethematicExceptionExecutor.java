package day11org.tnsif.uncheckedexception;
import java.util.Scanner;
public class ArethematicExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		//try block contains an exception
		try {
			System.out.println(x/y);
		}
		// catch block is used to handle the exception
		catch(Exception e)
		{
			System.out.println("exception handled "+e);
		}
	}
}
