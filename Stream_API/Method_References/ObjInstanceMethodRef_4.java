package method_references;
import java.util.function.Function;

public class ObjInstanceMethodRef_4 {
	
    public static void main(String[] args) {
    	
        Product p = new Product();
        
        Function<Double, Double> f = p::showPrice;
        
        System.out.println(f.apply(999.99));
    }
}


class Product {
	
    double showPrice(double price) {
        return price;
    }
}
