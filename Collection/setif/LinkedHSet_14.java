package setif;
import java.util.*;

public class LinkedHSet_14 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Product_3> set=new LinkedHashSet<Product_3>();
        
        set.add(new Product_3(1));
        set.add(new Product_3(2));
        set.add(new Product_3(3));
        set.add(new Product_3(4));
        set.add(new Product_3(6));
        set.add(new Product_3(8));
        set.add(new Product_3(9));
        set.add(new Product_3(5));
        set.add(new Product_3(7));
        
        
        System.out.println(set.size());
    }
}


class Product_3 {
	
    int id;
    
    Product_3(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
   
    {
    	return id==((Product_3)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}