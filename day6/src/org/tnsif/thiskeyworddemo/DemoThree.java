package org.tnsif.thiskeyworddemo;
class Team
{
	int size;
	Team()
	{
		// calling to parameterized
		this (7);
		System.out.println("default constructor");
	}
	Team(int size)
	{
		System.out.println("parameterized constructor : "+size);
	}
}

public class DemoThree {
	public static void main(String args[])
	{
		Team t = new Team();
	}

}
