package setif;
import java.util.*;

public class HashSet_13 {
	
    public static void main(String[] args){
    	
        HashSet<Movie> set=new HashSet<Movie>();
        
        set.add(new Movie(1));
        Object[] arr=set.toArray();
        System.out.println(arr.length);
    }
}


class Movie {
    int id;
    
    Movie(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Movie)o).id;
    	
    }
    
    public int hashCode()
    
    {return id;
    
    }
}
