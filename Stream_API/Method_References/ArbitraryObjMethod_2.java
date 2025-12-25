package method_references;
import java.util.function.Predicate;


public class ArbitraryObjMethod_2 {
	
    public static void main(String[] args) {
    	
        Predicate<Order_20> p = Order_20::isConfirmed;
        
        System.out.println(p.test(new Order_20()));
    }
}


class Order_20 {
	
    boolean confirmed = true;
    
    boolean isConfirmed()
    {
        return confirmed;
    }
}
