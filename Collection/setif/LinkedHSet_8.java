package setif;
import java.util.*;

public class LinkedHSet_8 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Mobile_5> set=new LinkedHashSet<Mobile_5>();
        
        set.add(new Mobile_5("iPhone"));
        set.add(new Mobile_5("Samsung"));
        set.add(new Mobile_5("Redmi"));
        set.add(new Mobile_5("Oppo"));
        set.add(new Mobile_5("Vivo"));
        
        Iterator<Mobile_5> it=set.iterator();
        
        while(it.hasNext())
            System.out.println(it.next().name);
    }
}


class Mobile_5 {
	
    String name;
    
    Mobile_5(String n)
    
    {
    	name=n;
    	
    }

    public boolean equals(Object o)
    
    {
    	return name.equals(((Mobile_5)o).name);
    	
    }
    
    public int hashCode()
    
    {
       return name.hashCode();
       
    }
}