package setif;
import java.util.*;

public class LinkedHSet_4 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<City_4> set=new LinkedHashSet<City_4>();
        
        set.add(new City_4("Mumbai"));
        set.add(new City_4("Solapur"));
        set.add(new City_4("Pune"));
        set.add(new City_4("Dehli"));
        set.add(new City_4("Dubai"));
        set.add(new City_4("Gujarat"));
        
        System.out.println(set.contains(new City_4("Mumbai")));
    }
}


class City_4 {
    String name;
    
    City_4(String n)
    
    {
    	name=n;
    	
    }

    public boolean equals(Object o)
    
    {
    	return name.equals(((City_4)o).name);
    	
    }
    
    public int hashCode()
    
    {
    	return name.hashCode();
    	
    }
}