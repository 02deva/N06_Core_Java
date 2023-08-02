package org.tnsif.saticdemo;
public class StaticMethodExecuor {
	
	static String str = "BKC";
	static float percentage = 98.71f;

	static void displayScore(int score)
	{
		System.out.println(str);
		System.out.println(percentage);
		System.out.println("the score is : "+score);
	}
	public static void main(String[] args) {
		displayScore(56);
		
	}

}
