package org.tnsif.superdemo;
class Met
{
	String ownerName="CHAGAN BHUJBAL";
	void displayName()
	{
		System.out.println("owner is :"+ownerName);
	}
}
class BKC extends Met
{
	String ownerName="SHEFALI BHUJBAL";
	void displayName()
	{
		super.displayName();
		System.out.println("owner is :"+ownerName);
	}
}
public class SuperKeywordWithKeyword {

	public static void main(String[] args) {
		BKC b = new BKC();
		b.displayName();
	}

}
