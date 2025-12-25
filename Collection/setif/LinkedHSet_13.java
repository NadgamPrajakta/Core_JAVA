package setif;
import java.util.*;

public class LinkedHSet_13 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<Movie_4> set=new LinkedHashSet<Movie_4>();
        
        set.add(new Movie_4(1));
        Object[] arr=set.toArray();
        
        System.out.println(arr.length);
    }
}


class Movie_4 {
	
    int id;
    
    Movie_4(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Movie_4)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}