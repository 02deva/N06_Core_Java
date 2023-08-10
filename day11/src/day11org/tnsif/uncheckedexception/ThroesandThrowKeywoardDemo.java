package day11org.tnsif.uncheckedexception;

public class ThroesandThrowKeywoardDemo {

	static void isEligible(int age, int weight) {
		if(age>18 && weight>50) {
			System.out.println("person is eligible to donate blood");
		}
		else
		{
			throw new ArithmeticException("Criteria is not static ");
		}
	}
	public static void main(String[] args)
	{
		try {
		isEligible(13,54);
		} catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
