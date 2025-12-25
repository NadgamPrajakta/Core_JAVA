package setif;
import java.util.*;

public class HashSet_11 {
	
    public static void main(String[] args){
    	
        HashSet<Teacher> s1=new HashSet<Teacher>();
        
        HashSet<Teacher> s2=new HashSet<Teacher>();
        
        Teacher t=new Teacher(1);
        s1.add(t);
        s2.add(t);
        s1.removeAll(s2);
        System.out.println(s1.size());
    }
}


class Teacher {
    int id;
    
    Teacher(int i)
    
    {
    	id=i;
    	
    }

    public boolean equals(Object o)
    
    {
    	return id==((Teacher)o).id;
    	
    }
    
    public int hashCode()
    
    {
    	return id;
    	
    }
}