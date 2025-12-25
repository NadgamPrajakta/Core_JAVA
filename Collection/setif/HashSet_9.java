package setif;
import java.util.*;

public class HashSet_9 {
	
    public static void main(String[] args){
    	
        HashSet<Bike_1> set=new HashSet<Bike_1>();
        
        set.add(new Bike_1(1));
        set.clear();
        System.out.println(set);
    }
}


class Bike_1 {
	
    int id;
    
    Bike_1(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Bike_1)o).id;
    	
    }
    public int hashCode()
    
    {
    	return id;
    	
    }
}