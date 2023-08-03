package org.tnsif.polymorphism;
class CM
{
	static void corruption(String str , float ammount)
	{
		System.out.println("corruption the ammmount of "+ammount);
	}
}
class MLA extends CM
{
	 static void corruption(String str2 , float ammount2)
	{
		CM.corruption("Ajit pawar",5659896.255f);
		System.out.println("corruption ammount of "+ammount2);
	}
}
public class MethodOveridingExecutor {

	public static void main(String[] args) {
		MLA.corruption("dev", 100.321f);
		
	}

}
