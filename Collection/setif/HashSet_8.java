package setif;
import java.util.*;

public class HashSet_8 {
	
    public static void main(String[] args){
    	
        HashSet<Mobile> set=new HashSet<Mobile>();
        
        set.add(new Mobile("Samsung"));
        Iterator<Mobile> it=set.iterator();
        while(it.hasNext())
            System.out.println(it.next().name);
    }
}


class Mobile {
	
    String name;
    
    Mobile(String n)
    
    {
    	name=n;
    	
    }

    public boolean equals(Object o)
    
    {
    	return name.equals(((Mobile)o).name);
    	
    }
    
    public int hashCode()
    {
    	return name.hashCode();
    	
    }
}
