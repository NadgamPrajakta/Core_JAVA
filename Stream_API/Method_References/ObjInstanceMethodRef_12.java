package method_references;
import java.util.function.Function;

public class ObjInstanceMethodRef_12 {
	
    public static void main(String[] args) {
    	
        Order o = new Order();
        
        Function<Boolean, String> f = o::getStatus;
        System.out.println(f.apply(true));
    }
}


class Order {
	
    String getStatus(boolean paid) 
    {
        return paid ? "Confirmed" : "Pending";
    }
}
