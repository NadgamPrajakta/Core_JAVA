package method_references;

import java.util.function.Function;

public class ConstructorRef_9 {
	
    public static void main(String[] args) {
    	
        Function<Double, Mobile_5> f = Mobile_5::new;
        System.out.println(f.apply((double) 18000).price);
    }
}


class Mobile_5 {
	
    double price;
    
    Mobile_5(double price) 
    {
        this.price = price;
    }
}
