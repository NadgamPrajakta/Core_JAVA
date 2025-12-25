package setif;
import java.util.*;

public class HashSet_10 {
	
    public static void main(String[] args){
    	
        HashSet<User> s1=new HashSet<User>();
        
        HashSet<User> s2=new HashSet<User>();
        
        s1.add(new User(1));
        s2.add(new User(2));
        s1.addAll(s2);
        System.out.println(s1.size());
    }
}


class User {
    int id;
    
    User(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((User)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}
