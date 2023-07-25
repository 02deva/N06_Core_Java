//program to demonstrate on default and parameters

package org.tnsif.classandobject;
public class Library {
	long noofbook;
	String authorName, bookName;
	float price;
	public Library ()
	{
		System.out.println("default constructor");
	}
	public Library(long noofbook, String authorName, String bookName, float price) {
		super();
		this.noofbook = noofbook;
		this.authorName = authorName;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterised Constructor");
	}
	@Override
	public String toString() {
		return "Library [noofbook=" + noofbook + ", authorName=" + authorName + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	
	
	

}
