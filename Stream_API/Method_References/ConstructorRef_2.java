package method_references;

import java.util.function.Supplier;

public class ConstructorRef_2 {
	
    public static void main(String[] args) {
    	
        Supplier<Customer_20> s = Customer_20::new;
        
        s.get();
    }
}


class Customer_20 {
	Customer_20() {
        System.out.println("Customer created");
    }
}
