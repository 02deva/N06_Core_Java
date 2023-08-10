package day11org.tnsif.uncheckedexception;
// program to demonstrate on catch block with multiple exception class
public class MultipleCatch {
	static void print(int arr[])
	{
		try 
		{
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,45};
		print(arr);
	}

}
