package setif;
import java.util.*;

public class HashSet_15 {

	public static void main(String[] args){
		
        HashSet<Country> s1=new HashSet<Country>();
        
        s1.add(new Country("India"));
        
        HashSet<Country> s2=new HashSet<Country>(s1);
        
        System.out.println(s2.size());
    }
}



class Country {
    String name;
    
    Country(String n)
    
    {
    	name=n;
    	
    }

    public boolean equals(Object o)
    
    {
    	return name.equals(((Country)o).name);
    
    }
    
    public int hashCode()
    
    {
    	return name.hashCode();
    	
    }
}