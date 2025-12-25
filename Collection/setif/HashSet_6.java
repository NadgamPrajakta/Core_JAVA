package setif;
import java.util.*;

public class HashSet_6 {
	
    public static void main(String[] args){
    	
        HashSet<Pen> set=new HashSet<Pen>();
        
        set.add(new Pen("Reynolds"));
        set.add(new Pen("Reynolds"));
        
        System.out.println(set.size());
    }
}


class Pen {
	
    String brand;
    
    Pen(String b)
    {
    	brand=b;
    	
    }

    public boolean equals(Object o)
    
    {
    	return brand.equals(((Pen)o).brand);
    	
    }
    
    public int hashCode()
    
    {
    	return brand.hashCode();
    	
    }
}
