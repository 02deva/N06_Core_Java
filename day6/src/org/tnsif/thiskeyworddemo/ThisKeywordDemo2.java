package org.tnsif.thiskeyworddemo;
class Bank
{
	long accNO;
	Bank(long accNO)
	{
		this.accNO=accNO;
	}
	void display() 
	{
		System.out.println(accNO);
	}
	
}

public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		Bank b = new Bank(5764648865448L);
		b.display();

	}

}
