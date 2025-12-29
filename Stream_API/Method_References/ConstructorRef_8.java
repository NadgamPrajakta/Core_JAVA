package method_references;

import java.util.function.Function;

public class ConstructorRef_8 {
	
    public static void main(String[] args) {
    	
        Function<Integer, Movie_30> f = Movie_30::new;
        System.out.println(f.apply(9).rating);
    }
}


class Movie_30 {
	
    int rating;
    
    Movie_30(int rating) 
    {
        this.rating = rating;
    }
}