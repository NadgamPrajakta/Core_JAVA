package method_references;
import java.util.function.Predicate;

public class ObjInstanceMethodRef_10 {
	
    public static void main(String[] args) {
    	
        Movie m = new Movie();
        
        Predicate<Integer> p = m::isHit;
        
        System.out.println(p.test(9));
    }
}


class Movie {
	
    boolean isHit(int rating) {
    	
        return rating >= 8;
    }
}