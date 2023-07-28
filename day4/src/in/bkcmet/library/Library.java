// program to demonstrate access specifier
package in.bkcmet.library;
public class Library {
	// different access specifier
	public String libraryName;
	private long userid;
	String bookName;
	
	public void displayPublic()
	{
		System.out.println("Library Name: "+libraryName);
	}
	
	@SuppressWarnings("unused")
	private void displayPrivate()
	{
		System.out.println("user Id : "+userid);
	}
	
	void displayDefault()
	{
		System.out.println("Bookname is "+ bookName);
	}


}
