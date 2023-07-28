//
//driver class 
package in.kkwagh.edu.library;
import in.bkcmet.library.*;
// import in.bkcmet.library.Library; 

public class FacultyExecutor {

	public static void main(String[] args) {
		Library s = new Library();
		s.libraryName = "Bhujbal Library" ;
		s.displayPublic();
		
//		userId and display Private() method is private so
//		we can't access into another class 
//		we can access it inside the same class only
//		s.userid = 1234;
//		s.displayPrivate();
		
//		books name and display default method is default 
//		we can't access into another package only we can access 
//		it with in the same package  
//		s.bookName;
//		s,displayDefault();
	}

}
