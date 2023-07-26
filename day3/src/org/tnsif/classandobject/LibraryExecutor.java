package org.tnsif.classandobject;
public class LibraryExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Library l = new Library();
		Library l1 = new Library(5,"Echiro oda ","one piece",(float) 15.3);
		System.out.println(l1);
	}

}