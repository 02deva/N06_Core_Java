package org.tnsif.polymorphism;
class Bollywood
{
	static String ShowCouple(String strl,String strl2)
	{
		return strl+" loves "+strl2;
	}
	
	static String ShowCouple(String strl , String strl2 , String strl3)
	{
		return strl+" Loves "+strl2+" as well as "+strl3;
	}
}

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println(Bollywood.ShowCouple("luffy", "hancock"));
		System.out.println(Bollywood.ShowCouple("luffy", "hancock","zoro"));

	}

}
