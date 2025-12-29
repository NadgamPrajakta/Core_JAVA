package method_references;

import java.util.function.Supplier;

public class ConstructorRef_3 {
	
    public static void main(String[] args) {
    	
        Supplier<Order_40> s = Order_40::new;
        s.get();
    }
}


class Order_40 {
	
	Order_40()
	{
        System.out.println("Order placed");
    }
}