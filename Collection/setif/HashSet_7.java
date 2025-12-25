package setif;
import java.util.*;

public class HashSet_7 {
	
    public static void main(String[] args){
    	
        HashSet<Laptop> set=new HashSet<Laptop>();
        
        System.out.println(set.isEmpty());
    }
}


class Laptop {
	
    int id;
    
    Laptop(int i)
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Laptop)o).id;
    	
    }
    public int hashCode()
    
    {
    	return id;
    	
    }
}