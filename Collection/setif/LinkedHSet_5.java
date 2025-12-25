package setif;
import java.util.*;

public class LinkedHSet_5 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Car_5> set=new LinkedHashSet<Car_5>();
        
        set.add(new Car_5(1));
        set.remove(new Car_5(1));
        
        System.out.println(set.size());
    }
}


class Car_5 {
	
    int id;
    
    Car_5(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Car_5)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}
