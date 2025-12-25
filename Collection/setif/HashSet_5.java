package setif;
import java.util.*;

public class HashSet_5 {
	
    public static void main(String[] args){
    	
        HashSet<Car_1> set=new HashSet<Car_1>();
        
        set.add(new Car_1(101));
        set.remove(new Car_1(101));
        
        System.out.println(set.size());
    }
}


class Car_1 {
    int no;
    
    Car_1(int n)
    {
    	no=n;
    }

    public boolean equals(Object o)
    {
    	return no==((Car_1)o).no;
    	
    }
    
    public int hashCode()
    
    {
    	return no;
    	
    }
}