package setif;
import java.util.*;

public class LinkedHSet_10 {
	
    public static void main(String[] args){
    	
        LinkedHashSet<User_4> s1=new LinkedHashSet<User_4>();
        
        LinkedHashSet<User_4> s2=new LinkedHashSet<User_4>();
        
        s2.add(new User_4(2));
        s1.addAll(s2);
        
        System.out.println(s1.size());
    }
}



class User_4 {
	
    int id;
    
    User_4(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((User_4)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}