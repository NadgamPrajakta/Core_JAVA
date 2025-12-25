package setif;
import java.util.*;

public class LinkedHSet_7 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Laptop_4> set=new LinkedHashSet<Laptop_4>();
        
        System.out.println(set.isEmpty());
    }
}


class Laptop_4 {
	
    int id;
    
    Laptop_4(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Laptop_4)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}