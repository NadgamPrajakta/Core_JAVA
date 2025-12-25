package method_references;
import java.util.function.Predicate;

public class ArbitraryObjMethod_10 {
	
    public static void main(String[] args) {
    	
        Predicate<Flight> p = Flight::isDomestic;
        
        System.out.println(p.test(new Flight()));
    }
}


class Flight 
{
    boolean domestic = true;
    
    boolean isDomestic() 
    {
        return domestic;
    }
}
