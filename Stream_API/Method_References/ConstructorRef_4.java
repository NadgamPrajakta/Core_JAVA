package method_references;

import java.util.function.Function;

public class ConstructorRef_4 {
	
    public static void main(String[] args) {
    	
        Function<String, Product_32> f = Product_32::new;
        
        Product_32 p = f.apply("Laptop");
        System.out.println(p.name);
    }
}


class Product_32 {
	
    String name;
    
    Product_32(String name) 
    {
        this.name = name;
    }
}