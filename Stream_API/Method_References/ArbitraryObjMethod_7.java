package method_references;
import java.util.function.Predicate;

public class ArbitraryObjMethod_7 {
	
    public static void main(String[] args) {
    	
        Predicate<Restaurant> p = Restaurant::isOpen;
        
        System.out.println(p.test(new Restaurant()));
    }
}


class Restaurant 
{
    boolean open = true;
    
    boolean isOpen() 
    {
        return open;
    }
}