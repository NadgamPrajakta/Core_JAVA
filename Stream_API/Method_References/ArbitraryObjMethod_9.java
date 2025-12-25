package method_references;
import java.util.function.Function;

public class ArbitraryObjMethod_9 {
	
    public static void main(String[] args) {
    	
        Function<Mobile, Double> f = Mobile::getPrice;
        
        System.out.println(f.apply(new Mobile()));
    }
}


class Mobile {
	
    double price = 18000;
    
    double getPrice()
    {
        return price;
    }
}