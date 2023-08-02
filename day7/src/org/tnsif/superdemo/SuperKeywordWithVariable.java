package org.tnsif.superdemo;
class Building
{
	int floors = 23;
	String name = "ASHIRWAD";
	
}
class Flat extends Building
{
	String name = "Devansh Nikam";
	void display()
	{
		System.out.println(super.name);
		System.out.println(name);
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f = new Flat();
		f.display();

	}

}
