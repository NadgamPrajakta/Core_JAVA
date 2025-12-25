package setif;
import java.util.*;

public class LinkedHSet_9 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Bike_8> set=new LinkedHashSet<Bike_8>();
        
        set.add(new Bike_8(56));
        
        set.clear();
        System.out.println(set);
    }
}


class Bike_8 {
	
    int id;
    
    Bike_8(int id)
    
    {
    	this.id=id;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Bike_8)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}
