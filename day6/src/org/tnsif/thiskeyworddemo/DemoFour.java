package org.tnsif.thiskeyworddemo;
class Director
{
	String name;
	void print()
	{
		this.name="sunil Datt";
		display(name);
	}
	void display(String name)
	{
		System.out.println("the director name is : "+name);
	}
}

public class DemoFour {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();
	}

}
