package setif;
import java.util.*;

public class HashSet_14 {
	
    public static void main(String[] args){
    	
        HashSet<Product> set=new HashSet<Product>();
        
        set.add(new Product(1));
        set.add(new Product(1));
        System.out.println(set.size());
    }
}


class Product {
    int id;
    
    Product(int i)
    {
    	id=i;
    }

    public boolean equals(Object o)
    
    {
    	return id==((Product)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}
