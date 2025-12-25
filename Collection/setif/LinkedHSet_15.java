package setif;
import java.util.*;

public class LinkedHSet_15 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Country_1> s1=new LinkedHashSet<Country_1>();
        
        s1.add(new Country_1("India"));
        s1.add(new Country_1("Japan"));
        s1.add(new Country_1("Canada"));
        s1.add(new Country_1("Germany"));
        s1.add(new Country_1("Kenya"));
        
        LinkedHashSet<Country_1> s2=new LinkedHashSet<Country_1>(s1);
        
        System.out.println(s2.size());
    }
}


class Country_1 {
	
    String name;
    
    Country_1(String n)
    
    {
    	name=n;
    	
    }

    public boolean equals(Object o)
    
    {
    	return name.equals(((Country_1)o).name);
    	
    }
    
    public int hashCode()
    
    {
    	return name.hashCode();
    	
    }
}