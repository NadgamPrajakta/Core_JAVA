package method_references;
import java.util.function.Predicate;

public class ArbitraryObjMethod_5 {
	
    public static void main(String[] args) {
    	
        Predicate<LibraryBook> p = LibraryBook::isAvailable;
        
        System.out.println(p.test(new LibraryBook()));
    }
}


class LibraryBook {
	
    boolean available = true;
    
    boolean isAvailable() 
    {
        return available;
    }
}