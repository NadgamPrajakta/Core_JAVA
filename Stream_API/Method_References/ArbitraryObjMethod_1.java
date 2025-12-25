package method_references;
import java.util.function.Function;

public class ArbitraryObjMethod_1 {
	
    public static void main(String[] args) {
    	
        Function<Customer, Integer> f = Customer::getNameLength;
        
        System.out.println(f.apply(new Customer()));
    }
}


class Customer {
    String name = "Prajkta";
   
    int getNameLength() 
    {
        return name.length();
    }
}
