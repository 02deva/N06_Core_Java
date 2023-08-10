package day11org.tnsif.uncheckedexception;

public class FinallyBlockNotExecutedExecutor
{	
		static void display (int arr[])
		{
			try 
			{
				System.out.println(arr[3]);
				/*if try and catch  block contain an system.exit(0)
				then after the exception code line then finally block 
				does not execute*/
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("exception handled :"+e);
			System.exit(0);
			}
			finally
			{
				/*when finally block contain exception code, then finally block does not execute*/
				System.out.println(13/0);
				System.out.println("finally block is always executed");
			}
			System.out.println("any statement out of bock is always "+"executed");
		}

		public static void main(String[] args) {
			int arr[] = {13,15,46};
			display(arr);
			}
		}




