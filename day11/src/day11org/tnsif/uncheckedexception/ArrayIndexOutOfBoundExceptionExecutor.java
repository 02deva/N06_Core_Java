package day11org.tnsif.uncheckedexception;
public class ArrayIndexOutOfBoundExceptionExecutor {
	
	static void display (int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception handled :"+e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("any statement out of bock is always "+"executed");
	}

	public static void main(String[] args) {
		int arr[] = {13,15,46};
		display(arr);
		}
	}


