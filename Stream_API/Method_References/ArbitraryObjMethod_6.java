package method_references;
import java.util.function.Function;

public class ArbitraryObjMethod_6 {
	
    public static void main(String[] args) {
    	
        Function<Movie_40, Integer> f = Movie_40::getDuration;
        
        System.out.println(f.apply(new Movie_40()));
    }
}


class Movie_40 {
	
    int duration = 120;
    
    int getDuration()
    {
        return duration;
    }
}
