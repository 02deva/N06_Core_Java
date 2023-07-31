// program to demonstrate on 
//this keyword  is used to refer current instance of class
package org.tnsif.thiskeyworddemo;

class Account {
	long accNO;
	void setData(long accNO)
	{
		this.accNO=accNO;
	}
	void display()
	{
		System.out.println(accNO);
	}
	
}
// driver class
public class DemoOne {

	public static void main(String[] args) {
		Account a = new Account();
		a.setData(6582398856877L);
		a.display();

	}

}
