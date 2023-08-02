package org.tnsif.superdemo;
class Google
{
	String ceo;
	public Google(String ceo)
	{
		System.out.println("default constructor:"+ceo);
	}
}
class Gmail extends Google
{
	String userid ;

	public Gmail(String ceo, String userid) {
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Gmail g = new Gmail("sundai pichai","abc@123.gmail.com");
	}
}